/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitled;

import java.awt.Color;

/**
 *
 * @author Qualidade
 */
public class Carregar extends Nivel {

    public Carregar() {

	super(0);

    }

    @Override
    public void render() {
	Draw.setColor(Color.white);
	Draw.quadrado(50.0f, 50.0f, 100.0f);
    }

    @Override
    public void atualizar(float time) {

    }

    @Override
    public void atualizarFixo() {

    }

    @Override
    public void load() {

    }

    @Override
    public void unLoad() {

    }

}
