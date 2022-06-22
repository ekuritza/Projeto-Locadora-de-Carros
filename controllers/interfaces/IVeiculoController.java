package controllers.interfaces;

import java.util.ArrayList;

import models.*;

public interface IVeiculoController {
    void cadastrar(Veiculo veiculo);
    ArrayList<Veiculo> listar();
    Veiculo buscarPorId(int id);
    void removeVeiculo(int id);
    void changeStatus(int id, boolean status);
    double getValorDiaria(int id);
}
