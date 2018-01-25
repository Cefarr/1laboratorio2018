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
public class munNoViolento extends JPanel implements armado{

    int incorrectCount;
    
    
    public munNoViolento(){
        incorrectCount=0;

    }
    
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();
            g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2,(panelWidth / 4) + 10,(panelHeight/6)*3); // Torso
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2,(panelWidth / 4) + 10,(panelHeight/6)*3); // Torso            
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Left Arm

            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Right Arm
    
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg        
            
        if(incorrectCount > 0){
            //g.setColor(Color.red);
            g.setColor(Color.red);
            g.drawLine(((panelWidth / 4) + 10)-39,((panelHeight/6)*2)-70,((panelWidth / 4) + 10)-25,((panelHeight/6)*3)-50);
            

            
        }
        if(incorrectCount > 1){
            g.setColor(Color.YELLOW);
                        
            g.drawLine(((panelWidth / 4) + 10)-10,((panelHeight/6)*2)-70,((panelWidth / 4) + 10)-5,((panelHeight/6)*3)-50);
            
            

        }
        if(incorrectCount > 2){
            
            
        }
        if(incorrectCount > 3){
            //g.setColor(Color.ORANGE);
            
        }
        if(incorrectCount > 4){

        }
        if(incorrectCount > 5){

            
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
