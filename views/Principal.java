package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n --- ALUGUEL DE CARROS UP --- \n");
        int escolhaMenu;

        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Lista de carros");
            System.out.println("3 - Cadastrar cliente");
            System.out.println("4 - Lista de clientes");
            System.out.println("5 - Cadastrar funcionário");
            System.out.println("6 - Lista de funcionários");
            System.out.println("7 - Cadastro de locação");
            System.out.println("8 - Lista de locações");
            System.out.println("0  Sair \n");
            escolhaMenu = Console.readInt("Selecione a opção: ");

            switch (escolhaMenu) {
               case 3:
                    CadastrarCliente cadastrarCliente = new CadastrarCliente();
                    cadastrarCliente.renderizar();
                    break;
                case 4:
                    ListarCliente listarCliente = new ListarCliente();
                    listarCliente.renderizar();
                    break;
            }
        } while (escolhaMenu != 0);
    }
}
