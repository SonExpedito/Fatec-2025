/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        
        pilha.empilhar(5);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.empilhar(2);
        pilha.empilhar(1);
        pilha.desempilhar();
        pilha.mostrar();
    }
    
}
