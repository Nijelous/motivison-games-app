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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;

import javax.swing.JButton;

import com.a.project.Main;

public class Home implements Page{
GridBagConstraints c = new GridBagConstraints();

JButton b1;
Main main;

public Home(Main main) {
this.main = main;
}
@Override
public void paint(Graphics g){
g.setColor(new Color(0xfff8af));
System.err.println(main.WIDTH);
g.fillRect(0, 0, main.WIDTH, main.HEIGHT);
g.setColor(Color.GREEN);
g.fillRect(200, 200, 500, 600);
g.setColor(Color.RED);
g.fillRect(10, 10, 300, 400);
}
}
