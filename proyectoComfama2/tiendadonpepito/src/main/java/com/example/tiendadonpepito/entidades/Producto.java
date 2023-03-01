package com.example.tiendadonpepito.entidades;

public class Producto {

    private Integer id;
    private String nombre;
    private String foto;
    private String descripcion;
    private Integer cantidad;
    private Double precioUnitario;
    private String clasificacion;
    private String marca;
    private String presetacion;
    private Double peso;
    private Boolean estado;
    private String proveedor;
    private Double volumen;
    private String fechaIngreso;
    private String fechaVencimiento;
    private Boolean aplicaDescuento;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, Integer cantidad, Double precioUnitario, String clasificacion, String marca, String presetacion, Double peso, Boolean estado, String proveedor, Double volumen, String fechaIngreso, String fechaVencimiento, Boolean aplicaDescuento, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.clasificacion = clasificacion;
        this.marca = marca;
        this.presetacion = presetacion;
        this.peso = peso;
        this.estado = estado;
        this.proveedor = proveedor;
        this.volumen = volumen;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.aplicaDescuento = aplicaDescuento;
        this.foto = foto;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfoto() {
        return foto;
    }

    public void setfoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresetacion() {
        return presetacion;
    }

    public void setPresetacion(String presetacion) {
        this.presetacion = presetacion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(Boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }
}
