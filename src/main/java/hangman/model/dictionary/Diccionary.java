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
public interface Diccionary {
    
  public List<String> getAvailableWords();
  public List<Character> getCharacterSet();
    
    
    
    
    
}
