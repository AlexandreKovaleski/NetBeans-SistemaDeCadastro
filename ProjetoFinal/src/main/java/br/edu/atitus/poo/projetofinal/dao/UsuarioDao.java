package br.edu.atitus.poo.projetofinal.dao;
import br.edu.atitus.poo.projetofinal.dados.Usuario;
import java.util.List;

public class UsuarioDao {
    public Usuario save(Usuario usuario) {
        if (usuario.getId() <= 0) {
            int idMaior = 0;
            for (int i = 0; i < Database.usuariosDB.size(); i++) {
                if (Database.usuariosDB.get(i).getId() > idMaior)
                    idMaior = Database.usuariosDB.get(i).getId();
            }
            usuario.setId(++idMaior);
            Database.usuariosDB.add(usuario);
        } else {
            for (int i = 0; i < Database.usuariosDB.size(); i++) {
                if (Database.usuariosDB.get(i).getId() == usuario.getId()){
                    Database.usuariosDB.get(i).setNome(usuario.getNome());
                    Database.usuariosDB.get(i).setDepartamento(usuario.getDepartamento());
                    break;
                }
            }
        }
        
        return usuario;
    }
    public List<Usuario> findAll() {
        return Database.usuariosDB;
    }
    public void removeById(int id) {
        for (int i = 0; i < Database.usuariosDB.size(); i++) {
            if (id == Database.usuariosDB.get(i).getId()) {
                Database.usuariosDB.remove(i);
                break;
            }
        }
    }
}
