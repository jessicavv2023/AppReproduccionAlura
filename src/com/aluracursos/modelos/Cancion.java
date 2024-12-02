package com.aluracursos.modelos;

public class Cancion extends Audio {
     private String album;
     private String canante;
     private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCanante() {
        return canante;
    }

    public void setCanante(String canante) {
        this.canante = canante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getCalificacion() {

        if (getTotalDeMegusta() > 10) {
            return 8;
        }else {
            return 4;
        }



    }
}
