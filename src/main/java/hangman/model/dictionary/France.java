/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary;

import java.util.List;

/**
 *
 * @author cesar
 */
public class France extends Idiomas{
    
    private List<Character> characterSet;
    private FranceDictionaryDataSource pr;
    public France(){
        pr=new FranceDictionaryDataSource();
    }

    @Override
    public void createDictionary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createCarachter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getAvailableWords() {
        return pr.getAvailableWords();
    }
    @Override
    public List<Character> getCharacterSet() {
        return pr.getCharacterSet();
    }
}
