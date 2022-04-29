package views;

import utils.Console;
import utils.ValidaCPF;
import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
    String continuar;
    public void renderizar(){
        Funcionario funcionario = new Funcionario();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        do {
            funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));
            if (ValidaCPF.isCPF(funcionario.getCpf()) == true){
                System.out.println("CPF válido!");
                
                FuncionarioController.cadastrar(funcionario);
            }else{
                System.out.printf("Erro, CPF inválido!\n");
                continuar = Console.readString("Deseja continuar? S/N");
                if(continuar.equals("S") || continuar.equals("s")){
                    break;
                } 
            };
        }while (ValidaCPF.isCPF(funcionario.getCpf())!= true);
        System.out.println("\n");
    }
    
}
