package models;

import controllers.LocacaoController;

public class Locacao {
    private int id;
    private Veiculo veiculo;
    private Clientes clientes;
    private Funcionario funcionario;
    private int diasLocados;
    private Double valorFinal;

    LocacaoController locacaoController = new LocacaoController();

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = locacaoController.getListLenth();
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


    public Clientes getClientes() {
        return clientes;
    }
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }


    public Funcionario getfuncionario() {
        return funcionario;
    }
    public void setfuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Double getValorFinal() {
        return valorFinal;
    }
    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getDiasLocados() {
        return diasLocados;
    }
    public void setDiasLocados(int diasLocados) {
        this.diasLocados = diasLocados;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nCliente: " + "\n"+  clientes + "\n" + "Funcionário reponsável pela locação : " + "\n"+ funcionario + "\n" + "Veículo alugado: " + "\n" + veiculo + "\nQuantidade de dias locados: " + diasLocados + "\nValor final da locação: " + valorFinal;
    }
}