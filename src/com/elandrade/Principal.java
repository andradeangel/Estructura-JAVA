package com.elandrade;  //INDICA EL PAQUETE (COMO FOLDERS) PARA TENER MEJOR ESTRUCTURADO LOS ARCHIVOS ESTO NOS AYUDARA A DEFINIR MEJOR LAS CLASES
public class Principal { //INDICA LA CLASE PRINCIPAL EN ESTE CASO EL PUBLIC ES PARA TODOS TAMBIEN HAY PRIVATE
    public static void main(String[] args) { //INDICA EL INICIO DEL PROGRAMA DE DONDE EMPIEZA ES LO QUE SE EJECUTA (MAIN)
        /*
            CONTENIDO
        */
    }
}


/* PARA CREAR VARIABLES SEGUN SU TIPO DE DATO (PRIMITIVOS (NO PERMITEN NULOS))
- ENTEROS
    byte numero1 = 1;   (1 BYTE)
    short numero2 = 2;  (2 BYTES)
    int numero3 = 3;    (3 BYTES)
    long numero4 = 4;   (4 BYTES)
- PUNTO FLOTANTE (DECIMALES)
    float decimal1 = 4.9f;      (SE PONE F PARA QUE NO SE CONFUNDA CON EL DOUBLE (PARA POCOS DECIMALES)))
    double decimal2 = 9.99d;    (SE PONE D PARA QUE NO SE CONFUNDA CON EL FLOAT AUNQUE NO ES ABSOLUTAMENTE NECESARIO EN ESTE CASO (PARA MAS DECIMALES))
- CARACTER  (UN SIMBOLO O LETRA)
    char caracter1 = 'a';       (SE PONE ENTRE COMILLAS SIMPLES)
- BOOLEANOS  (VERDADERO O FALSO)
    boolean verdadero = true;
    boolean falso = false;
*/


/* PARA CREAR VARIABLES SEGUN SUS TIPOS DE DATOS (NO PRIMITIVOS (PERMITE NULOS CON LA PRIMERA LETRA EN MAYUSCULA DEL TIPO DE DATO))
- CADENAS DE TEXTO
    String nombre = "Angel";
    String apellido = null;
- TIPO ENVOLTORIO   (HACER QUE PERMITA VALOR NULO)
    Integer numero = null;
    Long largonum = null;
    Boolean nosesabe = null;
 */


/* PARA OPERADORES LOGICOS, RELACION, COMPARACION, BOOLEANOS
    int resultado = numero1 + numero2;
    +   SUMA
    -   RESTA
    *   MULTIPLICACION
    /   DIVISION
    >   MAYOR QUE
    >=  MAYOR O IGUAL QUE
    <   MENOR QUE
    <=  MENOR O IGUAL QUE
    ==  IGUAL
    !=  NO ES IGUAL
    &&  Y/AND
    ||  O/OR
    !   NEGACION
    =   ASIGNACION
    +=  USAR LA MISMA VARIABLE EN LA OPERACION SUMA
    -=  USAR LA MISMA VARIABLE EN LA OPERACION RESTA
    *=  USAR LA MISMA VARIABLE EN LA OPERACION MULTIPLICACION
    /=  USAR LA MISMA VARIABLE EN LA OPERACION DIVISION
    %=  USAR LA MISMA VARIABLE EN LA OPERACION RESTO
    ++  INCREMENTO
    --  DECREMENTO
    +   CONCATENACION
*/

/*  CONDICIONALES
    ((((((IF)))))
    boolean cuenta = 10 == 20;
    if (cuenta){
        System.out.println("Verdadero");
    }else{
        System.out.println("Falso");
    }

    (((((FOR)))))
    for (int i=1; i<=10; i++){
        System.out.println("Number: "+i);
    }

    (((((WHILE)))))
    int cont = 1;
    while (cont <= 10){
        System.out.println("Number: "+cont);
        cont++;
    }

    (((((CONTINUE Y BREAK)))))
    int cont = 0;
    while (cont <= 10){
        cont++;
        if(cont == 6)
            continue;        (AQUI NOS DICE QUE CUANDO LLEGUE A 6 SE SALTE SU INTRUCCION Y CONTINUE AL 7)
        else if (cont == 8)
            break;           (AQUI NOS DICE QUE EN CUANTO LLEGUE A 8 SE SALGA DEL BUCLE POR MAS QUE NO HAYA TERMINADO LAS ITERACIONES)
        System.out.println("Number: "+cont);
    }

    (((((SWITCH)))))
    int number = 2;
    switch (number){
        case 1:
            System.out.println("El numero es 1");
            break;
        case 2:
            System.out.println("El numero es 2");
            break;
        case 3:
            System.out.println("El numero es 3");
            break;
        case 4:
            System.out.println("El numero es 4");
            break;
        default:
            System.out.println("No se encontro el numero");
    }
*/

/*  NIVELES DE VISIBILIDAD PARA FUNCIONES O PROCEDIMIENTOS
    public    (SE PUEDE INVOCAR DESDE CUALQUIER CLASE O PACKETE)
        claseDeFuncion.funcionOProcedimiento();
    protected (SE PUEDE INVOCAR SOLAMENTE DESDE CLASES QUE ESTEN EN EL MISMO PAQUETE)
        claseDeFuncion.funcionOProcedimiento();
    private   (SE PUEDE INVOCAR UNICAMENTE DESDE LA MISMA CLASE)
        funcionOProcedimiento();
 */


/* PROCEDIMIENTO    (NO DEVUELVE NADA (VOID) NO HAY UN RETURN COMO EN LAS FUNCIONES)
    saludo("Angel");     (ESTO (LLAMADO DEL PROCEDIMIENTO) VA EN LA PARTE DEL MAIN EN ESTE CASO ESTA ENVIANDO UN PARAMETRO (PUEDE IR VARIOS "," O VACIO TAMBIEN))

    public static void saludo(String name){ (VA FUERA DEL MAIN O EN OTRA CLASE, RECIBE UN PARAMETRO DEFINIENDO EL TIPO Y VARIABLE (O NO RECIBE NADA, DE PENDE COMO ESTA LLAMADO))
        System.out.print("Hello again " + name); (IMPRIME ALGO Y CONCATENA LO QUE SE HA RECIBIDO (FIN DEL PROGRAMA))
    }
*/


/* FUNCIONES     (DEVUELVE ALGO, TENEMOS QUE DEFINIR EL TIPO DE DATO QUE DEVOLVERA (YA NO CON VOID))
    System.out.print(saludo("again") + " Angel"); (ESTO (LLAMADO DE LA FUNCION) VA EN LA PARTE DEL MAIN EN ESTE CASO ESTA ENVIANDO UN PARAMETRO (PUEDE IR VACIO TAMBIEN))

    public static String saludo(String otravez){ (VA FUERA DEL MAIN O EN OTRA CLASE, COMO TIENE QUE RETORNAR ALGO DEFINIMOS EL TIPO ANTES DEL NOMBRE DE FUNCION (C/S PARAMATRO)
        return("Hello "+ otravez);
    }
 */