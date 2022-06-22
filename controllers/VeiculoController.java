package controllers;

import java.util.ArrayList;

import controllers.interfaces.IVeiculoController;
import models.Veiculo;

public class VeiculoController implements IVeiculoController{
    
    private static ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
    static double valorDiaria;


    @Override
    public void cadastrar(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }

    @Override
    public ArrayList<Veiculo> listar(){
        return listaVeiculo;
    }

    @Override
    public Veiculo buscarPorId(int id){
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == (id)){
                return veiculoCadastrado;
            }
        }
        return null;
    }

    @Override
    public void removeVeiculo(int id) {
        listaVeiculo.remove(id-1);
        System.out.println("Veiculo removido\n");
    }

    /**
     * Muda status do veiculo de Indisponivel (false)
     * para disponivel (True)
     */

    @Override
    public void changeStatus(int id, boolean status) {
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == id){
                veiculoCadastrado.setSituacaoDoVeiculo(status);
            }
        }   
    }

    @Override
    public double getValorDiaria(int id){
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == (id)){
                return veiculoCadastrado.getValorDiaria();
            }
        }
        return valorDiaria;
}
}