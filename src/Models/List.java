package Models;

public class List {
    Tarefa[] tarefas;

    public List(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }

    public void imprimirLista(List Listatarefas) {
        Tarefa[] var2 = Listatarefas.tarefas;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Tarefa tarefa = var2[var4];
            if (tarefa != null) {
                tarefa.imprimirTarefa(tarefa);
            }
        }

    }
}