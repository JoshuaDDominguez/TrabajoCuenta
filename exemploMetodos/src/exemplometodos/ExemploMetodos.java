
package exemplometodos;
import java.util.Scanner;
public class ExemploMetodos {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        Scanner sc=new Scanner (System.in);
        rec1.amosar();
        System.out.println("Escribe base");
        float base = sc.nextFloat();
        System.out.println("Escrbe altura");
        float altura =sc.nextFloat();
        Rectangulo rec2 = new Rectangulo(base,altura);
        rec2.calcularArea(base, altura);
        rec2.amosar();
        //float pe=rec2.calcularPerimetro(base, altura);
        //System.out.println("perimetro = "+pe);
        //Tamen
        System.out.println("perimetro = "+rec2.calcularPerimetro(base, altura));
        rec2.setBase(10);
        //rec2.setAltura(5);
        System.out.println(rec2.getAltura());
}
       
    }
