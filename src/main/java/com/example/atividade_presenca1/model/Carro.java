package com.example.atividade_presenca1.model;

/**
 * Carro
 */
public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int Ano;
    private int Km;
    private String combustivel;
    private float preco;

    public Carro(){}

    public Carro(int id,String marca,String modelo,int Ano,int Km,String combustivel,float preco){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = Ano;
        this.Km = Km;
        this.combustivel = combustivel;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro [Ano=" + Ano + ", Km=" + Km + ", combustivel=" + combustivel + ", id=" + id + ", marca=" + marca
                + ", modelo=" + modelo + ", preco=" + preco + "]";
    }

    


}