package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarefa {
    String nome;
    String descricao;
    Date dataTermino;
    int prioridade;
    Enums.Categoria categoria;
    Enums.Status status;

    public Tarefa(String nome, String descricao, Date datatermino, int prioridade, Enums.Categoria categoria, Enums.Status status) {
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

    public static Tarefa criarTarefa() {
        try{
            System.out.println("Informe o nome da tarefa: ");
            String nomeTarefa = new Scanner(System.in).nextLine();

            System.out.println("Informe uma descrição da tarefa: ");
            String descricaoTarefa = new Scanner(System.in).nextLine();

            System.out.println("Informe a data prevista para o término da tarefa no formato dd/mm/aaaa: ");
            String data = new Scanner(System.in).nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date dataPrevista = formatter.parse(data);

            System.out.println("Informe a prioridade da tarefa, de 1 a 5: ");
            int prioridadeTarefa = new Scanner(System.in).nextInt();
            if(prioridadeTarefa < 1 || prioridadeTarefa > 5){
                System.out.println("Prioridade invalida! Escolha um número entre 1 e 5");
            }

            System.out.println("Informe o número correspondente à categoria da tarefa:\n 0 - Estudos \n 1 - Casa \n 2 - Trabalho \n 3 - Exercícios ");
            int categoriaTarefa = new Scanner(System.in).nextInt();
            Enums.Categoria categoria = Enums.Categoria.values()[categoriaTarefa];

            System.out.println("Informe o número correspondente ao status da tarefa:\n 0 - ToDo \n 1 - Doing \n 2 - Done");
            int statusTarefa = new Scanner(System.in).nextInt();
            Enums.Status status = Enums.Status.values()[statusTarefa];

            Tarefa tarefaCriada = new Tarefa(nomeTarefa, descricaoTarefa, dataPrevista, prioridadeTarefa, categoria, status);
            return tarefaCriada;


        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void adicionarTarefa(Tarefa tarefa, ToDoListManager nomeLista) {

        nomeLista.tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso:\n");
        nomeLista.imprimirLista();

    }

    public void imprimirTarefa(Tarefa tarefa) {
        System.out.println("\nNome: " + tarefa.nome);
        System.out.println("Descricao: " + tarefa.descricao);
        System.out.println("Data de termino: " + String.valueOf(tarefa.dataTermino));
        System.out.println("Prioridade: " + tarefa.prioridade);
        System.out.println("Categoria: " + String.valueOf(tarefa.categoria));
        System.out.println("Status: " + String.valueOf(tarefa.status) + "\n");
    }

}
