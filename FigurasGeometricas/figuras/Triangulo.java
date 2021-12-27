
package figuras;


public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base) {
        this.base = base;
    }
   
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
   
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    

    @Override
    public String toString() {
        return "TRIANGULO" + "\nBase=" + base + "\nAltura=" + altura + "\nPerimetro: "+perimetro()+"\nArea: "+area();
    }
     public void imprimir(){
     System.out.println(toString());
         
     }
     
     public double perimetro(){
     return getBase()*3;
     }
     public double area(){
     return (getBase()*getAltura())/2;
     }
    
}
