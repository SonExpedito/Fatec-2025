package lista_simples;


import javax.swing.JOptionPane;
import lista_simples.No;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexe
 */
public class Lista {

    private No primeiro, ultimo;
    private int totalNos;

    public Lista() {
        primeiro = ultimo = null;
        totalNos = 0;
    }

    public int getTotalNos() {
        return totalNos;
    }

    public boolean checkIfListaVazia() {
        return totalNos == 0;
    }

    public void inserirNoInicio(No n) {
        if (checkIfListaVazia()) {
            primeiro = ultimo = n;
        } else {
            n.prox = primeiro;
            primeiro = n;
        }
        totalNos++;
    }

    public void inserirNoFim(No n) {
        if (checkIfListaVazia()) {
            primeiro = ultimo = n;
        } else {
            ultimo.prox = n;
            ultimo = n;
        }
        totalNos++;
    }

    public void excluirNo(No n) {
        No noAtual = primeiro, noAnterior = primeiro;
        int contador = 1;

        while (contador <= totalNos && noAtual.valor != n.valor) {
            noAnterior = noAtual;
            noAtual = noAtual.prox;
            contador++;
        }

        if (noAtual.valor == n.valor) {
            if (totalNos == 1) {
                primeiro = ultimo = null;
            } else if (noAtual == primeiro) {
                primeiro = noAtual.prox;
            } else {
                noAnterior.prox = noAtual.prox;
            }
            totalNos--;
        }
    }

    public void exibirLista() {
        No temp = primeiro;
        StringBuilder valores = new StringBuilder();
        int contador = 1;

        while (contador <= totalNos) {
            valores.append(temp.valor).append("-");
            temp = temp.prox;
            contador++;
        }

        JOptionPane.showMessageDialog(null, valores.toString());
    }
}
