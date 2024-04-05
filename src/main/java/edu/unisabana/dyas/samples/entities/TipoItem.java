    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package edu.unisabana.dyas.samples.entities;

    import java.io.Serializable;

    /**
     *
     * @author cesarvefe
     */
    public class TipoItem implements Serializable{
        private int id;
        private String descripcion;

        public TipoItem(int id, String descripcion) {
            this.id = id;
            this.descripcion = descripcion;
        }

        public TipoItem() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "TipoItem [id=" + id + ", descripcion=" + descripcion + "]";
        }
        
        

        
    }
