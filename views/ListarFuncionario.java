package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
        
        public void renderizar(){
            System.out.println("\n -- LISTA DE FUNCIONÁRIOS -- \n");
    
            for(Funcionario funcionarioCadastrado : FuncionarioController.listar()){
                System.out.println(funcionarioCadastrado);
            }
        }
}
