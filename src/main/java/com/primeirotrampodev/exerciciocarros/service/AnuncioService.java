package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.Anuncio;
import com.primeirotrampodev.exerciciocarros.object.Carro;
import com.primeirotrampodev.exerciciocarros.object.PlanoDePagemento;
import com.primeirotrampodev.exerciciocarros.object.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CarroService carroService;

    @Autowired
    private PlanoDePagamentoService planoDePagemento;

    public Anuncio anuncioDoVendedor(Integer idDoUsuario, String nomeDeUsuario, String telefoneDeUsuario, Integer idCarro,
                                     Integer idCambio, Integer idplanoDePagamento, List<Integer> opcionalIdList){

        Anuncio anuncio = new Anuncio();
        anuncio.setUsuario(usuarioService.vendedor(idDoUsuario, nomeDeUsuario, telefoneDeUsuario));
        anuncio.setCarro(carroService.carrosAnunciados(idCarro, idCambio, opcionalIdList));
        anuncio.setPlanoDePagemento(planoDePagemento.planoDePagemento(idplanoDePagamento));

        return anuncio;
    }
}
