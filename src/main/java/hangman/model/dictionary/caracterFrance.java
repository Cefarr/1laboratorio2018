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
public class caracterFrance implements caracter {
    
    private List<Character> characterSet;
     
    public caracterFrance(){
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
        char nu0=(char)'À';
        char nu1=(char)'È';
        char nu2=(char)'Ì';
        char nu3=(char)'Ò';
        char nu4=(char)'Ù';

        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        result.add(nu0);
        result.add(nu1);
        result.add(nu2);
        result.add(nu3);
        result.add(nu4);
        return result;
    }
    
}

