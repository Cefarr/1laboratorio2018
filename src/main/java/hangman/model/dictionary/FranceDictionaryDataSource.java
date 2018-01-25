/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cesar
 */
public class FranceDictionaryDataSource implements Diccionary{
    
    private List<Character> characterSet;
    private List<String> availableWords;
    static private String words[] = {
            "JOUEUR",
            "BALON",
            "FUTBOOL",
            "RANG",
            "JEU",
            "ÈTRE",
            "MOI",
            "ON",
            "DEUX",
            "OÙ"
    };
    
    public FranceDictionaryDataSource(){
        
        availableWords = Arrays.asList(words);
    }

    public List<String> getAvailableWords() {
        return Arrays.asList(words);
    }

}
