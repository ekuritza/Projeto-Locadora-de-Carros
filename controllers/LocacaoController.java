package controllers;

import java.util.ArrayList;
import models.Locacao;

public class LocacaoController {
    Double valorFinal;
    private static ArrayList<Locacao> listaLocacao = new ArrayList<Locacao>();

    public void cadastrar(Locacao locacao){
        listaLocacao.add(locacao);
    }
    public ArrayList<Locacao> listar(){
        return listaLocacao;
    }

    public int getListLenth() {
        return listaLocacao.size();
    }

    public Double setValorLocacao(int id, int diasLocados){
        valorFinal = diasLocados * VeiculoController.getValorDiaria(id);
        return valorFinal;
    } 

}
