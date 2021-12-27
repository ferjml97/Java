
package figuras;


public class Cuadrado {
 private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "CUADRADO" + "\nLado=" + lado + "\nPerimetro: "+perimetro()+"\nArea: "+area();
    }
 public void imprimir(){
 System.out.println(toString());
 }
 
 public double perimetro(){
 return getLado()*4;
 }
 
 public double area(){
 return (getLado()*getLado());
 }
}
