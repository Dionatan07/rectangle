package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = teclado.nextDouble();
        double height = teclado.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println();
        System.out.println(rectangle);

    }
}
