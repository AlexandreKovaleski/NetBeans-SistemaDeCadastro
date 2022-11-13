package br.edu.atitus.poo.projetofinal.dados;

public class Usuario extends GenericDados {
    
    private String nome;
    private Departamento departamento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Usuario() {
        this(0, "", null);
    }
    
    public Usuario(int id, String nome, Departamento departamento) {
        this.setId(id);
        this.nome = nome;
        this.departamento = departamento;
    }
    
    
    
}
