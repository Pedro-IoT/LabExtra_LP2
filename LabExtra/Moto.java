package LabExtra;

public class Moto extends Veiculo implements Fretavel{

    public Moto(String placa, int ano){
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmkm){
        return distanciaEmkm * 0.45;
    }
}