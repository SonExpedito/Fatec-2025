/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deque;

/**
 *
 * @author alexe
 */
public class Deque {

    private No inicio;
    private No fim;

     public Deque() {
        this.inicio = null; // Inicialmente vazio
        this.fim = null;
    }

    public void EnqueueL(Object elemento) {
        No novoNo = new No();
        novoNo.item = elemento;
        if (vazio()) {
            inicio = fim = novoNo;
        } else {
            novoNo.prox = inicio;
            inicio = novoNo;
        }
    }

    public void EnqueueR(Object elemento) {
        No novoNo = new No();
        novoNo.item = elemento;
        if (vazio()) {
            inicio = fim = novoNo;
        } else {
            
            fim.prox = novoNo;
            fim = novoNo;

        }
    }

    public Object DequeueL() throws Exception {
        if (vazio()) {
            throw new Exception("A fila está vazia");
        }
        Object primeiro = inicio.item;
        inicio = inicio.prox;
        if (inicio == null) { // Se a fila ficou vazia
            fim = null;
        }
        System.out.println("O objeto " + primeiro + " saiu da fila.");
        return primeiro;
    }

    public Object DequeueR() throws Exception {
        if (vazio()) {
            throw new Exception("A fila está vazia");
        }

        Object removido = fim.item;

        if (inicio == fim) { // Se houver apenas um elemento
            inicio = fim = null;
        } else {
            No atual = inicio;
            while (atual.prox != fim) { // Percorre até encontrar o penúltimo nó
                atual = atual.prox;
            }
            fim = atual;
            fim.prox = null;
        }

        System.out.println("O objeto " + removido + " saiu da fila.");
        return removido;
    }

    public boolean vazio() {
        return inicio == null;
    }

    public void imprime() {
        No auxiliar = inicio;
        while (auxiliar != null) {
            System.out.println(auxiliar.getItem());
            auxiliar = auxiliar.getProx(); // Percorre um por um
        }
    }
}
