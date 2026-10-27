import service.GerenciadorTarefas;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas g = new GerenciadorTarefas();
        g.adicionar("Estudar Java", "Fazer o gerenciador");
        g.adicionar("Fazer commit", "Subir no GitHub");
        g.listar();
    }
}