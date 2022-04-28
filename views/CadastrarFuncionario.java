package views;

import utils.Console;
import utils.ValidaCPF;
import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {

    public void renderizar(){
        Funcionario funcionario = new Funcionario();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));
        if (ValidaCPF.isCPF(funcionario.getCpf()) == true){
            FuncionarioController.cadastrar(funcionario);
            System.out.println("\nFuncionário cadastrado!\n");
        }else System.out.printf("\nErro, CPF inválido !\n");
    }
    
}
