/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author cesarvefe
 */
public class ItemRentado implements Serializable {

    private int id;

    private Item item;
    private Date fechaInicioRenta;
    private Date fechaFinRenta;

    public ItemRentado(int id, Item item, Date fechaInicioRenta, Date fechaFinRenta) {
        this.id = id;
        this.item = item;
        this.fechaInicioRenta = fechaInicioRenta;
        this.fechaFinRenta = fechaFinRenta;
    }

    public ItemRentado() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getfechaInicioRenta() {
        return fechaInicioRenta;
    }

    public void setfechaInicioRenta(Date fechaInicioRenta) {
        this.fechaInicioRenta = fechaInicioRenta;
    }

    public Date getfechaFinRenta() {
        return fechaFinRenta;
    }

    public void setfechaFinRenta(Date fechaFinRenta) {
        this.fechaFinRenta = fechaFinRenta;
    }

    @Override
    public String toString() {
        return "ItemRentado{" + "id=" + id + ", item=" + item + ", fechaInicioRenta=" + fechaInicioRenta + ", fechaFinRenta=" + fechaFinRenta + '}';
    }

    
    
}
