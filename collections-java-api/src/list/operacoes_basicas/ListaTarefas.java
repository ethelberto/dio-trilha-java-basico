package list.operacoes_basicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona uma nova tarefa à lista com a descrição fornecida
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Remove uma tarefa da lista com base em sua descição
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    // Retorma o número total de tarefas na lista
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    // Retorma uma lista contendo a descrição de todas as tarefas na lista 
    public void obterDescricoesTarefas (){
        System.out.println(tarefaList);
    }
}
