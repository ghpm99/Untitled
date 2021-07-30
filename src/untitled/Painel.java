/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitled;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Qualidade
 */
public class Painel extends JPanel {
    
    Image imagem;
    Graphics2D g2d;
    Graphics g;
    Painel(){
        this.setDoubleBuffered(true);
        imagem = this.createImage(Config.getLargura(), Config.getAltura());
        g2d = (Graphics2D) imagem.getGraphics();
        g2d.drawString("Teste", 250, 250);
        //g2d.dispose();
        imagem.flush();
        
        g.drawImage(imagem, Config.getLargura(), Config.getAltura(), null);
        g.dispose();
    }
    
}
