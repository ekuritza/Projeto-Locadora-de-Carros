package models;

public class Moto extends Veiculo{

    private String cilindrada;

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Nome do veículo: " + getNome() + "\nNome do fabricante: " + getFabricante() + "\nPlaca do veículo: " + getPlacaDoVeiculo() + "\nCor do veículo: " + getCor() + "\nSituação do veículo: " + getSituacaoDoVeiculo() + "\nAno do modelo: " + getAnoDoModelo() + "\nKm do veículo: " + getKm()  + "\nValor diária: " + getValorDiaria() + "\n" + "Cilindrada: " +  cilindrada + "\n";
        
    }
}
