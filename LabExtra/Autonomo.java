package LabExtra;

public class Autonomo extends Entregador implements Fretavel{
    private double custoEntrega;

    public Autonomo(String nome, String cpf){
        super(nome, cpf);
        this.custoEntrega = 0.95;   // valor mágico 0.95 pois é a regra do negócio
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm){
        return distanciaEmKm * custoEntrega;
    }
}