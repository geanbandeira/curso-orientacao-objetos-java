package _02_design_de_metodos.demos;

public class Conta {
    public int codigo;
    public double saldo;

    public String consultarSaldo() {
        return "Conta: " + codigo + " Saldo: " + saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void transferir(Conta conta, double valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }
}
