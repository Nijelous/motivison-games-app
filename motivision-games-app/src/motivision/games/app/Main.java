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
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import pages.Home;
import pages.Page;
import revision.tool.Start;

public class Main extends JFrame implements ActionListener{
GridBagConstraints c = new GridBagConstraints();
public int WIDTH, HEIGHT;
public Start start;
public Home home;
private Page currentPage;


public Main(String str) {
super(str);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(250, 100, 800, 800);
setVisible(true);
WIDTH = getSize().width;
HEIGHT = getSize().height;
getContentPane().setBackground(Color.BLACK);
setLayout(new GridBagLayout());
start = new Start(this);
home = new Home(this);
setPage(start);
start.start();
addComponentListener(new ComponentAdapter(){

@Override
public void componentResized(ComponentEvent e) {
Dimension d = e.getComponent().getSize();
WIDTH = d.width;
HEIGHT = d.height;
currentPage.paint(getContentPane().getGraphics());
}
});
}

JButton b1;
private static final long serialVersionUID = 4828986370709041989L;

public static void main(String[] args) {
new Main("Project");
}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getActionCommand().equals("Start Game")) {
setPage(home);
}
}
public void setPage(Page page){
getContentPane().removeAll();
currentPage = page;
page.paint(getContentPane().getGraphics());
}
}
