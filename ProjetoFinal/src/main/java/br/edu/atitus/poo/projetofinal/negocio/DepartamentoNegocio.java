package br.edu.atitus.poo.projetofinal.negocio;

import br.edu.atitus.poo.projetofinal.dados.Departamento;
import br.edu.atitus.poo.projetofinal.dao.DepartamentoDao;
import java.util.List;

public class DepartamentoNegocio {
    
    private DepartamentoDao dao;
    
    public DepartamentoNegocio() {
        this.dao = new DepartamentoDao();
    }
    
    public Departamento save(Departamento departamento) {
        if (departamento.getNome() == null || departamento.getNome().isEmpty()) {
            //TODO tratamento de erro
        }
        return this.dao.save(departamento);
    }
    
    public List<Departamento> findAll() {
        return this.dao.findAll();
    }
    
    public void removeById(int id) {
        this.dao.removeById(id);
    }
    
}
