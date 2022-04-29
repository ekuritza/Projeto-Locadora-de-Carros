package models;

public class Clientes{
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String cnh;
    private String validadeHabilitacao;
    private String categoriaHabilitacao;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String getValidadeHabilitacao() {
        return validadeHabilitacao;
    }
    public void setValidadeHabilitacao(String validadeHabilitacao) {
        this.validadeHabilitacao = validadeHabilitacao;
    }
    public String getCategoriaHabilitacao() {
        return categoriaHabilitacao;
    }
    public void setCategoriaHabilitacao(String categoriaHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento + 
        "\nNº CNH: " + cnh + "\nValidade: " + validadeHabilitacao + "\nCategoria: " +  categoriaHabilitacao + "\nEndereço: " + endereco + 
        "\nNº: " + numero + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nUF: " + estado + "\nCEP: " + cep  + "\n";
    }
}
