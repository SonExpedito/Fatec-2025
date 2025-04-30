/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hash;

import java.util.Scanner;

/**
 *
 * @author alexe
 */
public class Main {
    public static void main(String[] args) {
        HashLinear tab = new HashLinear(7);
        try (Scanner le = new Scanner(System.in)) {
            double item;
            
            System.out.println("*******************************************************");
            System.out.println("Tabela HASH com tratamento de colisoes Linear (7 itens reais - double)");
            System.out.println("*******************************************************");
            
            for (int i = 0; i < 7; i++) {
                System.out.print("\nInserindo elemento " + (i + 1));
                System.out.print(" - Forneça valor real: ");
                item = le.nextDouble();
                tab.insere(item);
            }
            
            System.out.print("\n\nBuscando item\n>>> Forneça o item: ");
            item = le.nextDouble();
            int posBusca = tab.busca(item);
            if (posBusca != -1) {
                System.out.println("Item encontrado na posição " + posBusca);
            } else {
                System.out.println("Item não encontrado");
            }
            
            System.out.print("\n\nRemovendo item\n>>> Forneça o item: ");
            item = le.nextDouble();
            tab.apaga(item);
            
            System.out.println("\n\nImprimindo conteúdo:");
            tab.imprime();
            
            System.out.println("\n");
        }
    }
}


