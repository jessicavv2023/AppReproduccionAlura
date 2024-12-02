package com.aluracursos.modelos;

public class MisFavoritos {
   public void adiciona (Audio audio){
        if (audio.getCalificacion() >=8 ){
            System.out.println(audio.getTitulo()+ " Es uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitulo() +" Es tu descubrimeinto");
        }
    }
}
