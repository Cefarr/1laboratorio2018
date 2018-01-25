/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cesar
 */
public class Spanish extends Idiomas {
    
    
    
    private List<Character> characterSet;
    private SpanishDictionaryDataSource pr;
    private caracterEspañol carTer;
    
    public Spanish(){
        
        createDictionary();
        createCarachter();
        
    }
    @Override
    public List<String> getAvailableWords() {
        return pr.getAvailableWords();
    }
    
    
    public List<Character> getCharacterSet() {
        return carTer.getCharacterSet();
    }
    
    @Override
    public void createDictionary() {
        pr=new SpanishDictionaryDataSource();
        
      
    }

    @Override
    public void createCarachter() {
        carTer=new caracterEspañol();
        
    }
    
}
