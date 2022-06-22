package controllers;

import java.util.ArrayList;

import controllers.interfaces.IFuncionarioController;
import models.Funcionario;

public class FuncionarioController implements IFuncionarioController{
    private static ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    @Override
    public void cadastrar(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    @Override
    public ArrayList<Funcionario> listar(){
        return listaFuncionarios;
    }

    @Override
    public Funcionario buscarPorNome(String nome){
        for (Funcionario funcionarioCadastrado : listaFuncionarios) {
            if(funcionarioCadastrado.getNome().equals(nome)){
                return funcionarioCadastrado;
            }
        }
        return null;
    }
}