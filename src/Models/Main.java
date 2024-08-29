package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nOlá! Selecione a opção desejada: \n 1- Visualizar lista de tarefas \n 2- Adicionar tarefas \n 3- Remover/Alterar tarefas \n");
        int opcao = ler.nextInt();
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        ToDoListManager listaTarefas = new ToDoListManager(tarefas);
        switch (opcao) {
            case 1:
                listaTarefas.imprimirLista();
                break;
            case 2:
                System.out.println("\nVamos criar e adicionar uma tarefa ao ToDo-List! Para isso, aqui vão algumas perguntas: \n");
                Tarefa novaTarefa = Tarefa.criarTarefa();
                Tarefa.adicionarTarefa(novaTarefa, listaTarefas);
                break;
            case 3:
            default:
                System.out.println("Opção inválida, tente novamente!");
        }

    }
}