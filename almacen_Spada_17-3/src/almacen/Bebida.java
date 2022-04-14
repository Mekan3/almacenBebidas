/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

abstract public class Bebida {
    private String id;
    private float cantLitros;
    private float precio;
    private String marcas;
    
    public Bebida(){
        
    };
    public Bebida(String id, float cantLitros, float precio, String marcas){
        this.id = id;
        this.cantLitros = cantLitros;
        this.precio = precio;
        this.marcas = marcas;
    };

    public String getId() {
        return id;
    }

    public float getCantLitros() {
        return cantLitros;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarcas() {
        return marcas;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setCantLitros(float cantLitros) {
        this.cantLitros = cantLitros;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    @Override
    public String toString() {
        return "Identificador: " + id + " Cantidad de Litros: " + cantLitros + " Precio: " + precio + " Marca: " + marcas;
    }
        
}
