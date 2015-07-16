package com.company;

import com.sun.tools.javac.parser.ScannerFactory;
import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {

        int x=0,y=0;
        int X,Y;
        int rover=1;
        System.out.println("enter the value of x");
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        System.out.println("enter the value of y");
        Y=input.nextInt();
        System.out.println("enter the rovers initial position");
        String iposition=input.next();
        char a=iposition.charAt(0);
        char b=iposition.charAt(1);
        char c=iposition.charAt(2);
        movetopos(X, Y, a, b, c);




    }
    public static void movetopos(int X,int Y,char a,char b,char c)
    {
        int a1=Character.getNumericValue(a);
        int b1=Character.getNumericValue(b);
        char c1=c;

        System.out.println("enter the series of instructions");
        Scanner input=new Scanner(System.in);
        String ins=input.next();
        int length=ins.length();
        int i=0;
        char movement;
        while(i!=length) {
            movement = ins.charAt(i);
            if (movement == 'l') {
                if (c1 == 'n')
                    c1 = 'w';
                else if (c1 == 'w')
                    c1 = 's';
                else if (c1 == 's')
                    c1 = 'e';
                else if (c1 == 'e')
                    c1 = 'n';
            } else if (movement == 'r') {
                if (c1 == 'n')
                    c1 = 'e';
                else if (c1 == 'e')
                    c1 = 's';
                else if (c1 == 's')
                    c1 = 'w';
                else if (c1 == 'w')
                    c1 = 'n';
            } else if (movement == 'm') {
                if (a1 > X || b1 > Y)
                    System.out.println("invalid values");
                else if (a1 != 5 && b1 != 5) {
                    a1++;
                    b1++;
                }

            }
            i++;
        }
            System.out.println(a1 + " " + b1 + " " + c1);
    }
}
