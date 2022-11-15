package c214.designPattern.observer.impl;

import c214.designPattern.observer.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private List<Observador> sentences;


    public Observavel() {
        sentences = new ArrayList<Observador>();
    }

    public int countWords(String theSentence) {
        int length = theSentence.split(" ").length;
        return length;
    }

    public int numberOfWordsWithEvenNumberOfCharacters(String theSentence) {
        int n = 0;
        return n;
    }

    public int numberOfFirstLetterCaps(String theSentence) {
        int n = 0;
        return n;
    }


    @Override
    public void registraObservador(Observador obs) {
        sentences.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if (sentences.contains(obs))
            sentences.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : sentences
        ) {
            observador.update(this);
        }
    }
}
