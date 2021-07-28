package com.projetosexemplos.pilha;

public class Main {

    //Exemplo de criação e manipulação de pilhas
    //Como foi utilizado tipo Generic na Classe No, qualquer tipo de dado será adicionado a pilha
    public static void main(String args[]){
    Pilha minhaPilha = new Pilha();
    minhaPilha.push(new No("string"));
    minhaPilha.push(new No(2.555));
    minhaPilha.push(new No(true));
    minhaPilha.push(new No(4));
    minhaPilha.push(new No(5));
    minhaPilha.push(new No(6));

    System.out.println(minhaPilha);

    System.out.println(minhaPilha.pop());

    System.out.println(minhaPilha);

    minhaPilha.push(new No(99));
    System.out.println(minhaPilha);
}
}
