/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truss;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Wislo
 */
public class Member {
    private String name;
    private Joint[] ends;
    
    public Member(Joint from, Joint to){
        this.ends = new Joint[2];
        ends[0] = from;
        ends[1] = to;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine(ends[0].getX(), ends[0].getY(), ends[1].getX(), ends[1].getY());
    }
    
    
    
    
}
