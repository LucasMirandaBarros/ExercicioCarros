package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.Cambio;
import com.primeirotrampodev.exerciciocarros.object.Carro;
import com.primeirotrampodev.exerciciocarros.object.Opcional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CambioService cambioService;

    @Autowired
    private OpcionalService opcionalService;
    public Carro carrosAnunciados(Integer idCarro, Integer idCambio, List<Integer> opicionalIdList) {

        Carro carro1 = new Carro();
        carro1.setId(1);
        carro1.setNome("Polo gts");
        carro1.setMarca("Volksvagem");
        carro1.setCambio(cambioService.cambio1(idCarro));
        carro1.setCor("Vermelho");
        carro1.setAnoModelo("20/21");
        carro1.setOpcionalList(opcionalService.getOpicionais(opicionalIdList));

        Carro carro2 = new Carro();
        carro2.setId(2);
        carro2.setNome("Sandero");
        carro2.setMarca("Renaut");
        carro2.setCambio(cambioService.cambio1(idCarro));
        carro2.setCor("Prata");
        carro2.setAnoModelo("20/20");
        carro2.setOpcionalList(opcionalService.getOpicionais(opicionalIdList));

        Carro carro3 = new Carro();
        carro3.setId(3);
        carro3.setNome("Prisma joy");
        carro3.setMarca("Chevrolet");
        carro3.setCambio(cambioService.cambio1(idCarro));
        carro3.setCor("Prata");
        carro3.setAnoModelo("13/14");
        carro3.setOpcionalList(opcionalService.getOpicionais(opicionalIdList));

        Carro carro4 = new Carro();
        carro4.setId(4);
        carro4.setNome("L200 Sport");
        carro4.setMarca("Mitsubishi");
        carro4.setCambio(cambioService.cambio1(idCarro));
        carro4.setCor("Amarelo");
        carro4.setAnoModelo("20/21");
        carro4.setOpcionalList(opcionalService.getOpicionais(opicionalIdList));

        Carro carro5 = new Carro();
        carro5.setId(1);
        carro5.setNome("RS6");
        carro5.setMarca("Audi");
        carro5.setCambio(cambioService.cambio1(idCarro));
        carro5.setCor("Azul");
        carro5.setAnoModelo("22/23");
        carro5.setOpcionalList(opcionalService.getOpicionais(opicionalIdList));

        if (idCarro.equals(1)){
            return carro1;
        } else if (idCarro.equals(2)){
            return carro2;
        } else if (idCarro.equals(3)){
            return carro3;
        } else if (idCarro.equals(4)){
            return carro4;
        } else if (idCarro.equals(5)){
            return carro5;
        } else {
            return new Carro();
        }

    }
}
