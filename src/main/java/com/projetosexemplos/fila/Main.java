package com.projetosexemplos.fila;

public class Main {
    public static void main(String[] args){

        //Execução teste de montagem de uma fila
    Fila<String> filaTeste = new Fila<>();

    filaTeste.enqueue("primeiro da fila");
    filaTeste.enqueue("segundo da fila");
    filaTeste.enqueue("terceiro da fila");
    filaTeste.enqueue("quarto da fila");

    System.out.println(filaTeste);

    System.out.println(filaTeste.dequeue());

    System.out.println(filaTeste);

    filaTeste.enqueue("ultimo da fila");

    System.out.println(filaTeste);

    System.out.println(filaTeste.first());

    System.out.println(filaTeste);
}
}
