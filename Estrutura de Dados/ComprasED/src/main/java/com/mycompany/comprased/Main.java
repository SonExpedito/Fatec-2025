package com.mycompany.comprased;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Pizza p1 = new Pizza ("Calabresa", 25.00);
        Pizza p2 = new Pizza ("Pepperoni", 50.00);
        Pizza p3 = new Pizza ("Frango com Catupiry", 45.00);

        Bebida b1 = new Bebida("Sprite", 12.00);
        Bebida b2 = new Bebida("Gin", 10.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(p1);
        carrinho.adicionarPizza(p2);
        carrinho.adicionarPizza(p3);

        carrinho.adicionarBebida(b1);
        carrinho.adicionarBebida(b2);

        System.err.println("O valor total é: " +carrinho.getTotalaPagar());
    }
   
}