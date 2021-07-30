/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitled;

import java.util.Properties;

/**
 *
 * @author Qualidade
 */
public class Config {
    
    Properties pro;
    
    public Config(){
        pro = new Properties();
        
    }

    private static int largura,altura;
    private static boolean redimensionavel;
    private static boolean semBordas;
    private static String titulo;
    
    private class Default{

        private static final int LARGURA = 500;
        
        private static final int ALTURA = 500;
        
        private static final String TITULO = "Untitled";        
        
        private static final boolean SEMBORDAS = false;
    }
    
   public static int getLargura(){
       if(largura <= 0)
           largura = Default.LARGURA;
       return largura;
   }
    
   public static int getAltura(){
       if(altura <= 0){
           altura = Default.ALTURA;
       }
       return altura;
   }
   
   public static boolean getRedimensionavel(){
       return redimensionavel;
   }
   
    public static boolean getBordas(){
       return semBordas;
   }
   
   public static String getTitulo(){
       if(titulo == null){
           titulo = Default.TITULO;
       }
       return titulo;
   }
}
