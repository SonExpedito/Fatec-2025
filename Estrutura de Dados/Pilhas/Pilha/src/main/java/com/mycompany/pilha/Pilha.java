/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pilha {

    int base;
    int topo;
    int pilha[];
    int tamanho;
    int qtdElementos;

    /* //Pilha segue no estilo de uma torre, em que a parte de cima é colocada
        posteriomente
    Entretanto é a primeira a ser removida
    /
     */
    public Pilha(int tamanhoPilha) {
        tamanho = tamanhoPilha;
        pilha = new int[tamanho];
        base = topo = 0;
        qtdElementos = 0;
    }

    public void empilhar(int item) {
        if (estacheia()) {
                System.out.println("Não é possível adicionar");
        }
        pilha[topo] = item;
        topo++;
        qtdElementos++;

    }

    public int desempilhar () {
        if (qtdElementos == 0){
            System.out.println("Não existe nada para remover");
            return -1 ;
        }
        
        int removido = pilha[topo-1];
        topo--;
        qtdElementos--;  
        
        return removido;
    }

    public Boolean estacheia() {
        return qtdElementos == tamanho;
    }
    
    public void mostrar() {
        if (qtdElementos == 0){
            System.out.println("Não existe nada para exibir");
            return;
        }
        
        String elementos = "";
        for ( int i = topo-1; i>= 0 ; i--){
            elementos += pilha[i] + " | ";
        }
      
        System.out.println(elementos);
    }
}
