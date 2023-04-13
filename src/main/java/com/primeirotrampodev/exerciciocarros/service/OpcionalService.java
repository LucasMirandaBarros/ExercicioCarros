package com.primeirotrampodev.exerciciocarros.service;

import com.primeirotrampodev.exerciciocarros.object.Opcional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpcionalService {

    public List<Opcional> getOpicionais (List<Integer> opcionalIdlist){

        Opcional opcional1 = new Opcional();
        opcional1.setId(1);
        opcional1.setNome("Vidro elétrico");

        Opcional opcional2 = new Opcional();
        opcional2.setId(2);
        opcional2.setNome("Trava elétrica");

        Opcional opcional3 = new Opcional();
        opcional3.setId(3);
        opcional3.setNome("Ar-condicionado");

        Opcional opcional4 = new Opcional();
        opcional4.setId(4);
        opcional4.setNome("Direção hidráulica");

        Opcional opcional5 = new Opcional();
        opcional5.setId(5);
        opcional5.setNome("Airbags");

        Opcional opcional6 = new Opcional();
        opcional6.setId(6);
        opcional6.setNome("Bancos de couro");

        Opcional opcional7 = new Opcional();
        opcional7.setId(7);
        opcional7.setNome("Central Multimídia");

        Opcional opcional8 = new Opcional();
        opcional8.setId(8);
        opcional8.setNome("Sensor de Estacionamento");

        Opcional opcional9 = new Opcional();
        opcional9.setId(9);
        opcional9.setNome("Retrovisor Eletrocrômico");

        Opcional opcional10 = new Opcional();
        opcional10.setId(10);
        opcional10.setNome("Controle de estabilidade");


       List<Opcional> opcionalList = new ArrayList<>();

       for (Integer cont = 0; cont < opcionalIdlist.size(); cont++){
            Integer idOpcional = opcionalIdlist.get(cont);

            if(idOpcional.equals(1)){
                opcionalList.add(opcional1);
            } else if (idOpcional.equals(2)) {
                opcionalList.add(opcional2);
            } else if (idOpcional.equals(3)) {
                opcionalList.add(opcional3);
            } else if (idOpcional.equals(4)) {
                opcionalList.add(opcional4);
            } else if (idOpcional.equals(5)) {
                opcionalList.add(opcional5);
            } else if (idOpcional.equals(6)) {
                opcionalList.add(opcional6);
            } else if (idOpcional.equals(7)) {
                opcionalList.add(opcional7);
            } else if (idOpcional.equals(8)) {
                opcionalList.add(opcional8);
            } else if (idOpcional.equals(9)) {
                opcionalList.add(opcional9);
            } else if (idOpcional.equals(10)) {
                opcionalList.add(opcional10);
            }

       }
       return opcionalList;

    }

}


//if (idOpcional.equals(1)){
//            return opcional1;
//        } else if (idOpcional.equals(2)){
//            return opcional2;
//        } else if (idOpcional.equals(3)){
//            return opcional3;
//        } else if (idOpcional.equals(4)){
//            return opcional4;
//        } else if (idOpcional.equals(5)){
//            return opcional5;
//        } else if (idOpcional.equals(6)){
//            return opcional6;
//        } else if (idOpcional.equals(7)){
//            return opcional7;
//        } else if (idOpcional.equals(8)){
//            return opcional8;
//        } else if (idOpcional.equals(9)){
//            return opcional9;
//        } else if (idOpcional.equals(10)){
//            return opcional10;
//        } else {
//            return new Opcional();
//        }