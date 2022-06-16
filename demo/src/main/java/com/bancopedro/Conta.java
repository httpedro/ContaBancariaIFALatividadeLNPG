package com.bancopedro;

public class Conta {
    private String banco;
    private int agencia;
    private String usuario;
    private float saldo;

    public Conta(String banco,int agencia,String usuario,float saldo){
        this.banco=banco;
        this.agencia=agencia;
        this.usuario=usuario;
        this.saldo=saldo;
    }

    public void informação(){
        System.out.println("Olá "+usuario+"\nSeu banco é: "+banco+"\nSua agencia é: "+agencia+"\nSeu saldo atual é: "+saldo);
    }

    public void depositar(float deposito){
        System.out.println("\n------DEPOSITO------\n");
        float soma = deposito+saldo;
        System.out.println("valor depositado: "+deposito);
        System.out.println("seu saldo atual é: "+soma);
        saldo=soma;
    }
    
    public void sacar(float saque){
        System.out.println("\n------SAQUE-----\n");
        if(saque<saldo){
            float subtracao = saldo-saque;
            System.out.println("valor sacado: "+saque);
            System.out.println("seu saldo atual é: "+subtracao);
            saldo=subtracao;
        }else{
            System.out.println("voce não tem saldo o suficiente pra sacar");
        }
    }

    public void transferir(float transferencia, Conta conta){
        System.out.println("\n------TRANSFERENCIA-----\n");
        if(transferencia<saldo){
            float sub = saldo-transferencia;
            System.out.println("foi transferido R$"+transferencia+" saldo atual :"+sub);
            conta.saldo = conta.saldo+transferencia;
            System.out.println(conta.usuario +" Recebeu o valor de "+transferencia+" e o saldo atual desta conta é:"+conta.saldo+"\n");
            saldo=sub;
        }else{
            System.out.println("voce não tem saldo o suficiente pra tranferir\n");
        }
    }
}