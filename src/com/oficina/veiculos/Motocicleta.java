package com.oficina.veiculos;

public class Motocicleta extends Veiculo{
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String exibirDetalhes(){
        return (("Marca: "+getMarca()) + "\nModelo: "+getModelo() + "\nAno: "+getAno() + "\nCilindradas: " + getCilindradas());
    }

}
