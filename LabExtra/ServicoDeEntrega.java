package LabExtra;

import java.util.ArrayList;

public class ServicoDeEntrega{
    private double distanciaEmKm;
    private ArrayList<Fretavel> fretaveis = new ArrayList<>();

    public ServicoDeEntrega(){
        System.out.println("Iniciando serviço de entrega");
        this.distanciaEmKm = 0;     // Valor 0 apenas para incializar a variável com o construtor
    }

    public void addLista(Fretavel veiculo, Fretavel entregador, double distanciaEmKm){
        fretaveis.add(veiculo);
        fretaveis.add(entregador);
        this.distanciaEmKm = distanciaEmKm;
    }

    public double calcularCustoTotal(){
        double total = 0;
        for (Fretavel fretavel : fretaveis){
            total += fretavel.calcularCustoFrete(distanciaEmKm);
        }

        fretaveis.clear();  // Limpa a lista para não precisar instanciar um novo Serviço

        return total;
    }
}