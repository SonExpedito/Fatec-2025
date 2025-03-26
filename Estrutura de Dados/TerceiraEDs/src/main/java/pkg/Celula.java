/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author alexe
 */
public class Celula {

    private Celula proximo;
    private Pessoa valor;

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Pessoa getValor() {
        return valor;
    }

    public void setValor(Pessoa valor) {
        this.valor = valor;
    }
}
