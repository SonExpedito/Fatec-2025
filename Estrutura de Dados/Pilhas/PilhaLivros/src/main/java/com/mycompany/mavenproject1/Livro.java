/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Livro {

    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;

    public Livro(String nome, int ano, double preco) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    public Livro getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Livro anterior) {
         this.anterior = anterior;
    }
    
    @Override
    public String toString (){
        String livro = "Livro: " +nome  +", "+ano +", " +preco +", anterior: " +anterior;
        return livro;
    }
}
