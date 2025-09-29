package LabExtra;

public class Carro extends Veiculo implements Fretavel{

    public Carro(String placa, int ano){
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmkm){
        return distanciaEmkm * 1.25;
    }
}