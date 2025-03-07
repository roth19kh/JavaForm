/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomixeJTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author tharoth
 */
public class JLetterField extends JTextField {

    public JLetterField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //super.keyTyped(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                thisLatterField(e);
            }

        });

    }

    private void thisLatterField(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (!Character.isLetter(e.getKeyChar())
                && !Character.isWhitespace(e.getKeyChar())) {
            e.consume();
        } else {

            if (getLength() >= 0) {
                String text = this.getText();
                if (text.length() >= getLength()) {
                    e.consume();
                }
            }
        }

    }

    private int length = -1;

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
}
