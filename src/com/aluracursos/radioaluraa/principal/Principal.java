package com.aluracursos.radioaluraa.principal;

import com.aluracursos.modelos.Cancion;
import com.aluracursos.modelos.MisFavoritos;
import com.aluracursos.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
         miCancion.setTitulo("A.P.T");
         miCancion.setGenero("K-pop");
         miCancion.setCanante("Rosie");
         miCancion.setAlbum("New Rosie");

        Podcast nuevoPodcast = new Podcast();
        nuevoPodcast.setTitulo("Las Aluciones");
        nuevoPodcast.setPresentador("Lupita Villalobos y Kass Quezada");
        nuevoPodcast.setDescripcion("Comedia de Lupita y Kass");


         for (int i=0; i <4;i++) {
             miCancion.meGusta();
         }
        for (int i = 0; i <100 ; i++) {
            miCancion.reproduce();
        }

        for (int i=0; i <100; i++ ){
            nuevoPodcast.meGusta();
        }
        for (int i=0; i<500; i++){
            nuevoPodcast.reproduce();
        }
        System.out.println(miCancion.getTotalDeReproducciones() + " Total  de reproducciones ");
        System.out.println(miCancion.getTotalDeMegusta()+" Total de me gusta");
        System.out.println(miCancion.getCalificacion() + " Calificación");
        MisFavoritos fav = new MisFavoritos();
        fav.adiciona(miCancion);

        System.out.println("****************************************");
        System.out.println(nuevoPodcast.getTotalDeReproducciones() + " Total de reproduciones");
        System.out.println(nuevoPodcast.getTotalDeMegusta() + " Total de megusta");
        System.out.println(nuevoPodcast.getCalificacion()+ " Calificación");
        MisFavoritos favPodcast = new MisFavoritos();
        favPodcast.adiciona(nuevoPodcast);

    }
}
