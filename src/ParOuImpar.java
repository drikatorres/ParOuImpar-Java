
public class ParOuImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        if (numero % 2 == 0) System.out.println("O número digitado é " + numero + " e ele é par");
        else System.out.println("O número digitado é " + numero + " e ele é ímpar");
    }
}
