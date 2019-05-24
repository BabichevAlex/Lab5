/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 1710502
 */
public class Rectangle {
    public double side1,side2;
 
    public Rectangle(){}
 
    
    public double areaCalculator(double num1,double num2){
        side1 = (num1 * num2);
        return side1;
    }
 
    
    public double perimeterCalculator(double num1,double num2){
        side2 = (num1 + num2)*2;
        return side2;
    }
 
    public void viewResult(){
        System.out.println("Площадь прямоугольника: "+side1);
        System.out.println("Периметра прямоугольника: "+side2);
    }
}