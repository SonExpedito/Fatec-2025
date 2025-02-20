package com.mycompany;

public class Main {
    static SegundaED segunda = new SegundaED();
    public static void main(String[] args) {
        

        segunda.adicionar("Ana");
        segunda.adicionar("Beatriz");

        segunda.contem("Beatriz");
        segunda.adicionar("Alex");

        segunda.getNome(30);
        segunda.remove("Ana");

    }
}