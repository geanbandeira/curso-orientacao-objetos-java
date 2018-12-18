package _01_introducao_a_orientacao_a_objetos.demos;

public class FigurasGeometricas {

    public static int calcularAreaQuadrado(int lado) {
        return lado * lado;
    }

    public static int calcularPerimetroQuadrado(int lado) {
        return 4 * lado;
    }

    public static int calcularAreaRetangulo(int base, int altura) {
        return base * altura;
    }

    public static int calcularPerimetroRetangulo(int base, int altura) {
        return 2 * (base + altura);
    }

}
