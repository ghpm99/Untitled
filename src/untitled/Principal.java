/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitled;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Qualidade
 */
public class Principal {

    public enum Status {

	INICIANDO(0), CARREGANDO(1), EXECUTANDO(2), PAUSADO(3), SAINDO(4);

	Status(int a) {
	    this.status = a;
	}
	int status;

	public int getStatus() {
	    return status;
	}
    }

    Principal() {
	status = Status.INICIANDO;
	criarJanelaGL();
	status = Status.CARREGANDO;
	antes = System.nanoTime();
	visivel = false;
	iniciar();
	nivelAtual = new Carregar();
	nivelAtual.load();

	loop();
    }

    private Status status;

    private Nivel nivelAtual;

    private float antes, depois, delta;
    private int fps, frames;
    private boolean visivel;

    /**
     * @param args the command line arguments
     */
    private void criarJanelaGL() {
	try {
	    Display.setTitle(Config.getTitulo());
	    Display.setResizable(Config.getRedimensionavel());
	    Display.setDisplayMode(new DisplayMode(Config.getLargura(), Config.getAltura()));
	    Display.setFullscreen(false);
	    Display.create();
	    

	} catch (Exception e) {

	}
    }

    private void iniciar() {
	glMatrixMode(GL_PROJECTION);

	glLoadIdentity();

	glOrtho(0, 500, 0, 500, 1, -1);

	glMatrixMode(GL_MODELVIEW);
    }

    private void loop() {
	status = Status.EXECUTANDO;

	while (status == Status.EXECUTANDO && !Display.isCloseRequested()) {

	    antes = System.nanoTime() / 1000000000.0f;

	    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

	    render();
	    atualizar(depois);

	    if (fps < 60) {
		//baixo
	    } else if (fps > 60 && fps < 120) {
		//medio
	    } else {
		//alto
	    }

	    if (delta >= 1.0f) {
		delta = 0;
		fps = frames;
		frames = 0;
		atualizarFixo();
	    } else {
		delta += depois;
		frames++;
	    }

	    if (visivel) {
		//Draw.setFont("TimesRoman", Font.BOLD, 14);
		//Draw.texto("FPS: " + fps, Config.getLargura() - 70, 40);

		//desenha fps
	    }

	    //System.out.println(depois);
	    Display.update();

	    depois = (System.nanoTime() / 1000000000.0f) - antes;

	}
	nivelAtual.unLoad();
	Display.destroy();
	System.exit(0);

    }

    private void render() {
	nivelAtual.render();
    }

    private void atualizar(float deltaTime) {
	if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
	    status = Status.SAINDO;
	}

	if (Keyboard.isKeyDown(Keyboard.KEY_F12)) {
	    //mostrarFPS(!visivel);
	    visivel = !visivel;
	}

	nivelAtual.atualizar(deltaTime);
    }

    private void atualizarFixo() {
	System.out.println(fps);
	nivelAtual.atualizarFixo();
    }

    public void mostrarFPS(boolean arg0) {
	visivel = arg0;
    }

    public void setNivel(Nivel arg0) {
	if (arg0.getId() != nivelAtual.getId()) {
	    nivelAtual.unLoad();
	    nivelAtual = arg0;
	    nivelAtual.load();
	}
    }

}
