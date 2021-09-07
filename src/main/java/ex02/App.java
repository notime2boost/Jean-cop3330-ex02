package ex02;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("What is the input string");
        String input = inp.nextLine();

        String lower ="";
        String total ="";

        for(int i = 0; i < input.length();i++){
            char thisChar = input.charAt(i);
            if (thisChar >= 97 && thisChar <=122){
                lower += thisChar;
            }
        }
        System.out.println(input +" has "+input.length()+" characters ");
    }
}
