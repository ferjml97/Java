
package figuras;


public class Circulo {
  private double radio;
  private static final double PI =3.1416;   //Al declararlo static se queda en la clase y desde ahi puedan accesar a ella no gastando espacio.

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "CIRCULO" + "\nRadio=" + radio +"\nPerimetro: "+perimetro()+"\nArea: "+area();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public double perimetro(){
    return PI*getRadio()*2;
    }
    
    public double area(){
    return PI*getRadio()*getRadio();
    }
  
  
}
