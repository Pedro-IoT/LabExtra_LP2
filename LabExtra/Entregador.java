package LabExtra;

public abstract class Entregador{
    private String nome;
    private String cpf;

    public Entregador(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }
}