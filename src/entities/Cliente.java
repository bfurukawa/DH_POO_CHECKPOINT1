package entities;

import entities.subclass.Endereco;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private int rg;
    private String telefone;
    private Endereco endereco;

    public Cliente(int id, String nome, String sobrenome, int rg, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //Getter e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg=" + rg +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    //Metodos
    public void banhoPet(){
        System.out.println("leva cachorro para tomar banho");
    }
    public void tosarPet(){
        System.out.println("leva cachorro para tosar");
    }
    public void consultaPet(){
        System.out.println("leva cachorro para fazer consulta");
    }
}
