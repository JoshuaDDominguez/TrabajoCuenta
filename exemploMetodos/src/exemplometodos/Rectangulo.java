/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodos;

/**
 *
 * @author jdominguezdominguez
 */
public class Rectangulo {
    private float base;
    private float altura;
    //constructores
    public Rectangulo(){
    }
    public Rectangulo(float bas, float alt){
        base=bas;
        altura=alt;        
    }
//metodos de acceso
public void setBase(float bas){
    base=bas;
}
public float getBase(){
    return base;
}
public void setAltura(float alt){
    altura=alt;
}
public float getAltura(){
    return altura;
}
public void calcularArea (float bas, float alt){
    float area=bas*alt;
    System.out.println("area = "+area);
}
public float calcularPerimetro (float bas, float alt){
    float perimetro= bas*2+alt*2;
    return perimetro;
}
public void amosar (){
    System.out.println(base);
    System.out.println(altura);
}
public String visualizar(){
    return ("base = "+base+". altura = "+altura);
}
}


