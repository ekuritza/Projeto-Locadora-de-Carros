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

    public void removeVeiculo(int id) {
        listaVeiculo.remove(id-1);
        System.out.println("Veiculo removido\n");
    }

    /**
     * Muda status do veiculo de Indisponivel (false)
     * para disponivel (True)
     */
    public void changeStatus(int id) {
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId().equals(id)){
                veiculoCadastrado.setSituacaoDoVeiculo(true);
            }
        }
        
    }
}