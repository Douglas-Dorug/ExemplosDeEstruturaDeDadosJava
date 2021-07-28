package com.projetosexemplos.pilha;

public class Pilha {

    //Referencia de entrada padrao da pilha (topo da pilha)
    private No refNoEntradaPilha = null;

    //Adiciona um novo objeto ao topo da pilha
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //Remove o ultimo objeto adicionado ao topo da pilha
    //Caso não haja nenhum sera retornado null
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    //Apenas retorna a referencia do topo da pilha
    public No top(){
        return refNoEntradaPilha;
    }

    //Retorna se a referencia da pilha é ou nao nula
    //Esta sendo utilizada no metodo pop para testar se existe algum falor a ser removido da pilha
    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
