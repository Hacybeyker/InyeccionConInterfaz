/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inyeccionconinterfaz;

/**
 *
 * @author
 * <AdvanceSoft - Osorio Perez Carlos Alfredo - advancesoft.trujillo@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Messi messi = new Messi(new Barcelona());
        messi.mostrarEquipo();
        
        Messi messi1 = new Messi(new RealMadrid());
        messi1.mostrarEquipo();
        
        Messi messi2 = new Messi(new ManchesterUnited());
        messi2.mostrarEquipo();
    
    }
    
}
