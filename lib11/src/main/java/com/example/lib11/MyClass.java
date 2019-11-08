package com.example.lib11;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] s) {
        int x;
        int y ;
        int z ;
        int t ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Three Number:");

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if (x > y)
        {
            t = x;
            x = y;
            y = t;
        }

        if (x > z)
        {
            t = x;
            x = z;
            z = t;
        }

        if (y>z)
        {
            t = y;
            y = z;
            z = t;
        }
        System.out.println(x + "," + y + "," + z);
    }
}
