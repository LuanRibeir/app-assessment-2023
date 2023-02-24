package br.edu.infnet.appconfeitaria.model.repository;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;

public class AcessoRepository {
    public static Usuario autenticar(Usuario usuario) {
        if(usuario.getEmail().equalsIgnoreCase(usuario.getSenha())){
            return new Usuario("Admin", usuario.getEmail(), usuario.getSenha());
        }
        return null;
    }
}
