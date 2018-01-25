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
public class English extends Idiomas{

    
    private List<Character> characterSet;
    private EnglishDictionaryDataSource pr;
    private caracterEnglish carEn;
    
    public English(){
        createDictionary();
        createCarachter();
    }

    @Override
    public void createDictionary() {
        pr=new EnglishDictionaryDataSource();
    }

    @Override
    public void createCarachter() {
            carEn=new caracterEnglish();
    }

    @Override
    public List<String> getAvailableWords() {
        return pr.getAvailableWords();
    }

    public List<Character> getCharacterSet() {
        return carEn.getCharacterSet();
    }
    
}
