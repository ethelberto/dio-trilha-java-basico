package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        Convidado convidado = new Convidado(nome, codigoConvite);
        setConvidados.add(convidado);
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : setConvidados) {
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return setConvidados.size();
    }

    public void exibirConvidado(){
        System.out.println(setConvidados);
    }
}
