package controllers.interfaces;

import java.util.ArrayList;

import models.Funcionario;

public interface IFuncionarioController {
    void cadastrar(Funcionario funcionario);
    ArrayList<Funcionario> listar();
    Funcionario buscarPorNome(String nome);
}
