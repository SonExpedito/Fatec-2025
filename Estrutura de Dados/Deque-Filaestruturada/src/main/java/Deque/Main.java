/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deque;

/**
 *
 * @author alexe
 */
public class Main {

    public static void main(String args[]) throws Exception {
        Deque dequezinho = new Deque();

        dequezinho.EnqueueL("Ale");
        dequezinho.EnqueueR("Venti");
        dequezinho.EnqueueR("Matheus");
        dequezinho.imprime();
        dequezinho.EnqueueL("Pedro");
        dequezinho.imprime();
        dequezinho.DequeueL();
        dequezinho.DequeueR();
        dequezinho.imprime();
    }
}
