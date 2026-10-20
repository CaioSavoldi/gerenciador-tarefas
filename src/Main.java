import model.Tarefa;

public class Main {
    public static void main(String[] args) {
        Tarefa t = new Tarefa(1, "Estudar Java", "Fazer a classe Tarefa");
        System.out.println(t);
        t.setConcluida(true);
        System.out.println(t);
    }
}