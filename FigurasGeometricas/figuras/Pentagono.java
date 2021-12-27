
package figuras;

public class Pentagono {
    private double lado;
    private double apotema;

    public Pentagono() {
    }

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public double getApotema() {
        return apotema;
    }

    @Override
    public String toString() {
        return "PENTAGONO"+"\nLado: "+lado+"\nApotema: "+apotema+"\nPerimetro: "+perimetro()+"\nArea: "+area();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public double perimetro(){
    return lado*5;
    }
    
    public double area(){
    return (perimetro()*apotema)/2;
    }
    
    
}
