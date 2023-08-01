package figure;

import figure.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = 4;
        double c = 5;
        Figure acuteAngleTriangle = new Triangle(a, b, c);
        System.out.println(acuteAngleTriangle.GetPerimeter());
        System.out.println(acuteAngleTriangle.GetSquare());
        Figure RBTriangle = new IsoscelesTriangle(a, b);
        System.out.println(RBTriangle.GetPerimeter());
        System.out.println(RBTriangle.GetSquare());
        Figure rstriangle = new RSTriangle(a);
        System.out.println(rstriangle.GetPerimeter());
        System.out.println(rstriangle.GetSquare());
    }
}