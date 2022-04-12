import java.util.ArrayList;

import CPF.ValidaCPF;

public class Principal {
    public static void main(String[] args) {

        ArrayList <Carros> listaCarros = new ArrayList<Carros>();
        ArrayList <Clientes> listaClientes = new ArrayList<Clientes>();
        ArrayList <Vendedores> listaVendedores = new ArrayList<Vendedores>();
        ArrayList <Locacoes> listaLocacoes = new ArrayList<Locacoes>();

        System.out.println("-----ALUGUEL DE CARROS UP-----");
        int escolhaMenu;
        do {
            Carro carro = new Carro();
            Cliente cliente = new Cliente();
            Vendedor vendedor = new Vendedor();
            Locacao locacao = new locacao();

            System.out.println("Selecione a opção desejada: ");
            System.out.println("1  Cadastrar carro");
            System.out.println("2  Lista de carros");
            System.out.println("3  Atualizar informação dos carros");
            System.out.println("4  Novo cliente");
            System.out.println("5  Lista de clientes");
            System.out.println("6  Cadastro de vendedor");
            System.out.println("7  Lista de vendedores");
            System.out.println("8  Cadastro de locação");
            System.out.println("9  Lista de locações");
            System.out.println("0  Sair");

            escolhaMenu = Console.readInt("Selecione a opção: ");
            switch (escolhaMenu) {
                case 1:
                    System.out.println("\n -- CADASTRO DE CARROS -- \n");
                    Carro carro = new Carro();
                    cliente.setNome(Console.readString("Digite seu nome aqui: "));
                    cliente.setCpf(Console.readString("Digite seu cpf: "));
                        if (ValidaCPF.isCPF(cliente.getCpf()) == true){
                            lista.add(cliente);
                            break;
                        }else System.out.printf("Erro, CPF invalido !!!\n");
                    
                    break;
                case 2:
                    System.out.println("\n -- LISTA DE CARROS -- \n");
                    System.out.println(listaCarros);
                    break;
                case 3: 
                    System.out.println("\n -- ATUALIZAÇÃO DOS CARROS -- \n");
                case 4:
                    System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
                    Cliente cliente = new Cliente();
                    vendedor.setNome(Console.readString("Digite seu nome: "));
                    vendedor.setCpf(Console.readString("Digite seu cpf: "));
                        if (ValidaCPF.isCPF(vendedor.getCpf()) == true){
                            listaClientes.add(cliente);
                            break;
                        }else System.out.printf("Erro, CPF invalido !!!\n");
                    
                    break;
                case 5:
                    System.out.println("\n -- LISTA DE CLIENTES -- \n");
                    System.out.println(listaClientes);
                    break;
                case 6: 
                    System.out.println("\n -- CADASTRO DE VENDEDORES -- \n");
                    Vendedor vendedor = new Vendedor();
                    vendedor.setNome(Console.readString("Digite seu nome: "));
                    vendedor.setCpf(Console.readString("Digite seu cpf: "));
                        if (ValidaCPF.isCPF(vendedor.getCpf()) == true){
                            listaClientes.add(cliente);
                            break;
                        }else System.out.printf("Erro, CPF invalido !!!\n");
                case 7:
                    System.out.println("\n -- LISTA DE VENDEDORES -- \n");
                    System.out.println(listaVendedores);
                    break;
                case 8:
                    System.out.println("\n -- CADASTRO DE LOCAÇÃO DE VEÍCULO -- \n");
                    Locacao locacao = new locacao();
                    produto.setNome(Console.readString("Digite o nome do produto: "));
                    produto.setPreco(Console.readDouble("Digite o preço do produto: "));
                    produto.setQuantidade(Console.readInt("Digite a quantidade de prodtuos que deseja comprar: "));
                    listaProdutos.add(produto);
                    break;
                case 9:
                    System.out.println("\n -- LISTA DE LOCAÇÕES -- \n");
                    System.out.println(listaLocacoes);
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
