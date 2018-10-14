/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.awt.Graphics;
import java.awt.event.MouseListener;



/**
 *
 * @author Alex
 */
public interface Page extends MouseListener{
    public void paint(Graphics g);
    
    
}
