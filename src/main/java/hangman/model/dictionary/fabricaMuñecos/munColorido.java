/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman.model.dictionary.fabricaMuñecos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author cesar
 */
public class munColorido extends JPanel implements armado{

   int incorrectCount;
    
    
    public munColorido(){
        incorrectCount=0;

    }
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();
        
        g.drawLine(10, panelHeight - 10, (panelWidth / 4) + 10, panelHeight - 10);
        g.drawLine(((panelWidth/4)/2) + 10, panelHeight - 10,((panelWidth/4)/2) + 10, 10);
        g.drawLine(((panelWidth/4)/2) + 10, 10, (panelWidth / 4) + 10, 10);
        g.drawLine((panelWidth / 4) + 10, 10, (panelWidth / 4) + 10, panelHeight / 6);
        
        
        if(incorrectCount > 0){
            g.setColor(Color.red);
            g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
            
        }
        if(incorrectCount > 1){
            g.setColor(Color.YELLOW);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2,(panelWidth / 4) + 10,(panelHeight/6)*3); // Torso
        }
        if(incorrectCount > 2){
            g.setColor(Color.PINK);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Left Arm
        }
        if(incorrectCount > 3){
            g.setColor(Color.ORANGE);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Right Arm
        }
        if(incorrectCount > 4){
            g.setColor(Color.WHITE);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg
        }
        if(incorrectCount > 5){
            g.setColor(Color.MAGENTA);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg        
        }
        
            
    }

    @Override
    public void incrementIncorrectGuesses() {
         incorrectCount++;
    }

    @Override
    public void setIncorrectGuesses(int incorrectGuesses) {
         this.incorrectCount = incorrectGuesses;
    }
    
    
    
    
    
}
