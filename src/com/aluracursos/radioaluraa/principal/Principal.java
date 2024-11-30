package com.aluracursos.radioaluraa.principal;

import com.aluracursos.modelos.Cancion;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
         miCancion.setTitulo("A.P.T");
         miCancion.setGenero("K-pop");
         miCancion.setCanante("Rosie");
         miCancion.setAlbum("New R0");
         miCancion.setTotalDeMegusta(1);
         miCancion.setCalificacion(4);


         for (int i=0; i <100;i++) {
             miCancion.meGusta();
         }
        for (int i = 0; i <100 ; i++) {
            miCancion.reproduce();
        }
        System.out.println(miCancion.getTotalDeReproducciones() + " Total  de reproduccones ");
        System.out.println(miCancion.getTotalDeReproducciones()+" Total de reproducciones");

    }
}
