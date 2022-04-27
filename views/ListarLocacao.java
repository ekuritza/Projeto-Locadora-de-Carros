package views;

import java.util.ArrayList;

import controllers.LocacaoController;
import models.Locacao;

public class ListarLocacao {

    public void renderizar(){
        LocacaoController locacaoController = new LocacaoController();
        ArrayList <Locacao> listaLocacao = locacaoController.listar();
        
        System.out.println("\n -- LISTA DE LOCACÕES -- \n");
        for(int i = 0; i < listaLocacao.size(); i++){
            System.out.println(listaLocacao.get(i));
        }
        System.out.println("----------------------------");
    }
}

