/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientadaobjetos;

/**
 *
 * @author Druko
 */
public class Usuario {
    
    //Atributos
    public String nombre;
    public double calificacion;
    public String matricula; 
    
    public Usuario(String nombre, double calificacion,String matricula)
    {
        this.nombre=nombre;
        this.calificacion=calificacion;
        this.matricula=matricula;
        
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public double getCalificacion()
    {
        return calificacion;
    }
    
}
