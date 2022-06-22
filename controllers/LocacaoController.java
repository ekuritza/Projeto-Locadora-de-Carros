package controllers;

import java.util.ArrayList;

import controllers.interfaces.ILocacaoController;
import models.Locacao;

public class LocacaoController implements ILocacaoController{
    VeiculoController veiculoController = new VeiculoController();

    Double valorFinal;
    private static ArrayList<Locacao> listaLocacao = new ArrayList<Locacao>();


    @Override
    public void cadastrar(Locacao locacao){
        listaLocacao.add(locacao);
    }

    @Override
    public ArrayList<Locacao> listar(){
        return listaLocacao;
    }

    @Override
    public int getListLenth() {
        return listaLocacao.size();
    }

    @Override
    public Double setValorLocacao(int id, int diasLocados){
        valorFinal = diasLocados * veiculoController.getValorDiaria(id);
        return valorFinal;
    } 

}
