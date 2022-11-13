package br.edu.atitus.poo.projetofinal.dao;

import br.edu.atitus.poo.projetofinal.dados.Departamento;
import java.util.List;

public class DepartamentoDao {
    public Departamento save(Departamento departamento) {
        if (departamento.getId() <= 0) {
            int idMaior = 0;
            for (int i = 0; i < Database.departamentosDB.size(); i++) {
                if (Database.departamentosDB.get(i).getId() > idMaior)
                    idMaior = Database.departamentosDB.get(i).getId();
            }
            departamento.setId(++idMaior);
            Database.departamentosDB.add(departamento);
        } else {
            for (int i = 0; i < Database.departamentosDB.size(); i++) {
                if (Database.departamentosDB.get(i).getId() == departamento.getId()){
                    Database.departamentosDB.get(i).setNome(departamento.getNome());
                    break;
                }
            }
        }
        
        return departamento;
    }
    public List<Departamento> findAll() {
        return Database.departamentosDB;
    }
    public void removeById(int id) {
        for (int i = 0; i < Database.departamentosDB.size(); i++) {
            if (id == Database.departamentosDB.get(i).getId()) {
                Database.departamentosDB.remove(i);
                break;
            }
        }
    }
}
