/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PilihKendaraan extends JFrame {

private JTextField jTextField;
    private JButton tombolMotor, tombolMobil;
    private JTextArea jTextArea;
    
    public PilihKendaraan(){
        userInterface();
    }

    private void userInterface(){
        setTitle("Rental Kendaraan");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(250, 30));
        jp.add(jTextField);
        
        tombolMotor = new JButton("Motor");
        jp.add(tombolMotor);
        
        tombolMobil = new JButton("Mobil");
        jp.add(tombolMobil);
        
        jTextArea = new JTextArea();
        jTextArea.setPreferredSize(new Dimension(250, 60));
        jp.add(jTextArea);
        
        getContentPane().add(jp);
    }
}