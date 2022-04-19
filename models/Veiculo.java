package models;

public class Veiculo {

    private String id;
    private String nome;
    private String fabricante;
    private String placaDoVeiculoString;
    private String cor;
    private String situacaoDoVeiculo;
    private String anoDoModelo;
    private String km;
    private double valorDiaria

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getPlacaDoVeiculoString() {
        return placaDoVeiculoString;
    }
    public void setPlacaDoVeiculoString(String placaDoVeiculoString) {
        this.placaDoVeiculoString = placaDoVeiculoString;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getSituacaoDoVeiculo() {
        return situacaoDoVeiculo;
    }
    public void setSituacaoDoVeiculo(String situacaoDoVeiculo) {
        this.situacaoDoVeiculo = situacaoDoVeiculo;
    }
    public String getAnoDoModelo() {
        return anoDoModelo;
    }
    public void setAnoDoModelo(String anoDoModelo) {
        this.anoDoModelo = anoDoModelo;
    }
    public String getKm() {
        return km;
    }
    public void setKm(String km) {
        this.km = km;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "Nome do veículo: " + nome + " Nome do fabricante: " + fabricante + " Placa do veículo: " + placaDoVeiculoString + " Cor do veículo: " + cor + " Situação do veículo: " + situacaoDoVeiculo + " Ano do modelo: " + anoDoModelo " Km do veículo: " + km " Valor diária: " + valorDiaria;
    }



}
