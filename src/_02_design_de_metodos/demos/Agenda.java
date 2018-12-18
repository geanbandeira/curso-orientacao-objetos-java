package _02_design_de_metodos.demos;

//Sobrecarga de métodos (Overloading)
//Lista variável de parâmetros

public class Agenda {

    public Contato[] contatos = new Contato[100];
    public int quantidade = 0;

    public void cadastrar(Contato contato) {
        for (int i = 0; i < contatos.length ; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                quantidade++;
                break;
            }
        }
    }

    //Lista variável de parâmetros
    public void cadastrar(Contato... contatos) {
        for (int i = 0; i < contatos.length; i++) {
            cadastrar(contatos[i]);
        }
    }

    //Sobrecarga de métodos (Overloading)
    public void excluir(int codigo) {
        for (int i = 0; i < quantidade ; i++) {
            if(contatos[i].codigo == codigo) {
                contatos[i] = null;
                quantidade--;
                break;
            }
        }
    }

    //Sobrecarga de métodos (Overloading)
    public void excluir(String nome) {
        for (int i = 0; i < quantidade ; i++) {
            if(contatos[i].nome.equals(nome)) {
                contatos[i] = null;
                quantidade--;
                break;
            }
        }
    }

    public void listar() {
        for (int i = 0; i < 100 ; i++) {
            if(contatos[i] != null)
                System.out.println(contatos[i].nome);
        }
    }
}
