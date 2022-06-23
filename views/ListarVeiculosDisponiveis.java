package views;

import java.util.ArrayList;

import controllers.VeiculoController;
import models.*;

/**
 * ListarVeiculosDisponiveis
 */
public class ListarVeiculosDisponiveis {

    public void randerizar() {
        VeiculoController veiculoController = new VeiculoController();
        ArrayList <Veiculo> listaVeiculosDisponiveis = veiculoController.listarVeiculosDisponiveis();

        System.out.println("\n -- LISTA VEICULOS DISPONIVEIS -- \n");
        for(int i = 0; i < listaVeiculosDisponiveis.size(); i++){
            System.out.println(listaVeiculosDisponiveis.get(i));
        }
    }
}