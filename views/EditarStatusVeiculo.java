package views;


import controllers.VeiculoController;
import utils.Console;

public class EditarStatusVeiculo {

    private int id;

    public void editarStatus() {

        VeiculoController veiculoController = new VeiculoController();

        System.out.println("\n -- DEVOLVER VEICULO -- \n");
        
        id = (Console.readInt("Digite o ID do veículo: ")); 
        veiculoController.changeStatus(id, true);
        System.out.println("----------------------------");
    }

}
