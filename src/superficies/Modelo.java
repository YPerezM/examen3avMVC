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

    float squareArea;
    float sideLength;
    float sideHeight;
    float rectangleArea;
    float baseLength;
    float height;
    float triangleArea;
    float radius;
    float circleArea;

    public Modelo() {
    }

    public Modelo(float squareArea, float sideLength, float sideHeight, float rectangleArea, float baseLength, float height, float triangleArea, float radius, float circleArea) {
        this.squareArea = squareArea;
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.height = height;
        this.triangleArea = triangleArea;
        this.radius = radius;
        this.circleArea = circleArea;
    }

    public float getSquareArea() {
        return squareArea;
    }

    public float getSideLength() {
        return sideLength;
    }

    public float getSideHeight() {
        return sideHeight;
    }

    public float getRectangleArea() {
        return rectangleArea;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public float getHeight() {
        return height;
    }

    public float getTriangleArea() {
        return triangleArea;
    }

    public float getRadius() {
        return radius;
    }

    public float getCircleArea() {
        return circleArea;
    }

    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }
    
    

}
