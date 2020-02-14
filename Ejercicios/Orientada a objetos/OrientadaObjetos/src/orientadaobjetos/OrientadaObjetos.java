/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientadaobjetos;
import java.util.Scanner;
/**
 *
 * @author Druko
 */
public class OrientadaObjetos {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Atributos
        String nombre;
        double u1,u2,u3,u4, res;
        String matricula;
        
        Scanner tecla= new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno");
        nombre= tecla.next();
        System.out.print("Ingrese la matricula del alumno");
        matricula= tecla.next();
        
        System.out.print("Ingrese la calificacion de la unidad 1");
        u1=tecla.nextDouble();
        System.out.print("Ingrese la calificacion de la unidad 2");
        u2=tecla.nextDouble();
        System.out.print("Ingrese la calificacion de la unidad 3");
        u3=tecla.nextDouble();
        System.out.print("Ingrese la calificacion de la unidad 4");
        u4=tecla.nextDouble();
        
        Calculos cal=new Calculos();
        res=cal.promedio(u1, u2, u3, u4);
        
        Usuario alumno=new Usuario(nombre,res,matricula);
        
        System.out.print("Alumno: "+alumno.nombre+"\nMatricula: "+alumno.matricula+"\nCalificacion del semestre: "+alumno.calificacion);
        
    }
    
}
