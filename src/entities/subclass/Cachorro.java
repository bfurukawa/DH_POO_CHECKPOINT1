package entities.subclass;

import entities.Cliente;

public class Cachorro {

    private int id;
    private Cliente dono;
    private String nome;
    private int idade;
    private boolean gostaDaVet;

    public Cachorro(int id, Cliente dono, String nome, int idade, boolean gostaDaVet) {
        this.id = id;
        this.dono = dono;
        this.nome = nome;
        this.idade = idade;
        this.gostaDaVet = gostaDaVet;
    }

    //Getters Setters

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isGostaDaVet() {
        return gostaDaVet;
    }

    public void setGostaDaVet(boolean gostaDaVet) {
        this.gostaDaVet = gostaDaVet;
    }

    public int getId() {
        return id;
    }

    // Métodos
    public void comer(){
        System.out.println("Coloca Comida pro cachorro.");
    }

    public void brincar(){
        System.out.println("Brincando com o cachorro.");
    }
}
