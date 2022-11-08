public class Relacionais {

    public static void main(String[] args) {
        String nomeUm = "SIDNEI";
        String nomeDois = "SIDNEI";

        System.out.println(nomeUm == nomeDois);
        
        int numero1 = 2;
        int numero2 = 1;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?\n" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?\n" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?\n" + simNao);

        if(numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira\n");
        }else {
            System.out.println("nossa condição é falsa");
        }
    }
    
}
