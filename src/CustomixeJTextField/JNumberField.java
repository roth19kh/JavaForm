/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomixeJTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.CharacterIterator;
import javax.swing.JTextField;

/**
 *
 * @author tharoth
 */
public class JNumberField extends JTextField {
    public JNumberField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                thisKeyTypeNumber(e);
            }
        });
    }

    private void thisKeyTypeNumber(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar())){
            e.consume();
        }
        else{
            if(digit>=0){
                String text = this.getText();
                 if (text.length()>=digit){
                     e.consume();
                 }
            }
        }
    }
    
    private int digit=-1;

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param degit the digit to set
     */
    public void setDegit(int degit) {
        this.digit = degit;
    }
}
