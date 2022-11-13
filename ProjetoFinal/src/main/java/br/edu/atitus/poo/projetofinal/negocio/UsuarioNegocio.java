package br.edu.atitus.poo.projetofinal.negocio;

import br.edu.atitus.poo.projetofinal.dados.Usuario;
import br.edu.atitus.poo.projetofinal.dao.UsuarioDao;
import java.util.List;

public class UsuarioNegocio {
    
    private UsuarioDao dao;
    
    public UsuarioNegocio() {
        this.dao = new UsuarioDao();
    }
    
    public Usuario save(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            //TODO tratamento de erro
        }
        return this.dao.save(usuario);
    }
    
    public List<Usuario> findAll() {
        return this.dao.findAll();
    }
    
    public void removeById(int id) {
        this.dao.removeById(id);
    }
    
}
