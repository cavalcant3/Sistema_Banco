package com.poo;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;
    private static int id;

//    incremento de cada conta por id
    public Conta(){
        Conta.id = Conta.id +1;
    }

    boolean saca(double valor) {
        if (valor < this.saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }





    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
