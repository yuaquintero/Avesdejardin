package com.example.administrador.avesdejardin;



/**
 * Created by Proyectos on 20/02/2017.
 */

public class LugarTuristico {


    private String nombre;
    private String direccion;
    private byte [] servicios;
    private int telefono;
    private String email;
    private double distancia;
    private String ruta;
    private double lat;
    private double lon;
    private String foto;
    private double valoracion;
    private String comentario;


    /**
     *
     * @param _nombre
     * @param _direccion
     * @param _telefono
     * @param _email
     * @param _distancia
     * @param _ruta
     * @param _lat
     * @param _lon
     * @param _foto
     * @param _valoracion
     * @param _comentario
     */

    public LugarTuristico(String _nombre,
                          String _direccion, int _telefono, String _email, double _distancia, String _ruta,
                          double _lat, double _lon, String _foto, double _valoracion, String _comentario) {

            this.nombre=_nombre;
            this.direccion=_direccion;
           // this.servicios=_servicios;
            this.telefono=_telefono;
            this.email=_email;
            this.distancia=_distancia;
            this.ruta=_ruta;
            this.lat=_lat;
            this.lon=_lon;
            this.foto=_foto;
            this.valoracion=_valoracion;
            this.comentario=_comentario;

    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getServicios() {
        return servicios;
    }

    public void setServicios(byte[] servicios) {
        this.servicios = servicios;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }



}
