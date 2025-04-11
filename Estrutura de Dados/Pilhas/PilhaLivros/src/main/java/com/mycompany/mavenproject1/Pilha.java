/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pilha {

    Livro topo;

    public void push(Livro livro) {
        if (topo == null) {
            topo = livro;
            return;
        }
        
        livro.setAnterior(topo);
        topo = livro;
    }

    public Livro pop() {
        if (topo.getAnterior() == null) {
            System.out.println("Este e o ultimo item");
            Livro removido = topo;
            topo = null;
            return removido;
        }

        Livro removido = this.topo;
        this.topo = removido.getAnterior();
        return removido;
    }

    public Livro top() {
        return topo;
    }

    public void mostraLivros() {
        Livro atual = topo;
        do {
            System.out.println(atual);
            atual = atual.getAnterior();
        } while (atual != null);
        
        
    }
}
