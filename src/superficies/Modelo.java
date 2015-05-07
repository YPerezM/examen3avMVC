/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author yperezmartinez
 */
public class Modelo {

    public float height,
            /**
             *
             */
            length,
            /**
             *
             */
            area;

    /**
     * Circle and Square Constructor
     *
     * @param length
     * @param area
     */
    public Modelo(float length, float area) {
        this.length = length;
        this.area = area;
    }

    /**
     * Triangle and square constructor
     * 
     *
     * @param height
     * @param length
     * @param area
     */
    public Modelo(float height, float length, float area) {
        this.height = height;
        this.length = length;
        this.area = area;
    }

    /**
     *
     */
    public Modelo() {
    }

    /**
     *
     * @return
     */
    public float getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public float getLength() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     *
     * @return
     */
    public float getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(float area) {
        this.area = area;
    }

}
