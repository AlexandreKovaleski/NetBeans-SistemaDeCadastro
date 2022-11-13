
package br.edu.atitus.poo.projetofinal.dados;

public class Departamento extends GenericDados {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Departamento() {
        this(0, "");
    }
    
    public Departamento(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
