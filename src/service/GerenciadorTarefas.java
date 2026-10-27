package service;

import model.Tarefa;
import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(String titulo, String descricao) {
        Tarefa t = new Tarefa(proximoId, titulo, descricao);
        tarefas.add(t);
        proximoId++;
    }

    public void listar() {
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }
}