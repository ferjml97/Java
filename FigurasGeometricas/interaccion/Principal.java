  
package interaccion;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Pentagono;
import figuras.Rectangulo;
import figuras.Triangulo;
import java.util.Scanner;
import java.util.Vector;

class Principal {
    public static Vector<Triangulo> triangulos=new Vector<Triangulo>();
    public static Vector<Cuadrado> cuadrados =new Vector<Cuadrado>();
    public static Vector<Rectangulo> rectangulos = new Vector<Rectangulo>();
    public static Vector<Pentagono> pentagonos=new Vector<Pentagono>();
    public static Vector<Circulo> circulos=new Vector<Circulo>(); 
    public static Scanner dato=new Scanner(System.in);
   
    public void menuFiguras(){
     int opc;
     do{
        opc=menu();
       switch(opc){
           case 1:
            altaTriangulo();
            break;
           case 2:
            altaCuadrado();
             break;
           case 3:
            altaRectangulo();
               break;
           case 4:
           altaPentagono();
               break;
           case 5:
           altaCirculo();
               break;
           case 6:
           listarFiguras();
               break;
           case 7:
               System.out.println("Hasta Pronto!");
             break;
           default:
               System.out.println("Opcion no valida");
               break;
               
       }
       
     }while(opc!=7);
    
    }
    
    public static int menu(){
    Scanner sc =new Scanner(System.in);
      System.out.println(" \n Menu Principal");
      System.out.println("1. Alta Triangulo");
      System.out.println("2. Alta Cuadrado");
      System.out.println("3. Alta Rectangulo");
      System.out.println("4. Alta Pentagono");
      System.out.println("5. Alta Circulo");
      System.out.println("6. Listar Figuras");
      System.out.println("7. Salir \n ");
      
      int opc =sc.nextInt();
      return opc;
    }
    
    public static void altaTriangulo(){
    double base, altura;
    
        System.out.println("Base: ");
       base=dato.nextDouble();
         System.out.println("Altura: ");
       altura=dato.nextDouble();
       
         triangulos.addElement(new Triangulo(base,altura));
    }
    
    public static void altaCuadrado(){
    double lado;
    
        System.out.println("Lado: ");
       lado=dato.nextDouble();
    
      cuadrados.addElement(new Cuadrado(lado));
      
    }
    
    public static void altaRectangulo(){
     double base, altura;
    
        System.out.println("Base: ");
       base=dato.nextDouble();
        System.out.println("Altura: ");
       altura=dato.nextDouble();
       rectangulos.addElement(new Rectangulo(base,altura));
    }
    
    public static void altaPentagono(){
     double lado, apotema;
    
        System.out.println("Lado; ");
      lado=dato.nextDouble();
        System.out.println("Apotema: ");
      apotema=dato.nextDouble();
      
      pentagonos.addElement(new Pentagono(lado,apotema));
    }
    
    public static void altaCirculo(){
    double radio,PI;
    
        System.out.println("Radio: ");
      radio=dato.nextDouble();
       
      circulos.addElement(new Circulo(radio));
    } 
    public static void listarFiguras(){
      System.out.println(" \n ---------------------------");

      for(int i=0; i<triangulos.size(); i++){     //elemento en == elementAt
      triangulos.elementAt(i).imprimir();
      System.out.println(" \n ---------------------------");
    }
       for(int i=0; i<cuadrados.size(); i++){
       cuadrados.elementAt(i).imprimir();
        System.out.println(" \n ---------------------------");
    }
       for(int i=0; i<rectangulos.size(); i++){
       rectangulos.elementAt(i).imprimir();
        System.out.println(" \n ---------------------------");
    }
       for(int i=0; i<pentagonos.size(); i++){
       pentagonos.elementAt(i).imprimir();
        System.out.println(" \n ---------------------------");
    }
       for(int i=0; i<circulos.size(); i++){
       circulos.elementAt(i).imprimir();
        System.out.println(" \n ---------------------------");
    }
    
      
        }
     
    
}
