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
public class noViolento extends fabMuñecos{

    
    private munNoViolento mon;
    public noViolento(){
        createMuñecos();
    }
    
    
    @Override
    public void createMuñecos() {
        mon= new munNoViolento();
        
    }



    @Override
    public void incrementIncorrectGuesses() {
        mon.incrementIncorrectGuesses();
    }

    @Override
    public void setIncorrectGuesses(int incorrectGuesses) {
        mon.setIncorrectGuesses(incorrectGuesses);
    }
    public munNoViolento getMuNormal(){
        return mon;
    }
    
}
