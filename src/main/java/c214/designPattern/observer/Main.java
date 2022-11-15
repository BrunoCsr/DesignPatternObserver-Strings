package c214.designPattern.observer;

import c214.designPattern.observer.impl.Observador;
import c214.designPattern.observer.impl.Observavel;

public class Main {
    public static void main(String[] args) {


        Observavel observavel = new Observavel();
        Observador observador0 = new Observador(0);


        observavel.registraObservador(observador0);



        observavel.countWords("hoje a tarde");

        observador0.update(observavel);


    }


}