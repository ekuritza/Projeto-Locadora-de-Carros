package controllers;

import java.util.ArrayList;
import models.Veiculo;

public class VeiculoController {
    
    private static ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
    static double valorDiaria;
    public void cadastrar(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }
    public ArrayList<Veiculo> listar(){
        return listaVeiculo;
    }

    public Veiculo buscarPorId(int id){
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == (id)){
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
    public void changeStatus(int id, boolean status) {
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == id){
                veiculoCadastrado.setSituacaoDoVeiculo(status);
            }
        }   
    }

    public static double getValorDiaria(int id){
        for (Veiculo veiculoCadastrado : listaVeiculo) {
            if(veiculoCadastrado.getId() == (id)){
                return veiculoCadastrado.getValorDiaria();
            }
        }
        return valorDiaria;
    }

    public ArrayList<Veiculo> listarVeiculosDisponiveis(){
        var listaVeiculoDisponivel = new ArrayList<Veiculo>();
        for (Veiculo veiculoDisponivel : listaVeiculo){
            if (veiculoDisponivel.getSituacaoDoVeiculo()) {
                listaVeiculoDisponivel.add(veiculoDisponivel);    
            }           
        }
        return listaVeiculoDisponivel;
    }
}