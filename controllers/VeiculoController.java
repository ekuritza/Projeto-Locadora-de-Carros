package controllers;

import java.util.ArrayList;
import models.Veiculo;

public class VeiculoController {
    private ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

    public void cadastrar(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }
    public ArrayList<Veiculo> listar(){
        return listaVeiculo;
    }
}
