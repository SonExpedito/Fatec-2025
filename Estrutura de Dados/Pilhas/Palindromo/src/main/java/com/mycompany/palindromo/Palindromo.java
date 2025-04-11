/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindromo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Palindromo {

    char palavra[];
    char palavracopia[];
    int tamanho;
    int base;
    int topo;

    public Palindromo() {
        tamanho = 0;
        palavra = new char[10];
        palavracopia = palavra;
        base = topo = 0;

    }

    public void empilhar(char letra) {
        if (palavra.length == topo) {
            System.out.println("Não é possível adicionar");
            return;
        }
        palavra[topo] = Character.toLowerCase(letra);
        topo++;
        tamanho++;

    }

    public char desempilhar() {
        if (tamanho == 0) {
            System.out.println("Não existe nada para remover");
            return '\0'; 
        }

        char removido = palavra[topo - 1];
        topo--;
        tamanho--;
        return removido;
    }
    
    public void palindromoverify(){
        palavracopia = palavra;
        char palavrainvertida[] = new char[tamanho];
        
        for (int i = base ; i < tamanho ; i++){
               palavrainvertida[i] = desempilhar();
        }
        
        for (int i=base; i< tamanho; i++){
            if (palavracopia[i] != palavrainvertida[i]){
                System.out.println("Não é um Palindromo");
                return;
            }
        }
        
        System.out.println("É um palindromo");
        
    }

}
