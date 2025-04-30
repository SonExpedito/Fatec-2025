package com.mycompany.hash;

public class HashLinear {

    private final Hash[] tab;
    private final int TAM_MAX;
    private int qtdObjetos = 0;

    public HashLinear(int tam) {
        tab = new Hash[tam];
        TAM_MAX = tam;
        for (int i = 0; i < tam; i++) {
            tab[i] = new Hash();
        }
    }

    private int funcaoHash(double chave) {
        return (int) Math.abs(chave % TAM_MAX);
    }

    public void insere(double item) {
        if (estaCheia()) {
            System.out.println("-> Tabela cheia, impossível inserir.");
            return;
        }

        int posInicial = funcaoHash(item);
        int pos = posInicial;

        do {
            if (tab[pos].getEstado().equals("livre") || tab[pos].getEstado().equals("removido")) {
                tab[pos].setItem(item);
                tab[pos].setEstado("ocupado");
                qtdObjetos++;
                System.out.println("-> Inserido HASH[" + pos + "]");
                return;
            }
            pos = (pos + 1) % TAM_MAX;
        } while (pos != posInicial);

        System.out.println("-> Falha ao inserir");
    }

    public int busca(double item) {
        int posInicial = funcaoHash(item);
        int pos = posInicial;

        do {
            if (tab[pos].getEstado().equals("livre")) {
                return -1;
            }
            if (tab[pos].getEstado().equals("ocupado") && tab[pos].getItem() == item) {
                return pos;
            }
            pos = (pos + 1) % TAM_MAX;
        } while (pos != posInicial);

        return -1;
    }

    public void apaga(double item) {
        int pos = busca(item);
        if (pos != -1) {
            tab[pos].setEstado("removido");
            qtdObjetos--;
            System.out.println("-> Dado HASH[" + pos + "] apagado");
        } else {
            System.out.println("Item não encontrado");
        }
    }

    public void imprime() {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tab[i].getEstado().equals("ocupado")) {
                System.out.println("Hash[" + i + "] = " + tab[i].getItem());
            }
        }
    }

    public boolean estaCheia() {
        return qtdObjetos == TAM_MAX;
    }
}
