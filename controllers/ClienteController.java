package controllers;

import java.util.ArrayList;
import models.Clientes;
import controllers.interfaces.*;

public class ClienteController implements IClienteController{

    private static ArrayList <Clientes> listaClientes = new ArrayList<Clientes>();

    @Override
    public void cadastrar(Clientes clientes) {
        listaClientes.add(clientes);
        
    }

    @Override
    public ArrayList<Clientes> listar() {
        return listaClientes;
    }
  
    @Override
    public Clientes buscarPorCpf(String cpf) {
        for (Clientes clienteCadastrado : listaClientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }
}
