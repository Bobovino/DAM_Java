/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


/**
 *
 * @author bobovino
 */

import modelos.Color;

public class Rectangulo {
    
    private double base;
    private double altura;
    //Usamos el tipo Color de la clase que hemos importado
    private Color color_borde;
    private Color color_fondo;
    
    //Uso double por si luego hay problemas de conversiones de tipos
    public static final double MINIMO= 0;

    public Rectangulo() {
        this.base = MINIMO;
        this.altura = MINIMO;
        this.color_borde = new Color(0, 0, 0); // Negro
        this.color_fondo = new Color(255, 255, 255); // Blanco
    }

    public Rectangulo(double base, double altura, Color color_borde, Color color_fondo) {
        if (valorPermitido(base,altura)) {
            this.base = base;
            this.altura = altura;
            this.color_borde = color_borde;
            this.color_fondo = color_fondo;
        } else {
            throw new IllegalArgumentException("Valores de base o altura no válidos");
        }
    }

    /* Con Netbeans click derecho puedes crear setters, getters,
    constructores y el override del método toString() */

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (valorPermitido(base, this.altura)) {
            this.base = base;
        } else {
            throw new IllegalArgumentException("Valor de base no válido");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        //Para comprobar si están dentro del valor permitido, usamos la altura que introducimos y la base ya presente con this.
        if (valorPermitido(this.base, altura)) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Valor de altura no válido");
        }
    }

    public Color get_Color_borde() {
        return color_borde;
    }

    public void set_Color_borde(Color color_borde) {
        this.color_borde = color_borde;
    }

    public Color get_Color_fondo() {
        return color_fondo;
    }

    public void set_Color_fondo(Color color_fondo) {
        this.color_fondo = color_fondo;
    }

    @Override
    public String toString() {
        return  "Base=" + base + ", Altura=" + altura + ", Color del borde=" + color_borde + ", Color del fondo=" + color_fondo;
    }
    
    //No hace falta pasar los argumentos
    public double calcularArea() {
        return base*altura;
    }
    
    public double calcularPerimetro() {
        return 2*(base+altura);
    }

    public boolean valorPermitido(double base, double altura) {
        //Comparamos la base y altura con el mínimo y devolvemos un booleano
        return base>=MINIMO && altura>=MINIMO;
    }

    
}
