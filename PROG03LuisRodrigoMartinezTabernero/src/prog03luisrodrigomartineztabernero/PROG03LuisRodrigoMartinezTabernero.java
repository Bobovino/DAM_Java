/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog03luisrodrigomartineztabernero;

/**
 *
 * @author bobovino
 */

import modelos.Color;
import modelos.Rectangulo;

public class PROG03LuisRodrigoMartinezTabernero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 3.1 Visualiza la propiedad con el valor mínimo permitido sin instanciar la clase
       System.out.println("Valor mínimo permitido = " + Rectangulo.MINIMO);

       // 3.2 Instancia la clase Color creando un objeto denominado colorBorde
       Color colorBorde = new Color(124, 23, 57);

       // 3.3 Visualiza el contenido de todas las propiedades del objeto creado con una única sentencia
       System.out.println("Color del borde = " + colorBorde.toString());

       // 3.4 Instancia la clase Color creando un objeto denominado colorFondo con los valores por defecto
       Color colorFondo = new Color();

       // 3.5 Modifica el objeto creado con una intensidad de verde de 255 y de azul de 12
       colorFondo.set_Int_verde(255);
       colorFondo.set_Int_azul(12);

       // 3.6 Visualiza el contenido de todas las propiedades del objeto creado con una única sentencia
       System.out.println("Color del fondo = " + colorFondo.toString());

       // 3.7 Instancia la clase Rectangulo creando un objeto denominado rectangulo1 con los valores por defecto
       Rectangulo rectangulo1 = new Rectangulo();

       // 3.8 Modifica el objeto creado cambiando el valor de la base a 5,75 y el valor de la altura a 2,50
       rectangulo1.setBase(5.75);
       rectangulo1.setAltura(2.50);

       // 3.9 Visualiza el contenido de todas las propiedades del objeto creado con una única sentencia
       System.out.println("rectangulo1 = " + rectangulo1.toString());

       // 3.10 Instancia la clase Rectangulo creando un objeto denominado rectangulo2 
       Rectangulo rectangulo2 = new Rectangulo(4.50, 5.2, colorBorde, colorFondo);

       // 3.11 Visualiza el contenido de todas las propiedades del objeto creado con una única sentencia
       System.out.println("rectangulo2 = " + rectangulo2.toString());

       // 3.12 Visualiza el área y el perímetro de los dos rectángulos
       //He añadido el %.2f%n porque me daba unos decimales enormes cuando con la calculadora son sumas/multiplicaciones exactas.
       System.out.printf("Área de rectangulo1= %.2f%n", rectangulo1.calcularArea());
       System.out.printf("Área de rectangulo2= %.2f%n", rectangulo2.calcularArea());
       System.out.printf("Perímetro de rectangulo1= %.2f%n", rectangulo1.calcularPerimetro());
       System.out.printf("Perímetro de rectangulo2= %.2f%n", rectangulo2.calcularPerimetro());
   }
}