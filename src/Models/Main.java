package Models;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void adicionarTarefa(){


        System.out.println("Informe o nome da tarefa: ");
        String nomeTarefa = new Scanner(System.in).nextLine();
        System.out.println("Informe uma descrição da tarefa: ");
        String descricaoTarefa = new Scanner(System.in).nextLine();
        System.out.println("Informe a data prevista para o término da tarefa no formato dd/mm/aaaa: ");
        String data = new Scanner(System.in).nextLine();
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date dataPrevista = formatter.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Informe a prioridade da tarefa, de 1 a 5: ");
        int prioridadeTarefa = new Scanner(System.in).nextInt();
        if(prioridadeTarefa < 1 || prioridadeTarefa > 5){
            System.out.println("Prioridade invalida! Escolha um número entre 1 e 5");
        }
        System.out.println("Informe o número correspondente à categoria da tarefa:\n 0 - Estudos \n 1 - Casa \n 2 - Trabalho \n 3 - Exercícios ");
        int categoriaTarefa = new Scanner(System.in).nextInt();
        System.out.println("Informe o número correspondente ao status da tarefa:\n 0 - ToDo \n 1 - Doing \n 2 - Done");
        int statusTarefa = new Scanner(System.in).nextInt();

        Tarefa tarefa = new Tarefa(nomeTarefa, descricaoTarefa, dataPrevista, prioridadeTarefa, categoriaTarefa, statusTarefa);

    }




    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nOlá! Selecione a opção desejada: \n 1- Visualizar lista de tarefas \n 2- Adicionar tarefas \n 3- Remover tarefas \n");
        int opcao = ler.nextInt();
        Tarefa[] arrayTarefas = new Tarefa[0];
        List listaTarefas = new List(arrayTarefas);
        switch (opcao) {
            case 1:
                listaTarefas.imprimirLista(listaTarefas);
                break;
            case 2:
                System.out.println("\nVamos criar e adicionar uma tarefa ao ToDo-List! Para isso, aqui vão algumas perguntas: \n");
                adicionarTarefa();
                break;
            case 3:
            default:
                System.out.println("Opção inválida, tente novamente!");
        }

    }
}