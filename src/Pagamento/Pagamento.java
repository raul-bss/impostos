package Pagamento;

import Interface.Imposto;
import java.util.ArrayList;

public class Pagamento {
    private String nomeEmpresa;
    private ArrayList<Imposto> lista = new ArrayList<>();
    

    public Pagamento(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void adcionarImposto(Imposto o){
        lista.add(o);
    }
    
    public void imprimirPagamentos(){
        if(!lista.isEmpty()){
            for(Imposto x :lista){
                x.exibirDescricao();
            }
            return;
        }
        System.out.println("NENHUM PAGAMENTO CADASTRADO");
    }

    @Override
    public String toString() {
        return "Pagamento{" + "nomeEmpresa=" + nomeEmpresa + ", lista=" + lista + '}';
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Imposto> getLista() {
        return lista;
    }

   
    
    
    
    
}
