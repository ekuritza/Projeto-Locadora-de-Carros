package controllers.interfaces;

import java.util.ArrayList;

import models.Clientes;


public interface IClienteController {

    void cadastrar(Clientes clientes);
    ArrayList<Clientes> listar();
    Clientes buscarPorCpf(String cpf);
}