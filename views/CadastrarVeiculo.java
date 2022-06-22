package views;

import utils.Console;
import controllers.VeiculoController;
import models.Carro;
import models.Moto;


public class CadastrarVeiculo{
   public void renderizar() {
    Carro carro = new Carro();
    Moto moto = new Moto();
    VeiculoController veiculoController = new VeiculoController();

    System.out.println("\n -- CADASTRO DE VEÍCULOS -- \n");

      int opcao;
      do {
      opcao = Console.readInt("Selecione a opção desejada 1-CARRO, 2-MOTO, 0- MENU PRINCIPAL: \n");
      switch (opcao) {
        case 1:
            carro.setId(Console.readInt("Digite o Id do veículo: "));
            carro.setNome(Console.readString("Digite o nome do carro: "));
            carro.setFabricante(Console.readString("Digite o fabricante do carro: "));
            carro.setPlacaDoVeiculo(Console.readString("Digite a placa do carro: "));
            carro.setCor(Console.readString("Digite a cor do carro: "));
            carro.setSituacaoDoVeiculo(true);
            carro.setAnoDoModelo(Console.readString("Digite o ano de fabricação do carro: "));
            carro.setKm(Console.readString("Informe a quilometragem do carro: "));
            carro.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
            carro.setCambio(Console.readString("Informe o cambio do carro: "));
            veiculoController.cadastrar(carro);
            System.out.println("----------------------------");
           
        break;
        case 2:
            moto.setId(Console.readInt("Digite o Id do veículo: "));
            moto.setNome(Console.readString("Digite o nome da moto: "));
            moto.setFabricante(Console.readString("Digite o fabricante da moto: "));
            moto.setPlacaDoVeiculo(Console.readString("Digite a placa da moto: "));
            moto.setCor(Console.readString("Digite a cor da moto: "));
            moto.setSituacaoDoVeiculo(true);
            moto.setAnoDoModelo(Console.readString("Digite o ano de fabricação da moto: "));
            moto.setKm(Console.readString("Informe a quilometragem da moto: "));
            moto.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
            moto.setCilindrada(Console.readString("Informe a cilindrada da moto: "));
            veiculoController.cadastrar(moto);
            System.out.println("----------------------------");
        case 0:
            break;
        default:
            System.out.println("\n -- OPÇÃO NÃO ENCONTRADA -- \n");
            break;
      } 
         }while (opcao != 0);
   }  
}