package c214.designPattern.observer.impl;

import c214.designPattern.observer.interfaces.iObservador;

public class Observador implements iObservador {
    int id;

    String frase;
    String numeroTotal;
    String quantidadePar;
    String letraMaiuscula;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel sentence) {
        System.out.println("Client: " + id);
        System.out.println("Numero total de palavras:" + numeroTotal);
        System.out.println("Quantidade par de caracteres: " + quantidadePar);
        System.out.println("Começam com letra maiuscula: " + letraMaiuscula);


    }
}
