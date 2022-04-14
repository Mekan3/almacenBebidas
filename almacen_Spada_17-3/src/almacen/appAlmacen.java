/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

public class appAlmacen {
    
    public static void main(String[] args) {
        
        Datos matriz = new Datos (4, 4);
    
        BebidaAzucarada cocaCola = new BebidaAzucarada("1", (float)2.5, 25, "Coca", 15, true);
        AguaMineral villavicencio = new AguaMineral("2", (float)1.75, (float)24.5, "Villavicencio", "Sierra de los Padres");
        
        BebidaAzucarada sprite = new BebidaAzucarada("3", (float)2.5, 100, "Sprite", 15, false);
        BebidaAzucarada spriteNew = new BebidaAzucarada("4", (float)2.5, 150, "Sprite", 15, true);
        
        matriz.agregarProducto(cocaCola);
        matriz.agregarProducto(villavicencio);
        
        matriz.mostrarInformacion();
        
        matriz.eliminarProducto("1");
        
        matriz.mostrarInformacion();
        
        matriz.agregarProducto(sprite);
        matriz.agregarProducto(spriteNew);        
        
        matriz.mostrarInformacion();
        
        System.out.println("El precio de todas las bebidas es: " + matriz.calcularPrecioBebidas());
        
        System.out.println("El precio de todas las bebidas de la marca seleccionada es " + matriz.calcularPrecioTotalMarca("Sprite"));
                
    }
    
}
