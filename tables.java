package nitsass;

import java.util.Scanner;

public class tables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to get it's table: ");
        int num = scanner.nextInt();
        System.out.print("The table of the number " + num + "is:");
        for(int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
