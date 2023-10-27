/*
 * File        : Abstract.java
 * Description : Java program to create an abstract class(Exercise to understand polymorphism)
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 27/10/2023
 * 
 */
package javalab;
public class Abstract {
        public static void main(String[] args) {
			Rectangle rectangle = new Rectangle();
			Triangle triangle = new Triangle();
			Hexagon hexagon = new Hexagon();
	        rectangle.numberOfSides();
	        triangle.numberOfSides();
	        hexagon.numberOfSides();
		}
 }
	    abstract class Shapes{
		abstract public void numberOfSides();
			
	    }
	    
	    class Rectangle extends Shapes{
		public void numberOfSides() {
		System.out.println("Number of sides of Rectangle = 4");
			}
		}
	    
	    class Triangle extends Shapes{
	    public void numberOfSides() {
	    System.out.println("Number of sides of Triangle  = 3");
		    }
	    }
	    
	class Hexagon extends Shapes{
		public void numberOfSides() {
			System.out.println("Number of sides of Hexagon   = 6");
			}
	    }

