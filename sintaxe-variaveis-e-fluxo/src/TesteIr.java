public class TesteIr {
    public static void main(String[] args) {
        // IR 7.5%  , R$142
        // IR 15%   , R$350
        // IR 22.5% , R$636

        double limite_baixo = 142;
        double limite_medio = 350;
        double limite_alto = 636;
        double salario = 2800.01;

        if(salario >= 1900.00 && salario <= 2800.00)
        {         double calculo = salario * 0.075;
            double total = salario - limite_baixo;
            System.out.println("A deduçao do IR para o seu salário é de 7.5%, podendo atingir o limite de R$142.00.");
            System.out.println("O calculo de dedução do seu salario resultou em R$" + String.format("%.2f", calculo) + ". Devido a isso"
                    + ", a dedução final será de R$142.00, respeitando o limite imposto, seu saldo resultando é de R$" + total);
        } else if(salario >= 1901.00 && salario <= 2800.00) {
            double calculo = salario * 0.075;
            double total = salario - limite_baixo;
            System.out.println("A deduçao do IR para o seu salário é de 7.5%, podendo atingir o limite de R$142.00.");
            System.out.println("O calculo de dedução do seu salario resultou em R$" + String.format("%.2f", calculo) + ". Devido a isso"
                    + ", a dedução final será de R$142.00, respeitando o limite imposto, seu saldo resultando é de R$" + total);
        }
        if(salario >= 2800.01 && salario <= 3751.00 ){
            double calculo = salario * 0.15;
            double  total = salario - limite_medio;
            System.out.println("A deduçao do IR para o seu salário é de 15%, podendo atingir o limite de R$350.00.");
            System.out.println("O calculo de dedução do seu salario resultou em R$" + String.format("%.2f", calculo) + ". Devido a isso"
                    + ", a dedução final será de R$350.00, respeitando o limite imposto, seu saldo resultando é de R$" + total);
        }
        if (salario >= 3751.01 && salario <= 4644.00 ){
            double calculo = salario * 0.225;
            double total = salario - limite_alto;
            System.out.println("A deduçao do IR para o seu salário é de 22.5%, podendo atingir o limite de R$636.00.");
            System.out.println("O calculo de dedução do seu salario resultou em R$" + String.format("%.2f", calculo) + ". Devido a isso"
                    + ", a dedução final será de R$636.00, respeitando o limite imposto, seu saldo resultando é de R$" + total);
        }
        if (salario < 1900.00){
            System.out.println("Você não está sujeito a cobrança do IR!");
        }
    }
}