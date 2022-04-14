/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;


public class AguaMineral extends Bebida{
    private String origen;

    public AguaMineral(String id, float cantLitros, float precio, String marcas, String origen) {
        super(id, cantLitros, precio, marcas);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + " Origen: " + origen;
    }
    
}
