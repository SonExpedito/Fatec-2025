/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiraed;

/**
 *
 * @author alexe
 */
public class Main {

    static PrimeiraED primeiraED = new PrimeiraED();

    public static void main(String[] args) {
        // Preenchendo Vetor
        for (int i = 1; i <=9; i++) {
            primeiraED.adiciona(i);
        }

        primeiraED.getObjeto(10);
        primeiraED.getObjeto(9);
        primeiraED.getObjeto(2);
        // 

        primeiraED.adiciona(1, 4);

        primeiraED.contem(4);
        primeiraED.remove(1);
        primeiraED.adiciona(9, 11);
    }
}
