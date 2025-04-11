/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Livro livro1 = new Livro("SP1", 2020, 20.2);
        Livro livro2 = new Livro("SP2", 2021, 21.2);
        Livro livro3 = new Livro("SP3", 2021, 22.2);

        pilha.push(livro1);
        System.out.println(pilha.topo);
        pilha.push(livro2);
        System.out.println(pilha.topo);
        pilha.push(livro3);
        System.out.println(pilha.topo);
        System.out.println("Removido foi: " +pilha.pop());
        System.out.println(pilha.topo);
        pilha.mostraLivros();

    }
}
