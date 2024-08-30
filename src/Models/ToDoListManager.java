package Models;

import java.util.ArrayList;

public class ToDoListManager {

    ArrayList<Tarefa> tarefas;

    public ToDoListManager(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void imprimirLista() {

        for (Tarefa tarefa : tarefas) {
            tarefa.imprimirTarefa(tarefa);
        }

    }

    public void imprimirListaCategoria(Enums.Categoria categoria, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            System.out.println(tarefinha.categoria);
            if (tarefinha.categoria == categoria) {
                tarefinha.imprimirTarefa(tarefinha);
            }

        }
    }

    public void imprimirListaPrioridade(int prioridade, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            System.out.println(tarefinha.prioridade + "\n");
            if (tarefinha.prioridade == prioridade) {
                tarefinha.imprimirTarefa(tarefinha);
            }

        }
    }

    public void imprimirListaStatus(Enums.Status status, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            System.out.println(tarefinha.status);
            if (tarefinha.status == status) {
                tarefinha.imprimirTarefa(tarefinha);
            }

        }
    }

}