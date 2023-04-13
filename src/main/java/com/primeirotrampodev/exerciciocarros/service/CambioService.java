package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.Cambio;
import org.springframework.stereotype.Service;

@Service

public class CambioService {

    public Cambio cambio1(Integer idCambio) {

        Cambio cambioAuto = new Cambio();
        cambioAuto.setId(1);
        cambioAuto.setNome("Automatico");

        Cambio cambioManual = new Cambio();
        cambioManual.setNome("Manual");
        cambioManual.setId(2);

        if (idCambio.equals(2)) {
            return cambioManual;
        } else if (idCambio.equals(1)) {
            return cambioAuto;
        } else {
        }
        return new Cambio();
    }
}
