/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

import java.util.Arrays;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {

    private Object[] objetos = new Object[4];
    public int totalDeObjetos = 0;
    public int inicio = 0;
    public int fim = 0;

    public void enfileira(Object objeto) {

        if (totalDeObjetos == objetos.length) {
            System.out.println("Esta cheio, nao e possivel adicionar " +objeto);
            return;
        }

        passarFrente();
        objetos[fim] = objeto;
        fim = (fim + 1);
        totalDeObjetos++;

    }

    public Object desenfileira() {

        if (vazio()) {
            System.out.println("A Fila esta vazia");
            return null;

        }

        Object removido = objetos[inicio];
        inicio = (inicio + 1) % objetos.length;
        totalDeObjetos--;
        return removido;
    }

    public Object primeiro() {
        return objetos[inicio];

    }

    public Object ultimo() {
        return objetos[fim - 1];

    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }

    public void listar() {
        String vetor = Arrays.toString(objetos);
        System.out.println("A lista esta " + vetor);

    }

    public void passarFrente() {
        if (fim != objetos.length) {
            return;
        }
        for (int i = inicio; i < fim ; i++) {
            objetos[i - inicio] = objetos[i];
        }
        fim--;
        inicio = 0;

    }

    public static void main(String args[]) {
        Fila teste = new Fila();
        teste.enfileira("Alex");
        teste.enfileira("Davi");
        teste.enfileira("Caio");
        teste.enfileira("Guilherme");
        teste.listar();
        System.out.println("Objeto removido:" + teste.desenfileira());
        System.out.println("Primeiro objeto da fila: " + teste.primeiro());
        System.out.println("Ultimo objeto da fila: " + teste.ultimo());
        teste.enfileira("Rodrigo");
        teste.listar();
        teste.enfileira("Rafael");
        System.out.println("Objeto removido:" + teste.desenfileira());
        teste.enfileira("Mathews");
        teste.listar();
    }

}
