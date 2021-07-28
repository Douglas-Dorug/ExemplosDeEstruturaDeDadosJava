package com.projetosexemplos.pilha;

public class No<T> {

    // Aqui é onde estão declaradas as variaveis que serão setadas inicialmente para os nós
    // T é uma variavel generica que vai ser setada quando for declarada o tipo da lista. EX: <String> / <Integer> / <Boolean>.
    private T dado;

    //Referencia para o proximo nó
    private No refNo = null;

    //Construtor padrão vazio
    public No() {
    }

    //Construtor padrão
    public No(T dado) {
        this.dado = dado;
    }

    //Getters and Setters
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }


    //String padrão de como o dado será printado pela classe No
    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
