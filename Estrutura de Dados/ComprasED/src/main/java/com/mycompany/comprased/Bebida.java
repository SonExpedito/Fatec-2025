package com.mycompany.comprased;
public class Bebida {
    private String tipo;
    private double preco;

    Bebida (String tipo, double preco){
        this.tipo = tipo;
        this.preco = preco;

    }

    public double getPreco(){
        return preco;
    }

    public String getTipo(){
        return tipo;
    }

}
