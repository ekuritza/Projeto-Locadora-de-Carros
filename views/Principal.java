package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
       
        System.out.println("\n -----ALUGUEL DE CARROS UP----- ");
        int escolhaMenu;
        do {

            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("1  Cadastrar carro");
            System.out.println("2  Lista de carros");
            System.out.println("3  Atualizar informação dos carros");
            System.out.println("4  Novo cliente");
            System.out.println("5  Lista de clientes");
            System.out.println("6  Cadastro de funcionário");
            System.out.println("7  Lista de funcionários");
            System.out.println("8  Cadastro de locação");
            System.out.println("9  Lista de locações");
            System.out.println("0  Sair\n");

            escolhaMenu = Console.readInt("Selecione a opção: ");
            switch (escolhaMenu) {
                case 6:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                break;
                case 7:
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
        }while (escolhaMenu != 0);
    }
}