package com.mycompany;

import java.util.Arrays;

public class SegundaED {

    String nomes[] = new String[26];
    int totalnomes = 0;

    public void adicionar(String nome) {
        int posicao = getIndice(nome);

        if (posicao == -1) {
            System.err.println("Não foi digitado nada, ou não se encaixa no alfabeto");
            return;
        }

        if (!posicaoOcupada(posicao)) {
            nomes[posicao] = nome;
            totalnomes++;
            System.out.println(Arrays.toString(nomes));
        } else {
            System.err.println("O lugar já está preenchido com o (a) " + nomes[posicao]);
        }

    }

    private boolean posicaoOcupada(int posicao) {
        if (posicaoValida(posicao)) {
            return nomes[posicao] != null;
        }
        return false;

    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < nomes.length;
    }

    public Object getNome(int posicao) {
        if (!posicaoValida(posicao)) {
            System.err.println("Este indice nao existe no vetor.");
            return null;
        }
        if (!posicaoOcupada(posicao)) {
            System.err.println("Nao existe nada nesta posicao.");
            return null;
        }
        System.err.println("O Item referente ao indice " + posicao + " e o objeto: " + nomes[posicao]);
        return nomes[posicao];
    }

    public void remove(String nome) {
        int posicao = getIndice(nome);
        if (posicaoOcupada(posicao)) {
            nomes[posicao] = null;
            totalnomes--;

            System.err.println("Removido com sucesso");
            System.out.println(Arrays.toString(nomes));
            return;
        }
        System.err.println("Não possue nada para remover");
    }

    public int totalNomes() {

        System.err.println("O total de objetos e: " + totalnomes);
        return totalnomes;
    }

    public boolean contem(String nome) {
        int posicao = getIndice(nome);

        if (!nome.equals(nomes[posicao])) {
            System.err.println("O nome não existe nesse vetor.");
            return false;
        }

        System.err.println("O nome existe na posicao: " + posicao);
        return true;
    }

    public int getIndice(String nome) {
        char primeiraletra = nome.charAt(0);
        primeiraletra = Character.toLowerCase(primeiraletra);

        return switch (primeiraletra) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            case 'k' -> 10;
            case 'l' -> 11;
            case 'm' -> 12;
            case 'n' -> 13;
            case 'o' -> 14;
            case 'p' -> 15;
            case 'q' -> 16;
            case 'r' -> 17;
            case 's' -> 18;
            case 't' -> 19;
            case 'u' -> 20;
            case 'v' -> 21;
            case 'w' -> 22;
            case 'x' -> 23;
            case 'y' -> 24;
            case 'z' -> 25;
            default -> -1;
        };

    }
}
