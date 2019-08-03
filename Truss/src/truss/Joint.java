/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truss;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author Wislo
 */
public class Joint {
    private String name;
    LinkedList<Member> connectedMembers = new LinkedList<>();
    private int x,y;
    private final int DIAMETER = 10;
    public final int OFFSET = -7;
    
    public Joint(int x, int y){
     this.x = x+OFFSET;
     this.y = y+OFFSET;
     //System.out.println("Joint created");
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
    
    public void setName(String name){
        this.name = name;
    }
}
