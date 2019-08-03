/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truss;
import UI.CreateTruss;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Wislo
 */
public class Truss extends JFrame{
    private Container c;
    private CardLayout cardLay;
    private CreateTruss pCreateTruss;
    
    public Truss(){
        init();
    }
    
    private void init(){
        this.c = getContentPane();
        this.cardLay = new CardLayout();
        c.setLayout(cardLay);
        c.setSize(1280,720);
        initPanels();
        setSize(1280,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setResizable(false);
        setVisible(true);
    }
    
    private void initPanels(){
        this.pCreateTruss = new CreateTruss();
        c.add(pCreateTruss, "Create");
        cardLay.show(c,"Create");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Truss();
    }
    
}
