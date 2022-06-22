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
        return "Cambio: " + cambio;
    }
}
