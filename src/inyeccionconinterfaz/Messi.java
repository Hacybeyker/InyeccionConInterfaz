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
public class Messi {
    
    private IEquipo equipo;
    
    public Messi(IEquipo equipo){
        this.equipo = equipo;
    }
    
    public void mostrarEquipo(){
        equipo.mostrarEquipo();
    }
}
