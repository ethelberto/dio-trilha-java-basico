package list.operacoes_basicas;
public class TestaListaTarefa {
    public static void main(String[] args) throws Exception {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Primeira Tarefa");
        
        System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.adicionarTarefa("Segunda Tarefa");
        
        System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Primeira Tarefa");

        System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
