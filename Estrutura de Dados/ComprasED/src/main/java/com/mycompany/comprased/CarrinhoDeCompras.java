package com.mycompany.comprased;

public class CarrinhoDeCompras {

    private double frete = 0;
    private double total_a_pagar = 0;

    Compra carrinho = new Compra();

    public void adicionarBebida (Bebida item){
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }

    public void adicionarPizza (Pizza item){
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();

    }

    public double getTotalaPagar () {
        return total_a_pagar;
    }

}
