/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Animacao;

import untitled.Nivel;

/**
 *
 * @author Qualidade
 */
public class Animacao extends Nivel {

    Letra[] letras;
    public Animacao(){
        super(1);
    }
    
    @Override
    public void render() {
        for(Letra letra : letras){
            if(letra != null)
            letra.render();
        }
    }

    @Override
    public void atualizar(float time) {
        for(Letra letra : letras){
            if(letra != null)
            letra.atualizar(time);
        }
    }

    @Override
    public void atualizarFixo() {
       
    }

    @Override
    public void load() {
        letras = new Letra[5];
        letras[0] = new I(250,250);
    }

    @Override
    public void unLoad() {
        
    }
    
}
