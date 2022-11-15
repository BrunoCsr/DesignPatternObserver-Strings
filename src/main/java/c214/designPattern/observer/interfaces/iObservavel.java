package c214.designPattern.observer.interfaces;

import c214.designPattern.observer.impl.Observador;

public interface iObservavel {

    void registraObservador(Observador obs);

    void removeObservador(Observador obs);

    void notificaObservadores();






}
