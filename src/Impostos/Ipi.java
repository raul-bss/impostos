package Impostos;

import Interface.Imposto;

public class Ipi implements Imposto {
    private Double aliquota, valorProduto, frete, seguro, despesas;
    
    public Ipi(Double aliquota, Double valorProduto, Double frete, Double seguro, Double despesas){
        this.aliquota = aliquota;
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.despesas = despesas;
    }

    @Override
    public double calcular() {
        return (valorProduto + frete + seguro + despesas)*(aliquota/100);
    }

    @Override
    public void exibirDescricao() {
        System.out.println("-- IPI --");
        System.out.println("VALOR PRODUTO = "+ valorProduto);
        System.out.println("VALOR FRETE = "+ frete);
        System.out.println("VALOR SEGURO = "+ seguro);
        System.out.println("VALOR DESPESAS = "+ despesas);
        System.out.println("VALOR ALIQUOTA = "+ aliquota);
        System.out.println("VALOR TOTAL = "+calcular());
        System.out.println();
    }
    
   
}
