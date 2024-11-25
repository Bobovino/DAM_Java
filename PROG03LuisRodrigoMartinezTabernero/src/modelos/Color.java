/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author bobovino
 */

public class Color {
    
    /* Usamos private para encapsular, 
    luego podremos acceder a ellos con setters/getters */
    private int int_rojo;
    private int int_verde;
    private int int_azul;
    
    //Nuestras constantes, en mayúsculas, públicas y estáticas 
    public static final int MINIMO = 0;    
    public static final int MAXIMO = 255;
    
    /* Constructor sin parámetros, los constructores 
    llevan el mismo nombre de la clase. */
    public Color(){

        /* El color negro, es la ausencia de color, 
        luego tendrá el valor 0 en los tres componentes RGB. */
        this.int_rojo = MINIMO;
        this.int_verde = MINIMO;
        this.int_azul = MINIMO;
    }

    //Constructor con parámetros.
    public Color(int int_rojo,int int_verde,int int_azul){
        //Validamos con el método que hemos creado más abajo
        if (colorValido(int_azul)&&colorValido(int_rojo)&&colorValido(int_verde)){
            this.int_rojo=int_rojo;    
            this.int_verde=int_verde;
            this.int_azul=int_azul;
        } else {
            throw new IllegalArgumentException("Valores de intensidad de color no válidos");
        }
    }
    
    /* Haciendo click derecho en Netbeans, 
    podemos insertar getters y setters para las variables privadas */

    public int get_Int_rojo() {
        return int_rojo;
    }

    public void set_Int_rojo(int int_rojo) {
        //No sé si también se puede hacer con el operador ternario, yo es que vengo de javascript
        if (colorValido(int_rojo)) {
            this.int_rojo = int_rojo;
        } else {
            //Parece que hay que lanzar un error así??? Yo hubiese puesto un System.out.println y sería feliz.
            throw new IllegalArgumentException("Valor de intensidad de color no válido");
        }
    }

    public int get_Int_verde() {
        return int_verde;
    }

    //Igual que el otro setter
    public void set_Int_verde(int int_verde) {
        if (colorValido(int_verde)) {
            this.int_verde = int_verde;
        } else {
            throw new IllegalArgumentException("Valor de intensidad de color no válido");
        }
    }

    public int get_Int_azul() {
        return int_azul;
    }

    //Igual que el otro setter
    public void set_Int_azul(int int_azul) {
        if (colorValido(int_azul)) {
            this.int_azul = int_azul;
        } else {
            throw new IllegalArgumentException("Valor de intensidad de color no válido");
        }
    }

    //Cambiamos el método toString, 
    @Override //creo que esto se llama decorador según Google
    public String toString(){
        return "[" + int_rojo + ", " + int_verde + ", " + int_azul + "]";
    }

    private boolean colorValido(int intensidad){
        return intensidad >= MINIMO && intensidad <= MAXIMO;
    }
}
