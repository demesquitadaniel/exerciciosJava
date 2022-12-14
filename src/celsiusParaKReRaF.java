import java.util.Scanner;
//  Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
//  Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
//  Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

public class celsiusParaKReRaF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelsius = entrada.nextDouble();

        double tempK = tempCelsius + 273.15;
        double tempRe = tempCelsius * 0.8;
        double tempRa = (tempCelsius * 1.8) + (32 + 459.67);
        double tempF = (tempCelsius * 1.8) + 32;

        System.out.println("\nA temperatura em Kelvin equivale a " + tempK);
        System.out.println("A temperatura em Reaumur equivale a " + tempRe);
        System.out.println("A temperatura em Rankine equivale a " + tempRa);
        System.out.println("A temperatura em Fahrenheit equivale a " + tempF);

        entrada.close();
    }
}
