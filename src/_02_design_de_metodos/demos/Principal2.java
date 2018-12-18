package _02_design_de_metodos.demos;

public class Principal2 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato c1 = new Contato();
        c1.codigo = 1;
        c1.nome = "João";
        c1.telefone = "11111111";

        Contato c2 = new Contato();
        c2.codigo = 2;
        c2.nome = "Maria";
        c2.telefone = "22222222";

        Contato c3 = new Contato();
        c3.codigo = 3;
        c3.nome = "Pedro";
        c3.telefone = "33333333";

        //agenda.cadastrar(c1);
        //agenda.cadastrar(c2);
        //agenda.cadastrar(c3);
        agenda.cadastrar(c1, c2, c3);

        agenda.listar();

        agenda.excluir("Maria");

        Contato c4 = new Contato();
        c4.codigo = 4;
        c4.nome = "Jose";
        c4.telefone = "44444444";

        agenda.cadastrar(c4);

        agenda.listar();

    }
}
