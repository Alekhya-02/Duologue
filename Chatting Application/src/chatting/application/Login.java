/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatting.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author kared
 */
public class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(500, 30, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
 
    }
 
}