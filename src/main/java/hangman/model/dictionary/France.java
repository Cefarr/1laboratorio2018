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
    private caracterFrance carFr;
    public France(){
        createDictionary();
        createCarachter();
    }

    @Override
    public void createDictionary() {
        pr=new FranceDictionaryDataSource();
    }

    @Override
    public void createCarachter() {
        carFr=new caracterFrance();
    }

    @Override
    public List<String> getAvailableWords() {
        return pr.getAvailableWords();
    }
    
    public List<Character> getCharacterSet() {
        return carFr.getCharacterSet();
    }
}
