package com.mycompany.comprased;

import java.util.Arrays;

public class Compra {

    private Object[] objetos = new Object[10];

    public int totalDeObjetos = 0;

    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            System.err.println("Posição inexistente no Vetor.");
            return;
        }

        if (!posicaoOcupada(posicao)) {
            objetos[posicao] = objeto;
            System.out.print("Objeto adicionado com Sucesso");
            System.out.println(Arrays.toString(objetos));
            totalDeObjetos++;

        } else {
            cheio();

            Object[] objetosexpandido = new Object[objetos.length];

            for (int i = 0; i < posicao; i++) {
                objetosexpandido[i] = objetos[i];
            }
            objetosexpandido[posicao] = objeto;

            for (int i = posicao; i < totalDeObjetos; i++) {
                objetosexpandido[i + 1] = objetos[i];
            }

            objetos = objetosexpandido;
            totalDeObjetos++;

            System.out.println(Arrays.toString(objetos));
            tamanho();
        }
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos >= objetos.length) {
            System.out.println("O Vetor esta completamente preenchido");

        } else {
            for (int i = 0; i < objetos.length; i++) {
                if (!posicaoOcupada(i)) {
                    objetos[i] = objeto;
                    totalDeObjetos++;
                    System.out.println(Arrays.toString(objetos));
                    break;
                }
            }
        }

    }

    private boolean posicaoOcupada(int posicao) {
        if (posicaoValida(posicao)) {
            return objetos[posicao] != null;
        }
        return false;
    }

    private boolean posicaoValida(int posicao) {

        return posicao >= 0 && posicao < objetos.length;

    }

    public void remove(int posicao) {
        if (!posicaoValida(posicao)) {
            System.err.println("índice inexistente.");
            return;
        }

        if (!posicaoOcupada(posicao)) {
            System.err.println("Não existe nada neste indice");
            return;
        }

        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1];
        }
        objetos[totalDeObjetos - 1] = null;

        totalDeObjetos--;

        System.out.println(Arrays.toString(objetos));
        tamanho();

    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < objetos.length; i++) {

            if (objeto.equals(objetos[i])) {
                System.err.println("O objeto " + objeto + " existe no indice: " + i);
                return true;
            }

        }

        return false;
    }

    public Object getObjeto(int posicao) {
        if (!posicaoValida(posicao)) {
            System.err.println("Este indice nao existe no vetor.");
            return null;
        }
        if (!posicaoOcupada(posicao)) {
            System.err.println("Nao existe nada nesta posicao.");
            return null;
        }
        System.err.println("O Item referente ao indice " + posicao + " e o objeto: " + objetos[posicao]);
        return objetos[posicao];
    }

    public int tamanho() {
        System.err.println("O total de objetos e: " + totalDeObjetos);
        return totalDeObjetos;
    }

    public void cheio() {
        if (totalDeObjetos == objetos.length) {
            Object[] objetosexpandido = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                objetosexpandido[i] = objetos[i];
            }
            objetos = objetosexpandido;
        }
    }
}
