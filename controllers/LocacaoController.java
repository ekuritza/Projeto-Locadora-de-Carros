package controllers;

import java.util.ArrayList;
import models.Locacao;

public class LocacaoController {
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
}
