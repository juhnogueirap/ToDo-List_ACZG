package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void selecionarOpcoes(ArrayList<Tarefa> tarefas, ToDoListManager listaTarefas) {

        Scanner ler = new Scanner(System.in);
        System.out.println("\nOlá! Selecione a opção desejada: \n 1- Visualizar lista de tarefas \n 2- Adicionar tarefas \n 3- Remover tarefas \n");
        int opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                selecionarOpcaoImpressao(tarefas, listaTarefas);
                break;
            case 2:
                System.out.println("\nVamos criar e adicionar uma tarefa ao ToDo-List! Para isso, aqui vão algumas perguntas: \n");
                Tarefa novaTarefa = Tarefa.criarTarefa();
                Tarefa.adicionarTarefa(novaTarefa, listaTarefas);
                selecionarOpcoes(tarefas, listaTarefas);
                break;
            case 3:
                System.out.println("Insira o nome da tarefa que deseja remover: ");
                String nomeTarefa = ler.next();



            default:
                System.out.println("Opção inválida, tente novamente!");
        }

    }

    public static void selecionarOpcaoImpressao(ArrayList<Tarefa> tarefas, ToDoListManager listaTarefas) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha de que forma deseja visualizar a lista: \n 1 - Visualizar lista completa \n 2 - Visualizar lista por categoria \n 3 - Visualizar lista por prioridade \n" +
                "4 - Visualizar lista por Status \n");
        int opcao = ler.nextInt();

        switch(opcao) {

            case 1:
                listaTarefas.imprimirLista();
                System.out.println("Deseja fazer mais alguma coisa? \n 1 - Sim \n 2 - Não");
                int opcaoAlgomais = ler.nextInt();
                if (opcaoAlgomais == 1) {
                    selecionarOpcoes(tarefas, listaTarefas);
                } else {
                    break;
                }
                break;

            case 2:
                System.out.println("Tarefas de qual categoria deseja visualizar? \n 0 - Estudos \n 1 - Casa \n 2 - Trabalho \n" +
                        "3 - Exercícios \n");
                int categoriaTarefa = ler.nextInt();
                Enums.Categoria categoria = Enums.Categoria.values()[categoriaTarefa];
                listaTarefas.imprimirListaCategoria(categoria, listaTarefas.tarefas);
                break;

            case 3:
                System.out.println("Tarefas com que grau de prioridade deseja visualizar? Insira um número entre 1 e 5: ");
                int prioridadeTarefa = ler.nextInt();
                listaTarefas.imprimirListaPrioridade(prioridadeTarefa, listaTarefas.tarefas);
                break;

            case 4:
                System.out.println("Tarefas com qual status deseja visualizar? \n 0 - TODO \n 1 - DOING \n 2 - DONE \n");
                int statusTarefa = ler.nextInt();
                Enums.Status status = Enums.Status.values()[statusTarefa];
                listaTarefas.imprimirListaStatus(status, listaTarefas.tarefas);
                break;

        }
    }

    public static void main(String[] args) {

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        ToDoListManager listaTarefas = new ToDoListManager(tarefas);
        selecionarOpcoes(tarefas, listaTarefas);

    }
}