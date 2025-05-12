package com.oficina.veiculos;

public class Carro extends Veiculo{
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String exibirDetalhes(){
        return (("Marca: "+getMarca()) + "\nModelo: "+getModelo() + "\nAno: "+getAno() + "\nQuantidade de portas: " + getQuantidadeDePortas());
    }
}
