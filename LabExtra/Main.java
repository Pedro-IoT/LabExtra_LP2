package LabExtra;

public class Main{
    public static void main(String[] args) {

        ServicoDeEntrega servico = new ServicoDeEntrega();

        System.out.println("\n\n======== Teste 1 ========");

        Funcionario funcionario = new Funcionario("João", "012.345.678-90");
        Carro carro = new Carro("ABC1D23", 2023);

        servico.addLista(carro, funcionario, 10);
        double custo = servico.calcularCustoTotal();

        System.out.print("A entrega feita por " + funcionario.getNome() + " (CPF: " + funcionario.getCpf() + ") custou: ");
        System.out.println("R$ " + custo);


        System.out.println("\n\n======== Teste 2 ========");

        Autonomo autonomo = new Autonomo("Maria", "098.765.432-10");
        Moto moto = new Moto("ZYX9W87", 2024);

        servico.addLista(moto, autonomo, 25);
        custo = servico.calcularCustoTotal();

        System.out.print("A entrega feita por " + autonomo.getNome() + " (CPF: " + autonomo.getCpf() + ") custou: ");
        System.out.println("R$ " + custo);
    }
}