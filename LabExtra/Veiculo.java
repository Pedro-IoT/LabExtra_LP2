package LabExtra;

public abstract class Veiculo{
    private String placa;
    private int ano;


    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    public int getAno(){
        return this.ano;
    }
}