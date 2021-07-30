/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitled;

/**
 *
 * @author Qualidade
 */
public abstract class Nivel {
    
    private int id;
    
    public Nivel(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public abstract void render();
    
    public abstract void atualizar(float time);
    
    public abstract void atualizarFixo();
    
    public abstract void load();
    
    public abstract void unLoad();
    
}
