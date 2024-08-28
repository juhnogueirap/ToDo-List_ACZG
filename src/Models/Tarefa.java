package Models;

import java.util.Date;

public class Tarefa {
    String nome;
    String descricao;
    Date dataTermino;
    int prioridade;
    Categoria categoria;
    Status status;

    public Tarefa(String nome, String descricao, Date datatermino, int prioridade, Categoria categoria, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = datatermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    public Tarefa() {
        this.nome = "Default";
        this.descricao = "Tarefa default";
        this.dataTermino = null;
        this.prioridade = 0;
        this.categoria = null;
        this.status = null;
    }

    public void imprimirTarefa(Tarefa tarefa) {
        System.out.println("\nNome: " + tarefa.nome);
        System.out.println("Descricao: " + tarefa.descricao);
        System.out.println("Data de termino: " + String.valueOf(tarefa.dataTermino));
        System.out.println("Prioridade: " + tarefa.prioridade);
        System.out.println("Categoria: " + String.valueOf(tarefa.categoria));
        System.out.println("Status: " + String.valueOf(tarefa.status) + "\n");
    }


    public static enum Categoria {
        ESTUDOS,
        CASA,
        TRABALHO,
        EXERCÍCIOS;

        private Categoria() {
        }
    }

    public static enum Status {
        TODO,
        DOING,
        DONE;

        private Status() {
        }
    }
}
