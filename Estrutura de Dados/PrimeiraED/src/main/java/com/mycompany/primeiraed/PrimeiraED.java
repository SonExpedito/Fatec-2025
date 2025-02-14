/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primeiraed;

import java.util.Arrays;

/**
 *
 * @author alexe
 */
public class PrimeiraED {

    private Object[] objetos = new Object[10];

    public int totalDeObjetos = 0;

    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            System.err.println("Posição inexistente no Vetor.");
            return;
        }

        if (!posicaoOcupada(posicao)) {
            objetos[posicao] = objeto;
            System.out.print("Objeto adicionado com Suecsso");
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
            System.out.println(totalDeObjetos);
        }
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            System.out.println("Vetor esta completamente preenchido");

        } else {
            objetos[totalDeObjetos] = objeto;
            totalDeObjetos++;
            System.out.println(Arrays.toString(objetos));
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
//Retorna Válido apenas se existir, passando False automáticamente

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

        Object[] objetosreduzidos = new Object[objetos.length];

        for (int i = 0; i < posicao; i++) {
            objetosreduzidos[i] = objetos[i];
        }
        for (int i = posicao; i < totalDeObjetos-1; i++) {
            
            objetosreduzidos[i] = objetos[i+1];
        }

        objetos = objetosreduzidos;
        totalDeObjetos--;

        System.out.println(Arrays.toString(objetos));
        System.out.println(totalDeObjetos);

    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < objetos.length; i++) {

            if (objeto.equals(objetos[i])) {
                System.err.println("O objeto existe no indice: " + i);
                return true;
            }

        }

        return false;
    }

    public Object getObjeto(int posicao) {
        if (!posicaoValida(posicao)) {
            System.err.println("Este índice não existe no vetor.");
            return null;
        }
        if (!posicaoOcupada(posicao)) {
            System.err.println("Não existe nada nesta posição.");
            return null;
        }
        System.err.println(objetos[posicao]);
        return objetos[posicao];
    }

    public int tamanho() {
        System.err.println(totalDeObjetos);
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
