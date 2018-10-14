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
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Button;

import java.awt.event.MouseEvent;

import motivision.games.app.Main;

public class Home implements Page {

    GridBagConstraints c = new GridBagConstraints();

    Main main;
    Button rev;
    Button prog;
    Graphics g;

    public Home(Main main, Graphics g) {
        this.main = main;
        this.g = g;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(0xfff8af));
        System.err.println(main.WIDTH);
        g.fillRect(0, 0, main.WIDTH, main.HEIGHT);
        g.setColor(Color.GRAY);
        g.fillRect(main.WIDTH - 710, main.HEIGHT - 790, 570, 70);
        g.setColor(Color.GREEN);
        g.fillRect(main.WIDTH / 8, main.HEIGHT - 780, 550, 50);
        g.setColor(Color.RED);
        g.fillRect(240, 200, 300, 500);
        g.setColor(new Color(0x0055ff));
        g.fillRect(20, 170, 200, 100);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Castellar", Font.BOLD, 50));
        g.drawString("Revise", 40, 235);
        g.setColor(new Color(0x00ff33));
        g.fillRect(560, 170, 200, 100);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Castellar", Font.BOLD, 30));
        g.drawString("Check", 610, 210);
        g.drawString("Progress", 590, 240);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX(), y = e.getY();
        if (main.getCurrentPage() == this) {
            if (inBounds(x, y, 20, 205, 200, 100)) {
                g.setColor(new Color(0x0000ff));
                g.fillRect(20, 170, 200, 100);
                g.setColor(Color.WHITE);
                g.setFont(new Font("Castellar", Font.BOLD, 50));
                g.drawString("Revise", 40, 235);
                
            }
            if (inBounds(x, y, 560, 205, 200, 100)) {
                g.setColor(new Color(0x00dd00));
                g.fillRect(560, 170, 200, 100);
                g.setColor(Color.WHITE);
                g.setFont(new Font("Castellar", Font.BOLD, 30));
                g.drawString("Check", 610, 210);
                g.drawString("Progress", 590, 240);

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX(), y = e.getY();
        if (inBounds(x, y, 20, 205, 200, 100)) {
            main.setPage(new Start(main));
        }
        if (inBounds(x, y, 560, 205, 200, 100)) {
        }
    }

    private boolean inBounds(int mx, int my, int x, int y, int width, int height) {
        return mx >= x && mx <= x + width && my >= y && my <= y + height;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (main.getCurrentPage() == this) {
            g.setColor(new Color(0x0055ff));
            g.fillRect(20, 170, 200, 100);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Castellar", Font.BOLD, 50));
            g.drawString("Revise", 40, 235);
            g.setColor(new Color(0x00ff33));
            g.fillRect(560, 170, 200, 100);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Castellar", Font.BOLD, 30));
            g.drawString("Check", 610, 210);
            g.drawString("Progress", 590, 240);
            
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
