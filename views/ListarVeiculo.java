package views;

import java.util.ArrayList;

import controllers.VeiculoController;
import models.*;

public class ListarVeiculo {
    public void renderizar() {
        VeiculoController veiculoController = new VeiculoController();
        ArrayList <Veiculo> listaVeiculos = veiculoController.listar();

        System.out.println("\n -- LISTA DE VEÍCULOS -- \n");
        for(int i = 0; i < listaVeiculos.size(); i++){
            System.out.println(listaVeiculos.get(i));
        }
    }
}
