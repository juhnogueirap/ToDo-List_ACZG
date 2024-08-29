package Models;

import java.util.ArrayList;

public class ToDoListManager {
    ArrayList<Tarefa> tarefas;

    public ToDoListManager(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void imprimirLista() {

        for(Tarefa tarefa : tarefas) {
            tarefa.imprimirTarefa(tarefa);
        }

    }
}