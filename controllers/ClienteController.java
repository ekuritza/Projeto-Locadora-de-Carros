package controllers;

import java.util.ArrayList;
import models.Clientes;

public class ClienteController {

    private static ArrayList <Clientes> listaClientes = new ArrayList<Clientes>();

    public void Cadastrar(Clientes clientes) {
        listaClientes.add(clientes);  
    }

    public ArrayList<Clientes> listar() {
        return listaClientes;
    }

    public Clientes buscarPorCpf(String cpf){
        for (Clientes clienteCadastrado : listaClientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }
}
