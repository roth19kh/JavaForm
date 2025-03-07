/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomixeJTextField;

import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author tharoth
 */
public class jFloatField extends JTextField {

    public jFloatField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //super.keyTyped(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                thisKeyTypedFloat(e);
            }
        });
    }

    private void thisKeyTypedFloat(KeyEvent e) {
        if (e.getKeyChar() == '.') {
            String text = this.getText();
            if (text.length() == 0) {
                this.setText("0.");
                e.consume();
            } else {
                if (text.contains(".")) {
                    e.consume();
                }
            }
        } else {
            if (!Character.isDigit(e.getKeyChar())) {
                e.consume();
        }
        }
    }
}