package com.feramaro.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner tp = new Scanner(System.in);

        System.out.print("Insira um Número: ");
        String numero = num.next();

        System.out.print("Insira o tipo do Número: \n1.Decimal\n2.Binário\n3.Hexadecimal\n4.Octal\nTipo: ");
        int tipo = tp.nextInt();

        switch(tipo){
            case 1:
                System.out.println("==========================================================");
                System.out.println("DEC: " + numero);
                System.out.println("BIN: " + Integer.toBinaryString(Integer.parseInt(numero)));
                System.out.println("HEX: " + Integer.toHexString(Integer.parseInt(numero)));
                System.out.println("OCT: " + Integer.toOctalString(Integer.parseInt(numero)));
                System.out.println("==========================================================");
                break;
            case 2:
                System.out.println("==========================================================");
                System.out.println("DEC: " + Integer.toString(Integer.parseInt(numero, 2)));
                System.out.println("BIN: " + numero);
                System.out.println("HEX: " + Integer.toHexString(Integer.parseInt(numero, 2)));
                System.out.println("OCT: " + Integer.toOctalString(Integer.parseInt(numero, 2)));
                System.out.println("==========================================================");
                break;
            case 3:
                System.out.println("==========================================================");
                System.out.println("DEC: " + Integer.parseInt(numero, 16));
                System.out.println("BIN: " + Integer.toBinaryString(Integer.parseInt(numero, 16)));
                System.out.println("HEX: " + numero);
                System.out.println("OCT: " + Integer.toOctalString(Integer.parseInt(numero, 16)));
                System.out.println("==========================================================");
                break;
            case 4:
                System.out.println("==========================================================");
                System.out.println("DEC: " + Integer.parseInt(numero, 8));
                System.out.println("BIN: " + Integer.toBinaryString(Integer.parseInt(numero, 8)));
                System.out.println("HEX: " + Integer.toHexString(Integer.parseInt(numero, 8)));
                System.out.println("OCT: " + numero);
                System.out.println("==========================================================");
                break;
            default:
                System.out.println("==========================================================");
                System.out.println("TIPO INCORRETO, PROGRAMA FINALIZADO");
                System.out.println("==========================================================");


        }
    }
}
