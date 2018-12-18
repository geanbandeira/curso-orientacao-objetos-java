package _02_design_de_metodos.demos;

public class Principal1 {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.codigo = 1;
        c1.saldo = 200.00;

        Conta c2 = new Conta();
        c2.codigo = 2;
        c2.saldo = 500.00;

        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());

        c1.sacar(50.00);
        c2.sacar(500.00);

        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());

        c1.transferir(c2, 250.00);

        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
    }
}
