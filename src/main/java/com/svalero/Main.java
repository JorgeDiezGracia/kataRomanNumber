package com.svalero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 3000:");
        int num = Integer.parseInt(teclado.nextLine());

        ConversionARomanos conversor = new ConversionARomanos();
        System.out.println(conversor.conversionNumero(num));
    }
}