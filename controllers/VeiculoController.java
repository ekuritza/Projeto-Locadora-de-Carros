package controllers;

import java.util.ArrayList;
import models.Veiculo;

public class VeiculoController {
    private static ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

    public void cadastrar(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }
    public ArrayList<Veiculo> listar(){
        return listaVeiculo;
    }

    public Veiculo buscarPorPlaca(String placa){
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getPlacaDoVeiculo().equals(placa)){
                return veiculoCadastrado;
            }
        }
        return null;
    }
}