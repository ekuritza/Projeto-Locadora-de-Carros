package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {

        System.out.println("-----ALUGUEL DE CARROS UP-----");
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
                case 5:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                break;
                case 6:
                    ListarFuncionario listaFuncionarios = new ListarFuncionario();
                    listaFuncionarios.renderizar();
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
