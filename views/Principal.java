package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {

        System.out.println("-----ALUGUEL DE CARROS UP-----\n");
        int escolhaMenu;
        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1  Cadastrar veículo para locação");
            System.out.println("2  Lista de veículos cadastrados");
            System.out.println("3  Cadastrar cliente");
            System.out.println("4  Lista de clientes");
            System.out.println("5  Cadastro de vendedor");
            System.out.println("6  Lista de vendedores");
            System.out.println("7  Cadastro de locação");
            System.out.println("8  Lista de locações");
            System.out.println("9  Devolver veiculo");
            System.out.println("10 Remover veiculo");
            System.out.println("0  Sair \n");
            System.out.println("------------------------------");

            escolhaMenu = Console.readInt("Selecione a opção desejada: ");
            switch (escolhaMenu) {
                case 1:
                    CadastrarVeiculo cadastro = new CadastrarVeiculo();
                    cadastro.renderizar();
                    break;
                case 2:
                    ListarVeiculo listarVeiculos = new ListarVeiculo();
                    listarVeiculos.renderizar();
                    break;
                case 3:
                    CadastrarCliente cadastrarCliente = new CadastrarCliente();
                    cadastrarCliente.renderizar();
                    break;
                case 4:
                    ListarCliente listarCliente = new ListarCliente();
                    listarCliente.renderizar();
                    break;
                case 5:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                case 6:
                    ListarFuncionario listaFuncionarios = new ListarFuncionario();
                    listaFuncionarios.renderizar();
                    break;
                case 7:
                    CadastrarLocacao cadastrarLocacao = new CadastrarLocacao();
                    cadastrarLocacao.renderizar();
                    break;
                case 8: 
                    ListarLocacao listarLocacao = new ListarLocacao();
                    listarLocacao.renderizar();
                    break;
                case 9:
                    EditarStatusVeiculo editarStatusVeiculo = new EditarStatusVeiculo();
                    editarStatusVeiculo.editarStatus();
                    break;
                case 10:
                    RemoverVeiculo removerVeiculo = new RemoverVeiculo();
                    removerVeiculo.removerVeiculo();
                    break;
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n -- OPÇÃO NÃO ENCONTRADA -- \n");
                    break;
            }
        } while (escolhaMenu != 0);
    }
}
