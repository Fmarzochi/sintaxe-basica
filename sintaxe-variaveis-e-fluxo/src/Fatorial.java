public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for(int i = 0; i <= 10; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + "é: " + fatorial + "!");
        }
    }
}