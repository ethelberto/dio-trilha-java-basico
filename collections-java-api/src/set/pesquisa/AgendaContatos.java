package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        setContatos.add(contato);
    }

    public void exibirContatos(){
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatos = new HashSet<>();
        for(Contato c : setContatos) {
            if(c.getNome().startsWith(nome)){
                contatos.add(c);
            }
        }
        return contatos;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : setContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
