package views;
import controllers.ClienteController;
import models.Clientes;

public class ListarCliente {
    
    public void renderizar(){
        ClienteController clienteController = new ClienteController();

        System.out.println("\n -- LISTAGEM DE CLIENTES -- \n");
            for (Clientes clienteCadastrado : clienteController.listar()) {
                System.out.println(clienteCadastrado);
            }
    }
}
