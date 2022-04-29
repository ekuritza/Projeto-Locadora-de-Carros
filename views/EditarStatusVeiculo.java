package views;

import java.util.ArrayList;

import controllers.VeiculoController;
import models.*;
import utils.Console;

public class EditarStatusVeiculo {

    private int id;

    public void editarStatus() {

        VeiculoController veiculoController = new VeiculoController();
        ArrayList <Veiculo> listaVeiculos = veiculoController.listar();

        System.out.println("\n -- DEVOLVER VEICULO -- \n");
        
        id = (Console.readInt("Digite o ID do veículo: ")); 
        veiculoController.changeStatus(id, true);
        System.out.println("----------------------------");
    }

}
