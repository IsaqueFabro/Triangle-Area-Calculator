package main;

import java.util.Scanner;
import model.Triangle;

public class Main {

    public static void main(String[] args) {
        // create scanner for user input
        Scanner scanner = new Scanner(System.in);
        // create a new Triangle object
        Triangle triangle = new Triangle();
        
        System.out.println("Triangle: " + triangle);  // prints triangle object

        // asks for the base of the triangle
        System.out.println("Enter the base: ");
        triangle.setBase(scanner.nextDouble());

        // asks for the height of the triangle
        System.out.println("Enter the height: ");
        triangle.setHeight(scanner.nextDouble());

        // prints the area of the triangle
        System.out.println("The area is: " + triangle.getArea());
    }
}
