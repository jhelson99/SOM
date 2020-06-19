/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñodeclases;

/**
 *
 * @author JCO
 */
public class DiseñodeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Jugador jugador1 = new Jugador("Nombre1", "apellido1", "ci1", 20);
        Jugador jugador2 = new Jugador("Nombre2", "apellido2", "ci2", 20);
        Jugador jugador3 = new Jugador("Nombre3", "apellido3", "ci3", 20);
        
        Jugador[] jugadoresEquipo1 = new Jugador[3];
        jugadoresEquipo1[0] = jugador1;
        jugadoresEquipo1[1] = jugador2;
        jugadoresEquipo1[2] = jugador3;
        
        Equipo equipo1 = new Equipo("Equipo TT", "Varones", jugadoresEquipo1);
        Equipo[] equipos = new Equipo[1];
        equipos[0] = equipo1;
        
        Campeonato camp = new Campeonato("Campeonato Unifranz", equipos);
        camp.imprimirCamp();
        
    }
    
}
