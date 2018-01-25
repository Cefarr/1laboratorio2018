/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class caracterEspañol implements caracter{

    private List<Character> characterSet;
    
    public caracterEspañol(){
        characterSet = createCharacterSet();
    
    }
    
    @Override
    public List<Character> getCharacterSet() {
        return characterSet;
    }
           
    private List<Character> createCharacterSet() {
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65+26;
        char nu=(char)'Ñ';

        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        result.add((char)nu);
        return result;
    }
}
