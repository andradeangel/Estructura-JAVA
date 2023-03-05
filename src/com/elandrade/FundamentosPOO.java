package com.elandrade;
public class FundamentosPOO {

    //ATRIBUTOS
    String color;
    String fabricante;
    String modelo;
    int velocidad = 0;


    //CONSTRUCTORES
    public FundamentosPOO(String color, String fabricante, String modelo, int velocidad){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //METODOS
    public void acelerar(int kilometros){
        this.velocidad += kilometros;
    }

    //METODO TO STRING
    @Override
    public String toString() {
        return "FundamentosPOO{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", coche1=" + coche1 +
                '}';
    }

    //CREAR UN OBJETO A PARTIR DE UNA CLASE
    FundamentosPOO coche1 = new FundamentosPOO("red", "BMW", "2po0", 8);

    public static void main(String[] args) {
        coche1.acelerar(10);
    }

    //HERENCIA
    public class CocheElectrico extends Coche{
        String motorelectrico;
        public CocheElectrico(String motorelectrico){
            this.motorelectrico = motorelectrico;
        }
    }

    //METODO SUPER CLASE
    public CocheElectrico(){
        super();   //AÑADE TODOS LOS CONTRUCTORES DE LA CLASE PADRE O PRINCIPAL
    }

    //POLIMORFISMO
    Coche coche3 = new CocheElectrico(); //ES COMO SI SE PASARA DE ALGO ESPECIFICO A TRABAJAR CON LA CLASE PADRE

}