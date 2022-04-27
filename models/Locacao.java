/*  */package models;

public class Locacao {
    private Veiculo veiculo;
    private Clientes clientes;
    private Funcionario funcionario;
    private int diasLocados;
    private int valorFinal;
    
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

    public int getValorFinal() {
        return valorFinal;
    }
    public void setValorFinal(int valorFinal) {
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
        return "Cliente: " + clientes + "\nFuncionário: " + funcionario + "\nVeículo: " + veiculo + "\nQuantidade de dias locados: " + diasLocados + "\nValor final da locação: " + valorFinal;
    }
}