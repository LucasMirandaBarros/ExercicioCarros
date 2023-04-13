package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario vendedor(Integer idDoUsuario, String nomeDeUsuario, String telefoneDeUsuario){

        Usuario usuario = new Usuario();
        usuario.setId(idDoUsuario);
        usuario.setNome(nomeDeUsuario);
        usuario.setTelefone(telefoneDeUsuario);

        return usuario;
    }
}
