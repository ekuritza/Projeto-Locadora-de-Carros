package views;

import utils.Console;
import controllers.ClienteController;
import controllers.VeiculoController;
import controllers.LocacaoController;
import controllers.FuncionarioController;
import models.*;

public class CadastrarLocacao {
   public void renderizar() {
    int diasLocados;
    double valorFinal;

    Locacao locacao = new Locacao();
    LocacaoController locacaoController = new LocacaoController();

    ClienteController clienteController = new ClienteController();
    FuncionarioController funcionarioController = new FuncionarioController();
    VeiculoController veiculoController = new VeiculoController();

    System.out.println("\n -- CADASTRO DE LOCAÇÕES -- \n");
    
    int id = Console.readInt("Informe o id do veículo: ");
    veiculoController.buscarPorId(id);
    Veiculo veiculo = veiculoController.buscarPorId(id);
    if(veiculo != null){
        locacao.setVeiculo(veiculo);

        String cpfCliente = Console.readString("Informe o cpf do cliente: ");
        Clientes cliente = clienteController.buscarPorCpf(cpfCliente);
        if(cliente !=null){
            locacao.setClientes(cliente);

            String nomeFuncionario = Console.readString("Informe o nome do funcionário: ");
            Funcionario funcionario = funcionarioController.buscarPorNome(nomeFuncionario);
            if(funcionario != null){
                locacao.setfuncionario(funcionario);
                veiculoController.changeStatus(id, false);
                locacaoController.cadastrar(locacao);
            }else{
                System.out.println("Funcionário não encontrado");
            }
        }else{
            System.out.println("Cliente não encontrado");
        } 
    }else{
        System.out.println("Carro não encontrado");
    }
    diasLocados = Console.readInt("Quantos dias o veículo será alugado? ");
    locacao.setDiasLocados(diasLocados);
    valorFinal = locacaoController.setValorLocacao(id, diasLocados);
    locacao.setValorFinal(valorFinal);
   } 
}

