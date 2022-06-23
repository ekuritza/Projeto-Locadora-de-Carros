package views;

import java.util.ArrayList;
import utils.Console;

import controllers.VeiculoController;
import models.*;

/**
 * ListarVeiculosDisponiveis
 */
public class FiltrarVeiculoPorAno {

    String anoModelo;

    public void randerizar() {
        VeiculoController veiculoController = new VeiculoController();

        System.out.println("\n -- FILTRA VEICULO POR ANO -- \n");

        anoModelo = Console.readString("Qual Ano de veiculo você quer filtrar ? ");
        ArrayList <Veiculo> listaVeiculoAno = veiculoController.FiltrarVeiculoPorAno(anoModelo);

        if (listaVeiculoAno.size() <= 0){
            System.out.println("Não possuimos nenhum veiculo cadastrado nessa data"+anoModelo);
        }else{
            for(int i = 0; i < listaVeiculoAno.size(); i++){
                System.out.println(listaVeiculoAno.get(i));
            }
        }
        
        
    }
}