package _01_introducao_a_orientacao_a_objetos.demos;

import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        //Calcule a área e o perimetro de dois quadrados e um retângulo

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do primeiro quadrado");
        int ladoQuadrado1 = scanner.nextInt();

        System.out.println("Digite o valor do lado do segundo quadrado");
        int ladoQuadrado2 = scanner.nextInt();

        System.out.println("Digite o valor a base do retângulo");
        int baseRetangulo = scanner.nextInt();

        System.out.println("Digite o valor a altura do retângulo");
        int alturaRetangulo = scanner.nextInt();

        System.out.printf("A área do quadrado 1 é %d \n", ladoQuadrado1 * ladoQuadrado1);
        System.out.printf("A área do quadrado 2 é %d \n", ladoQuadrado2 * ladoQuadrado2);
        System.out.printf("A área do retângulo é %d \n", baseRetangulo * alturaRetangulo);

        System.out.printf("O perímetro do quadrado 1 é %d \n", 4 * ladoQuadrado1);
        System.out.printf("O perímetro do quadrado 2 é %d \n", 4 * ladoQuadrado2);
        System.out.printf("O perímetro do retângulo é %d \n", 2 * (baseRetangulo + alturaRetangulo));


    }
}
