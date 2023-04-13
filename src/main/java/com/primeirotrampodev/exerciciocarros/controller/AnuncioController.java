package com.primeirotrampodev.exerciciocarros.controller;

import com.primeirotrampodev.exerciciocarros.object.Anuncio;
import com.primeirotrampodev.exerciciocarros.object.Usuario;
import com.primeirotrampodev.exerciciocarros.service.AnuncioService;
import com.primeirotrampodev.exerciciocarros.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anuncio-controller")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/anuncio")
    public Anuncio anuncio(@RequestParam("idDoUsuario")Integer idDoUsuario,
                           @RequestParam("nomeDeUsuario")String nomeDeUsuario,
                           @RequestParam("telefoneDeUsuario")String telefoneDeUsuario,
                           @RequestParam("idCarro")Integer idCarro,
                           @RequestParam("idCambio")Integer idCambio,
                           @RequestParam("idPlanoDePagamento")Integer idplanoDePagamento,
                           @RequestParam("idOpcionais") List<Integer> opcionalIdList){
        return anuncioService.anuncioDoVendedor(idDoUsuario, nomeDeUsuario, telefoneDeUsuario,idCarro, idCambio, idplanoDePagamento, opcionalIdList);
    }
}
