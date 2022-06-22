package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {

    FuncionarioController funcionarioController = new FuncionarioController();
        
    public void renderizar(){
        System.out.println("\n -- LISTA DE FUNCIONÁRIOS -- \n");
    
        for(Funcionario funcionarioCadastrado : funcionarioController.listar()){
            System.out.println(funcionarioCadastrado);
        }
    }
}
