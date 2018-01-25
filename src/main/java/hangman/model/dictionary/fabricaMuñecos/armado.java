/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary.fabricaMuñecos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author cesar
 */
public interface armado {
    
    
    public abstract void paint(Graphics g);
    
    public abstract void incrementIncorrectGuesses();
    
    public abstract void setIncorrectGuesses(int incorrectGuesses);
    
}
