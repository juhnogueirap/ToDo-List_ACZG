package Models;

import java.util.Scanner;

public class Main {
    public Main() {
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
            case 3:
            default:
                System.out.println("Opção inválida, tente novamente!");
        }

    }
}