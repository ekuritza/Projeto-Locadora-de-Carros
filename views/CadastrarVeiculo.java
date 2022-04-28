package views;

import utils.Console;
import controllers.VeiculoController;
import models.Veiculo;

public class CadastrarVeiculo{
   public void renderizar() {
    Veiculo veiculo = new Veiculo();
    VeiculoController veiculoController = new VeiculoController();

    System.out.println("\n -- CADASTRO DE VEÍCULOS -- \n");
    veiculo.setId(Console.readString("Digite o Id do veículo: "));
    veiculo.setNome(Console.readString("Digite o nome do veículo: "));
    veiculo.setFabricante(Console.readString("Digite o fabricante do veículo: "));
    veiculo.setPlacaDoVeiculo(Console.readString("Digite a placa do veículo: "));
    veiculo.setCor(Console.readString("Digite a cor do veículo: "));
    veiculo.setSituacaoDoVeiculo(Console.readBoolean("Digite a situação do veículo (true ou false): "));
    veiculo.setAnoDoModelo(Console.readString("Digite o ano de fabricação do veículo: "));
    veiculo.setKm(Console.readString("Informe a quilometragem do veículo: "));
    veiculo.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
    veiculoController.cadastrar(veiculo);
    System.out.println("----------------------------");
   } 
}
