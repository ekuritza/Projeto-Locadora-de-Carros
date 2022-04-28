package views;

import controllers.ClienteController;
import models.Clientes;
import utils.Console;
import utils.ValidaCPF;

public class CadastrarCliente {

    public void renderizar(){
        Clientes clientes = new Clientes();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
            clientes.setNome(Console.readString("Digite seu nome: "));
            clientes.setCpf(Console.readString("Digite seu CPF: "));
                if (ValidaCPF.isCPF(clientes.getCpf()) == true){
                    System.out.println("CPF válido!");
                }else System.out.printf("Erro, CPF inválido!\n");
            clientes.setDataNascimento(Console.readString("Digite a sua data de nascimento: "));
            clientes.setCnh(Console.readString("Digite o Nº da sua CNH: "));
            clientes.setValidadeHabilitacao(Console.readString("Digite a validade da sua CNH: "));
            clientes.setCategoriaHabilitacao(Console.readString("Digite a categoria da sua CNH: A-Moto | B-Carro: "));
            clientes.setEndereco(Console.readString("Digite seu endereço: "));
            clientes.setNumero(Console.readString("Digite o número da sua residencia: "));
            clientes.setBairro(Console.readString("Digite seu bairro: "));
            clientes.setCidade(Console.readString("Digite sua cidade: "));
            clientes.setEstado(Console.readString("Digite a UF do seu estado: "));
            clientes.setCep(Console.readString("Digite o seu CEP: \n"));

            clienteController.Cadastrar(clientes);

            
    }
    
}
