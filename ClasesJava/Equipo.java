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
public class Equipo 
{

    private String NombreEquipo;
    private String categoria;
    private Jugador[] jugadores;

    public Equipo() {
    }

    public Equipo(String NombreEquipo, String categoria, Jugador[] jugadores)
    {
        this.NombreEquipo = NombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }
    
    public String getNombreEquipo()
    {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) 
    {
        this.NombreEquipo = NombreEquipo;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }
    
    public Jugador[] getJugadores() 
    {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) 
    {
        this.jugadores = jugadores;
    }
    public void imprimirEquipo()
    {
        System.out.println(this.NombreEquipo);
        System.out.println(this.categoria);
        for(int i=0; i<this.jugadores.length;i++)
        {
            System.out.println(jugadores[i].getNombreCompleto());
            System.out.println(jugadores[i].getApellidos());
            System.out.println(jugadores[i].getCi());
            System.out.println(jugadores[i].getEdad());
        }
        
    }
}
