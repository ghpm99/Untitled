/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitled;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Qualidade
 */
public class Draw {


    public static void setColor(Color arg0) {
	glColor3f(arg0.getRed(), arg0.getGreen(), arg0.getBlue());
    }

    public static void retanguloPreenchido(Color arg0, int x, int y, int largura, int altura) {
	
    }

    public static void texto(String arg0, int x, int y) {
	
    }

    public static void ponto(float x, float y) {
	glBegin(GL_POINTS);
	    glVertex2f(x, y);
	glEnd();

    }

    public static void linha(float x1, float y1, float x2, float y2) {
	glBegin(GL_LINES);
	    glVertex2f(x1, y1);
	    glVertex2f(x2, y2);
	glEnd();
    }

    public static void quadrado(float x, float y, float largura) {
	glBegin(GL_QUADS);
	    glVertex2f(x, y);
	    glVertex2f(x+largura, y);
	    glVertex2f(x+largura, y+largura);
	    glVertex2f(x, y+largura);
	glEnd();
	
    }

    public static void setFont(Font arg0) {
	
    }

    public static void setFont(String arg0, int estilo, int tamanho) {
	
    }

    public static void img(Image arg0, int x, int y) {
	
    }


}
