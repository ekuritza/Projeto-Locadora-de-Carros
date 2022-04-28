package views;

import java.util.ArrayList;

import controllers.VeiculoController;
import models.*;
import utils.Console;

public class RemoverVeiculo {

    private int id;

    public void removerVeiculo() {

        VeiculoController veiculoController = new VeiculoController();
        ArrayList <Veiculo> listaVeiculos = veiculoController.listar();

        System.out.println("\n -- REMOVER VEICULO -- \n");
        
        id = (Console.readInt("Digite o ID do veículo: ")); 
        veiculoController.removeVeiculo(id);
        System.out.println("----------------------------");
    }

}
