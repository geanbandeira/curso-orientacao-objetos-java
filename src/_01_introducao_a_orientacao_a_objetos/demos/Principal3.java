package _01_introducao_a_orientacao_a_objetos.demos;

import java.util.Scanner;

public class Principal3 {

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


        Quadrado q1 = new Quadrado();
        q1.lado = ladoQuadrado1;

        Quadrado q2 = new Quadrado();
        q2.lado = ladoQuadrado2;

        Retangulo r1 = new Retangulo();
        r1.base = baseRetangulo;
        r1.altura = alturaRetangulo;

        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro()); //Colocar breakpoint aqui

        //Mostrar Debug, evaluate expression


    }
}
