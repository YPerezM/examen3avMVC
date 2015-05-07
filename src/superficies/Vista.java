/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author yperezmartinez
 */
public class Vista {

    /**
     * System.out Square
     *
     * @param controlador
     */
    public void verCuadrado(Modelo controlador) {
        System.out.println("Si el lado es: " + controlador.getLength() + " el area sera: " + controlador.getArea());
    }

    /**
     * System.out Rectangle
     *
     * @param controlador
     */
    public void verRectangulo(Modelo controlador) {
        System.out.println("Si la base es: " + controlador.getLength() + " y la altura: " + controlador.getHeight() + " el area sera: " + controlador.getArea());
    }

    /**
     * Salida por pantalla para el triangulo
     *
     * @param controlador
     */
    public void verTriangulo(Modelo controlador) {
        System.out.println("Si la base es: " + controlador.getLength() + " y la altura: " + controlador.getHeight() + " el area sera: " + controlador.getArea());
    }

    /**
     * Salida por pantalla para el circulo
     *
     * @param controlador
     */
    public void verCirculo(Modelo controlador) {
        System.out.println("Si el radio es: " + controlador.getLength() + " el area sera: " + controlador.getArea());
    }

}
