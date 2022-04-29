package views;

import java.util.ArrayList;

import controllers.VeiculoController;
import models.*;
import utils.Console;

public class RemoverVeiculo {

    private int id;

    public void removerVeiculo() {
        String continuar;

        VeiculoController veiculoController = new VeiculoController();
        ArrayList<Veiculo> listaVeiculos = veiculoController.listar();

        System.out.println("\n -- REMOVER VEICULO -- \n");

        id = (Console.readInt("Digite o ID do veículo: "));
        do {
            for (Veiculo veiculoCadastrado : listaVeiculos) {
                if (veiculoCadastrado.getId() == (id)) {
                    veiculoController.removeVeiculo(id);
                    break;
                }
            }
            continuar = Console.readString("Deseja continuar? S/N");
            if (continuar.equals("S") || continuar.equals("s")) {
                break;
            }
            ;
        } while (true);
        System.out.println("----------------------------");
    }

}
