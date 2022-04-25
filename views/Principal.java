package views;

//import CPF.ValidaCPF;
import utils.Console;

public class Principal {
    public static void main(String[] args) {

        System.out.println("-----ALUGUEL DE CARROS UP-----");
        int escolhaMenu;
        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1  Cadastrar carro");
            System.out.println("2  Lista de carros");
            System.out.println("3  Novo cliente");
            System.out.println("4  Lista de clientes");
            System.out.println("5  Cadastro de vendedor");
            System.out.println("6  Lista de vendedores");
            System.out.println("7  Cadastro de locação");
            System.out.println("8  Lista de locações");
            System.out.println("0  Sair");

            escolhaMenu = Console.readInt("Selecione a opção: ");
            switch (escolhaMenu) {
                case 1:
                    CadastrarVeiculo cadastro = new CadastrarVeiculo();
                    cadastro.renderizar();
                    break;
                case 2:
                    ListarVeiculo listarVeiculos = new ListarVeiculo();
                    listarVeiculos.renderizar();
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
