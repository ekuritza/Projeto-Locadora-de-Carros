package models;

public class Carro extends Veiculo{

    private String cambio;

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    
    @Override
    public String toString() {
        return "Nome do veículo: " + getNome() + "\nNome do fabricante: " + getFabricante() + "\nPlaca do veículo: " + getPlacaDoVeiculo() + "\nCor do veículo: " + getCor() + "\nSituação do veículo: " + getSituacaoDoVeiculo() + "\nAno do modelo: " + getAnoDoModelo() + "\nKm do veículo: " + getKm()  + "\nValor diária: " + getValorDiaria() + "\n" + "Cambio: " +  cambio + "\n";
        
    }
}
