
package figuras;


public class Rectangulo {
   private double base;
   private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base) {
        this.base = base;
    }

    public Rectangulo(double base, double altura) {
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
        return "RECTANGULO"+"\nBase: "+base+"\nAltura: "+altura+"\nPerimetro: "+perimetro()+"\nArea: "+area();
    }
   
   public void imprimir(){
       System.out.println(toString());
    }
   
   public double perimetro(){
   return ((base*2)+(altura*2));
   }
   
   public double area(){
   return base*altura;
  }
}
