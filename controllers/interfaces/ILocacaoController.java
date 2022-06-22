package controllers.interfaces;

import java.util.ArrayList;

import models.*;

public interface ILocacaoController {
    void cadastrar(Locacao locacao);
    ArrayList<Locacao> listar();
    int getListLenth();
    Double setValorLocacao(int id, int diasLocados);
}
