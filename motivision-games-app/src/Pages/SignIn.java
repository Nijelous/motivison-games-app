/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

/**
 *
 * @author Alex
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;

import motivision.games.app.Main;
public class SignIn extends KeyAdapter implements Page{
    
    
    Main main;
    Rectangle uI = new Rectangle(200,200,250,30);
    String username = "";
    Graphics g;
    
    public SignIn(Main main, Graphics g) {
        this.main = main;
        this.g = g;
        System.out.println("e");
        main.addKeyListener(this);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(new Color(0x555731));
        g.fillRect(0, 0, main.WIDTH, main.HEIGHT);
        g.setColor(Color.WHITE);
        g.fillRect(uI.x, uI.y, uI.width, uI.height);
        g.setColor(Color.black);
        g.drawString(username, uI.x, uI.y+uI.height);
        System.out.println(username);
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        System.out.print("e");
        username = "" + e.getKeyChar();
        System.out.println(e.getKeyChar());
        main.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("e");
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
