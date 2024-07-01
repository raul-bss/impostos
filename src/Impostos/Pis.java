    package Impostos;

import Interface.Imposto;

public class Pis implements Imposto{
    private Double valorDebito, valorCredito, porcentagem = 1.65;
    
    public Pis(Double valorDebito, Double valorCredito){
        this.valorDebito = valorDebito;
        this.valorCredito = valorCredito;
    }

    @Override
    public double calcular() {
        if (this.valorDebito < this.valorCredito){
            double imposto = 0;
            return imposto;
        }
        return (valorDebito - valorCredito) * porcentagem;
    }

    @Override
    public void exibirDescricao() {
        System.out.println("-- PIS --");
        System.out.println("VALOR DEBITO = "+valorDebito+" | VALOR CREDITO = "+valorCredito);
        System.out.println("VALOR TOTAL: "+calcular());
        System.out.println();
        
    }
    
    
    
}
