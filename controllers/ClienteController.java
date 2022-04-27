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
}
