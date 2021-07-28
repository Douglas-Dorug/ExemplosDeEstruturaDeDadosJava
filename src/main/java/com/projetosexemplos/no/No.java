package com.projetosexemplos.no;

public class No<T> {

    // Aqui é onde estão declaradas as variaveis que serão setadas inicialmente para os nós
    // T é uma variavel generica que vai ser setada quando for declarada o tipo da lista. EX: <String> / <Integer> / <Boolean>.
    public T conteudo;

    // Aqui é declarado o conteúdo já do proximo nó.
    // proximoNo é colocado sempre como null inicialmente para que quando forem sendo adicionados novos valores a lista o valor seguinte já tenha null como padrao.
    public No proximoNo = null;


    //Construtor para a classe No
    //No construtor deve ser declarado o conteudo que deve possuir seu tipo de objeto e caracteristicas que a classe possui.
    //Neste exemplo foi utilizado um Generics <T> para que o tipo de variavel seja adicionada posteriormente na criação de um nó.
    public No(T conteudo){
        this.conteudo = conteudo;
    }


    //Getters and setters para a classe (devem ser declarados sempre mesmo que não sejam necessários).
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }


    //Colocada uma saída padrão para quando o dado do nó for printado
    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

    //Este metodo identifica se existe um proximo nó encadeado e o printa, caso não exista nenhum nó na sequencia ele vai printar null
    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
