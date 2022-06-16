package com.bancopedro;

public class App 
{
    public static void main( String[] args )
    {
        Conta conta1 = new Conta("Bradesco", 176, "Pedro", 1000);
        Conta conta2 = new Conta("Banco do Brasil", 123, "Augusto", 2000);

        conta1.informação();
        conta1.depositar(50);
        conta1.sacar(50);
        conta1.transferir(50,conta2);
    }
}
