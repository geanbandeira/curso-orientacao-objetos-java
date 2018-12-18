package _01_introducao_a_orientacao_a_objetos.demos;

public class Retangulo {
    public int base;
    public int altura;

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}
