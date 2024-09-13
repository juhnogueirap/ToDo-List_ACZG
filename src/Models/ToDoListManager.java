package Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ToDoListManager {

    ArrayList<Tarefa> tarefas;

    public ToDoListManager(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void imprimirLista() {

        for (Tarefa tarefa : tarefas) {
            Tarefa.imprimirTarefa(tarefa);
        }

    }

    public void imprimirListaCategoria(Enums.Categoria categoria, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            if (tarefinha.categoria == categoria) {
                Tarefa.imprimirTarefa(tarefinha);
            }

        }
    }

    public void imprimirListaPrioridade(int prioridade, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            if (tarefinha.prioridade == prioridade) {
                Tarefa.imprimirTarefa(tarefinha);
            }

        }
    }

    public void imprimirListaStatus(Enums.Status status, ArrayList<Tarefa> listaTarefas) {

        for (Tarefa tarefinha : listaTarefas) {
            if (tarefinha.status == status) {
                Tarefa.imprimirTarefa(tarefinha);
            }

        }
    }

    public void removerTarefa(ArrayList<Tarefa> listaTarefas, String nomeFornecido) {
        listaTarefas.removeIf(tarefinha -> Objects.equals(tarefinha.nome, nomeFornecido));
    }

}