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
public class SpanishDictionaryDataSource implements Diccionary{
    
    private List<Character> characterSet;
    static private String words[] = {
            "JUGADOR",
            "BALON",
            "FUTBOOL",
            "RANGO",
            "JUEGO",
            "DEL",
            "TAMBIEN",
            "DESPUES",
            "PRESIDENTE",
            "NUEVO",
            "ÑOÑO"
            
    };
    private List<String> availableWords;
    public SpanishDictionaryDataSource(){
        
        availableWords = Arrays.asList(words);
    }
    
    public List<String> getAvailableWords() {
        return Arrays.asList(words);
    }
    
}
