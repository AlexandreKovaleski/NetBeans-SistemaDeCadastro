package br.edu.atitus.poo.projetofinal.dao;

import br.edu.atitus.poo.projetofinal.dados.Departamento;
import br.edu.atitus.poo.projetofinal.dados.Usuario;
import java.util.ArrayList;
import java.util.List;

public abstract class Database {
    public static List<Departamento> departamentosDB;
    public static List<Usuario> usuariosDB;
    static {
        departamentosDB = new ArrayList<>();
        departamentosDB.add(new Departamento(1, "Faturamento"));
        departamentosDB.add(new Departamento(2, "Gestão de Pessoas"));
        departamentosDB.add(new Departamento(3, "Informática"));
        
        usuariosDB = new ArrayList<>();
        usuariosDB.add(new Usuario(10, "Ryan", departamentosDB.get(0)));
    }
}
