/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary.fabricaMuñecos;

import java.awt.Graphics;

/**
 *
 * @author cesar
 */
public class Normal extends fabMuñecos{
    
    private muñNormal no;

    public Normal(){    
        createMuñecos();
    }
    
    @Override
    public void createMuñecos() {
        no= new muñNormal();       
    }

    @Override
    public void incrementIncorrectGuesses() {
        no.incrementIncorrectGuesses();
    }

    @Override
    public void setIncorrectGuesses(int incorrectGuesses) {
        no.setIncorrectGuesses(incorrectGuesses);
    }
    public muñNormal getMuNormal(){
        return no;
    }
    
}
