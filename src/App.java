public class App {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        //tipos de datos
        int edad = 25;
        String nombre = "Santiago";
        double estatura = 1.77;
        float peso = 64;
        char sexo = 'M';

        //operadores aritmeticos
        int nuevaEdad = edad + 1; // int edad +-1
        double resultado = peso / estatura;
        int modulo = edad % 2;

        //operadores unarios
        edad++;
        edad--;
        int positivo = +edad;
        int negativo = -edad;

        //operadores relacionales
        boolean respuesta = edad == estatura;
        respuesta = estatura != 1.8;
        respuesta = estatura > 1;
        respuesta = estatura < 1;
        respuesta = estatura >= 1;
        respuesta = estatura <= 1;

        //operadores condicionales
        respuesta = estatura >= 1.5 && peso > 60;
        respuesta = estatura >= 1.5 || peso > 60;

        //operadores bit a bit
        // & es un and pero bit a bit
        // ^ es una compuerta XDA

        //estructura de control
        if (respuesta) {
            // si se cumple la funcion ejecuta este bloque de codigo

        }
 
        if (respuesta) {
            //si se cumple la funcion ejecuta este bloque
                // si no se cumple lo anterior if entonces ejecuta este bloque de codigo

            
        }if (respuesta) {
            
        } else if (respuesta) {
        } else if (respuesta) {
        } else if (respuesta) {

        } else {}

        switch (sexo) {
            case   'M':
                // BLOQUE DE CODIGO
                break;
                case 'F':
                //BLOQUE DE CODIGO
            
        
            default:
                break;
        }

        //ciclicas, bucles, repetitivas
        while (respuesta) {
            // bloque de codigo
            respuesta = !respuesta;
        }
        do {
        // bloque de codigo
        respuesta = !respuesta;

        } while (respuesta);

        for (String string : args) {
            //bloque de codigo
                
            }
            
 
        // declaracion variable ; condicion ; incremento
        for (int i = 10; i <= 20; i+=2) {

            // bloque de codigo

        }

    }

    
