/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerTallerTercerCorte;

/**
 *
 * @author luisc
 */
public class Factura {
    private int codigoProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private double precioProducto;
    private double impuestoProducto;
    private double precioTotalProducto;

    public Factura(int codigoProducto, String nombreProducto, int cantidadProducto, double precioProducto, double impuestoProducto, double precioTotalProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.impuestoProducto = impuestoProducto;
        this.precioTotalProducto = precioTotalProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public double getImpuestoProducto() {
        return impuestoProducto;
    }

    public double getPrecioTotalProducto() {
        return precioTotalProducto;
    }
} 

