package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1, number2, rezultat;
        String dia;

        System.out.println("Введіть перше число:");
        Scanner num1 = new Scanner(System.in);
        number1 = Double.parseDouble(num1.nextLine());

        System.out.println("Введіть друге число:");
        Scanner num2 = new Scanner(System.in);
        number2 = Double.parseDouble( num2.nextLine());

        System.out.println("Виберіть дію */+-");
        Scanner num3 = new Scanner(System.in);
        dia = num3.nextLine();3

        if (dia.equals("+")) {
             rezultat = number1 + number2;
        }else if(dia.equals("-")){
            rezultat = number1 - number2;
        }else if (dia.equals("*")) {
          rezultat = number1 * number2;
        }else if (dia.equals("/")){
            rezultat = number1/number2;
        }else{
            rezultat = 0;
        }



        System.out.println(rezultat);




    }   }