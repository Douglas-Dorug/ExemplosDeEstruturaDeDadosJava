package com.projetosexemplos.fila;

public class No<T> {

    //Objetos padroes presentes no Nó
    private T object;
    private No<T> refNo;

    //Construtor vazio
    public No(){
    }

    //Construtor padrão
    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    //Getters and Setters
    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
