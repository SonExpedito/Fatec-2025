/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_simples;

/**
 *
 * @author alexe
 */
public class ListaEncadeadaSimples {

    public static void main(String[] args) {
        Lista l = new Lista();

        l.inserirNoFim(new No(2));
        l.inserirNoFim(new No(12));
        l.inserirNoInicio(new No(22));
        l.inserirNoFim(new No(32));
        l.inserirNoFim(new No(2));

        l.exibirLista();
        l.excluirNo(new No(12));
        l.exibirLista();
    }
}
