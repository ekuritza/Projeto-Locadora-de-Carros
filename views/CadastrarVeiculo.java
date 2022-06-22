package views;

import utils.Console;
import controllers.VeiculoController;
import models.Carro;
import models.Moto;
import models.Veiculo;

public class CadastrarVeiculo{
   public void renderizar() {
    Veiculo veiculo = new Veiculo();
    Carro carro = new Carro();
    Moto moto = new Moto();
    VeiculoController veiculoController = new VeiculoController();

    System.out.println("\n -- CADASTRO DE VEÍCULOS -- \n");
    
    veiculo.setTipo(Console.readInt("Informe o tipo de veículo que deseja alugar 1-CARRO 2-MOTO: "));
    veiculo.setId(Console.readInt("Digite o Id do veículo: "));
    carro.setNome(Console.readString("Digite o nome do veículo: "));
    veiculo.setFabricante(Console.readString("Digite o fabricante do veículo: "));
    veiculo.setPlacaDoVeiculo(Console.readString("Digite a placa do veículo: "));
    veiculo.setCor(Console.readString("Digite a cor do veículo: "));
    veiculo.setSituacaoDoVeiculo(true);
    veiculo.setAnoDoModelo(Console.readString("Digite o ano de fabricação do veículo: "));
    veiculo.setKm(Console.readString("Informe a quilometragem do veículo: "));
    veiculo.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
    moto.setCilindrada(Console.readString("Informe a cilindrada do veículo: "));
    carro.setCambio(Console.readString("Informe o cambio do veículo: "));
      
   veiculoController.cadastrar(veiculo);
   System.out.println("----------------------------");
   }
}


//       int opcao;
//       do {
//       opcao = Console.readInt("Selecione a opção desejada: ");
//       switch (opcao) {
//         case 1:
//             carro.setTipo(Console.readInt("Informe o tipo de veículo que deseja alugar 1-CARRO 2-MOTO: "));
//             carro.setId(Console.readInt("Digite o Id do veículo: "));
//             carro.setNome(Console.readString("Digite o nome do veículo: "));
//             carro.setFabricante(Console.readString("Digite o fabricante do veículo: "));
//             carro.setPlacaDoVeiculo(Console.readString("Digite a placa do veículo: "));
//             carro.setCor(Console.readString("Digite a cor do veículo: "));
//             carro.setSituacaoDoVeiculo(true);
//             carro.setAnoDoModelo(Console.readString("Digite o ano de fabricação do veículo: "));
//             carro.setKm(Console.readString("Informe a quilometragem do veículo: "));
//             carro.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
//             moto.setCilindrada(Console.readString("Informe a cilindrada do veículo: "));
//             carro.setCambio(Console.readString("Informe o cambio do veículo: "));

//             veiculoController.cadastrar(veiculo);
//             System.out.println("----------------------------");
           
//         break;
//         case 2:
//             moto.setTipo(Console.readInt("Informe o tipo de veículo que deseja alugar 1-CARRO 2-MOTO: "));
//             moto.setId(Console.readInt("Digite o Id do veículo: "));
//             moto.setNome(Console.readString("Digite o nome do veículo: "));
//             moto.setFabricante(Console.readString("Digite o fabricante do veículo: "));
//             moto.setPlacaDoVeiculo(Console.readString("Digite a placa do veículo: "));
//             moto.setCor(Console.readString("Digite a cor do veículo: "));
//             moto.setSituacaoDoVeiculo(true);
//             moto.setAnoDoModelo(Console.readString("Digite o ano de fabricação do veículo: "));
//             moto.setKm(Console.readString("Informe a quilometragem do veículo: "));
//             moto.setValorDiaria(Console.readDouble("Informe o valor da diária: "));
//             moto.setCilindrada(Console.readString("Informe a cilindrada do veículo: "));

//             veiculoController.cadastrar(veiculo);
//             System.out.println("----------------------------");
//         case 0:
//             System.out.println("\n -- SAINDO -- \n");
//             break;
//         default:
//             System.out.println("\n -- OPÇÃO NÃO ENCONTRADA -- \n");
//             break;
//       } 
//          }while (opcao != 0);
//    }  
// 

