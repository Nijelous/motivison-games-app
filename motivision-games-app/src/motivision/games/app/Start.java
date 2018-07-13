/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motivision.games.app;

/**
 *
 * @author Alex
 */
import motivision.games.app.Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JLabel;

import pages.Page;

public class Start implements Page{
GridBagConstraints c = new GridBagConstraints();
JButton b1;
Main main;
public Start(Main main){
this.main = main;
}
void start() {
main.getContentPane().removeAll();
JLabel menu = new JLabel("Title", JLabel.CENTER);
menu.setFont(new Font("Castellar", Font.BOLD,200));
menu.setForeground(Color.WHITE);
JLabel space = new JLabel(" ", JLabel.CENTER);
space.setFont(new Font("Arial", Font.BOLD,100));
b1 = new JButton("Start Game");
b1.addActionListener(main);
b1.setFont(new Font("Arial", 1, 50));
c.gridy = 0;
main.add(menu,c);
c.gridy = 1;
main.add(space,c);
c.gridy = 2;
main.add(b1,c);
main.revalidate();
main.repaint();
}
public void paint(Graphics g){}

}
    
