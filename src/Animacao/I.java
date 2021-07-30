/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animacao;

import java.awt.Font;
import java.awt.event.KeyEvent;
import untitled.Draw;
import untitled.Teclado;

/**
 *
 * @author Qualidade
 */
public class I implements Letra {

    private int x, y, tamanho;

    public I(int x, int y) {
        this.x = x;
        this.y = y;
        tamanho = 32;
    }

    @Override
    public void render() {
        Draw.setFont("Edwardian Script ITC", Font.PLAIN, tamanho);
        Draw.texto("I", x, y);
    }

    @Override
    public void atualizar(float time) {
        if (Teclado.getInstance().isPressed(KeyEvent.VK_UP)) {
            tamanho++;
        }
        if (Teclado.getInstance().isPressed(KeyEvent.VK_DOWN)) {
            tamanho--;
        }
        System.out.println(tamanho);
    }

    @Override
    public void colisao() {

    }

}
