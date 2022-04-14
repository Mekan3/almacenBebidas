/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;


public class Datos {
    private int c, f;
    private Bebida[][] estanteria;
    
    public Datos(int f, int c){
        this.c = c;
        this.f = f;
        this.estanteria = new Bebida[f][c];
    };

    public int getC() {
        return c;
    }

    public int getF() {
        return f;
    }

    public Bebida[][] getEstanteria() {
        return estanteria;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setF(int f) {
        this.f = f;
    }

    public void setEstanteria(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }
    
    public void agregarProducto(Bebida b){
        int x, y;
        boolean encontrado=false;
        
        for(x=0; x<f && !encontrado; x++){
            for(y=0; y<c && !encontrado; y++){
                if(estanteria[x][y]==null){
                    estanteria[x][y]=b;
                    encontrado=true;
                }
            }
        }
        
    };
    
    public void eliminarProducto(String identificador){
        int x, y;
        boolean encontrado=false;
        
        for(x=0; x<f && !encontrado; x++){
            for(y=0; y<c && !encontrado; y++){
                if(estanteria[x][y].getId().equals(identificador)){
                    estanteria[x][y]=null;
                    encontrado=true;
                }
            }
        }
        
    };
    
    public double calcularPrecioBebidas(){
        int x, y;
        double total=0;
        
        for(x=0; x<f; x++){
            for(y=0; y<c; y++){
                if(estanteria[x][y]!=null)total+=estanteria[x][y].getPrecio();
            }
        }
        
        return total;
        
    };
    
    public double calcularPrecioTotalMarca(String marca){
        int x, y;
        double total=0;
        
        for(x=0; x<f; x++){
            for(y=0; y<c; y++){
                if(estanteria[x][y]!=null){
                    if(estanteria[x][y].getMarcas().equals(marca))total+=estanteria[x][y].getPrecio();
                }
            }
        }
        
        return total;
        
    };
    
    public void mostrarInformacion(){
        int x, y;
        
        for(x=0; x<f; x++){
            for(y=0; y<c; y++){
                if(estanteria[x][y]!=null){
                    System.out.println("Fila: "+ x + " Columna: " + y + " Bebida: "+estanteria[x][y].toString());
                }
            }
        }
        
    };
    
}
