public class Operadores {

    public static void main(String[] args) {
       // operador unario + ou -
       
        int numero = 5;

        numero = -numero;
        System.out.println(- numero);

        numero = numero * -1;
        System.out.println(numero);
        // operador unario de incremento ++ ou decremento --
        numero = 5;

        numero++;

        System.out.println(numero);

        numero--;

        System.out.println(numero);
        
        //operdor ternario, expressao boolean

        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }
}
