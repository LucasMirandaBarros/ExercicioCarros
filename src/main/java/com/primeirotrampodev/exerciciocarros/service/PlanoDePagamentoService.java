package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.PlanoDePagemento;
import org.springframework.stereotype.Service;

@Service
public class PlanoDePagamentoService {

    public PlanoDePagemento planoDePagemento(Integer idplanoDePagamento){

        PlanoDePagemento planoDePagemento1 = new PlanoDePagemento();
        planoDePagemento1.setId(1);
        planoDePagemento1.setNome("15 dias");
        planoDePagemento1.setValor(30.00);

        PlanoDePagemento planoDePagemento2 = new PlanoDePagemento();
        planoDePagemento2.setId(2);
        planoDePagemento2.setNome("30 dias");
        planoDePagemento2.setValor(50.00);

        PlanoDePagemento planoDePagemento3 = new PlanoDePagemento();
        planoDePagemento3.setId(3);
        planoDePagemento3.setNome("60 dias");
        planoDePagemento3.setValor(90.00);

        if (idplanoDePagamento.equals(1)){
            return planoDePagemento1;
        } else if (idplanoDePagamento.equals(2)) {
            return planoDePagemento2;
        } else if (idplanoDePagamento.equals(3)) {
            return planoDePagemento3;
        }else {
            return new PlanoDePagemento();
        }

    }
}
