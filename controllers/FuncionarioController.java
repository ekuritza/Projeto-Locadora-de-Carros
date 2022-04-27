package controllers;

import java.util.ArrayList;
import models.Funcionario;

public class FuncionarioController{
    private static ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    public static void cadastrar(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }
    public static ArrayList<Funcionario> listar(){
        return listaFuncionarios;
    }
}