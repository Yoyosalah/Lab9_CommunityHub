/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author mikel
 */
public abstract class Window extends javax.swing.JFrame {

    //static JPanel pan = new JPanel();
    public void prepare(String title) {
        this.setTitle(title);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setUndecorated(true);

        
        //set background
        JPanel pane = (JPanel) this.getContentPane();
        pane.setBackground(new Color(230, 230, 240));
        
        for (Component comp : this.getContentPane().getComponents()) {
            if (comp instanceof JPanel) {
                JPanel panel = (JPanel) comp;
                panel.setBackground(new Color(230, 230, 240));  
                break;  // Exit once the 1st panel is found and updated
            }
        }
         
        this.setLayout(new GridBagLayout());
        setFonts(this);
        //JPanel panel = (JPanel) this.getContentPane();
        //panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        this.setVisible(true);

    }

    public static void setFonts(Component element) {
        if (element instanceof JLabel || element instanceof JButton
                || element instanceof JTextField || element instanceof JTextArea) {

            Font currentFont = element.getFont();
            Font font = new Font("Roboto", Font.BOLD, currentFont.getSize());
            element.setFont(font);
        }

        //set buttons view
        if (element instanceof JButton) {
            element.setCursor(new Cursor(Cursor.HAND_CURSOR));
            //((JButton) element).setToolTipText("Click");

  //unify the button color and add hover effect          
/*            
            ((JButton) element).setBackground(new Color(38, 38, 38));
            ((JButton) element).setForeground(Color.WHITE);

            //apply effect when mouse hover 
            ((JButton) element).addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    ((JButton) element).setBackground(new Color(60, 120, 170)); // light blue
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    ((JButton) element).setBackground(new Color(38, 38, 38));
                }
            });
*/
        }

        //recursive call for panels 
        if (element instanceof Container) {
            for (Component child : ((Container) element).getComponents()) {
                setFonts(child);
            }
        }
    }

}
