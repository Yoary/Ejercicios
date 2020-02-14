package puntuacion;
import java.util.*;
public class Puntuacion {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double estrellas;
      System.out.println("Ingrese una puntuacion de 0 a 5 estrellas ");
      estrellas = sc.nextDouble();
      System.out.println("La puntuacion es");
      if(estrellas < 0 || estrellas > 5)
         System.out.println("Ingrese un numero valido");
      else if(estrellas==5)
           System.out.println("Excelente");
      else if (estrellas >= 4)
           System.out.println("Sobresaliente");
      else if (estrellas >= 3)
           System.out.println("Notable");
      else if (estrellas >= 2)
           System.out.println("Bueno");
      else if (estrellas >= 1)
           System.out.println("Suficiente");
      else
           System.out.println("Sin puntuacion");
    }
}