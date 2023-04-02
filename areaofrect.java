package nitsass;

import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("The area of the rectangle is: " + length*width);
    }
}
