/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary.fabricaMuñecos;

/**
 *
 * @author cesar
 */
public class colorado extends fabMuñecos {
    
    private munColorido mun;
    public colorado(){
        createMuñecos();
    
    }

    @Override
    public void createMuñecos() {
        mun=new munColorido();        
    }
   
    @Override
    public void incrementIncorrectGuesses() {
        mun.incrementIncorrectGuesses();
    }

    @Override
    public void setIncorrectGuesses(int incorrectGuesses) {
        mun.setIncorrectGuesses(incorrectGuesses);
    }
    public munColorido getMuNormal(){
        return mun;
    }
}
