package com.example.fabio.checkout;

/**
 * Created by fabio on 19/04/2016.
 */
public class Checkout {
    private String cliente;
    private int numCheckout;
    private String alistado;
    private String bodega;

    Checkout(){

    }

    public String getCliente() { return cliente; }

    public int getNumCheckout() { return numCheckout; }

    public String getAlistado() { return alistado; }

    public String getBodega() { return bodega; }



    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumCheckout(int numCheckout) {
        this.numCheckout = numCheckout;
    }

    public void setAlistado(String alistado) {
        this.alistado = alistado;
    }
}
