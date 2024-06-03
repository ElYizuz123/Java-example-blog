
package com.mycompany.tap_u1p8.clases;

/**
 *
 * @author chuy-
 */
public class Respuesta {
    private String idTema;
    private String idRespuesta;
    private String autorRespuesta;
    private String respuesta;
    private int likes;

    public Respuesta() {
    }

    public Respuesta(String idTema, String idRespuesta, String autorRespuesta, String respuesta, int likes) {
        this.idTema = idTema;
        this.idRespuesta = idRespuesta;
        this.autorRespuesta = autorRespuesta;
        this.respuesta = respuesta;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getIdTema() {
        return idTema;
    }

    public void setIdTema(String idTema) {
        this.idTema = idTema;
    }

    public String getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getAutorRespuesta() {
        return autorRespuesta;
    }

    public void setAutorRespuesta(String autorRespuesta) {
        this.autorRespuesta = autorRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "idTema=" + idTema + ", idRespuesta=" + idRespuesta + ", autorRespuesta=" + autorRespuesta + ", respuesta=" + respuesta + ", likes=" + likes + '}';
    }
    
}
