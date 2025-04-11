/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {

    public static void main(String[] args) {
        Palindromo palin = new Palindromo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine(); // Lê a linha de entrada do usuário

        // Empilha cada caractere da string de entrada
        for (char letra : input.toCharArray()) {
            palin.empilhar(letra);
        }
        palin.palindromoverify();

    }
}
