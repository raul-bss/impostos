package App;

import Impostos.Ipi;
import Impostos.Pis;
import Pagamento.Pagamento;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pagamento> list = new ArrayList<>();
        boolean fluxo = true;
        
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        
        System.out.println("Cadastrando impostos: ["+nomeEmpresa+"]");
        Pagamento pg = new Pagamento(nomeEmpresa);
        System.out.println();   
        
        while(fluxo){
                
            try{
                System.out.print("TIPO DE IMPOSTO: [1] IPI | [2] PIS | [3] SAIR: ");
                int escolha = scanner.nextInt();
            
                switch (escolha) {
                    case 1 -> {

                        try{
                            System.out.println();
                            System.out.println("-- IPI --");

                            System.out.print("VALOR PRODUTO: ");
                            Double valorProduto = scanner.nextDouble();

                            System.out.print("VALOR FRETE: ");
                            Double frete = scanner.nextDouble();

                            System.out.print("VALOR SEGURO: ");
                            Double seguro = scanner.nextDouble();

                            System.out.print("VALOR DESPESAS: ");
                            Double despesas = scanner.nextDouble();

                            System.out.print("VALOR ALIQUOTA: ");
                            Double aliquota = scanner.nextDouble();
                            scanner.nextLine();

                            pg.adcionarImposto(new Ipi(aliquota,valorProduto,frete,seguro,despesas));
                            System.out.println("IMPOSTO CADASTRADO!");
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("ENTRADA INVÁLIDA");
                            scanner.nextLine();
                        }



                    }
                    case 2 -> {
                        try{
                            System.out.println();
                            System.out.println("-- PIS --");

                            System.out.print("VALOR CRÉDITO: ");
                            double valorCredito = scanner.nextDouble();

                            System.out.print("VALOR DÉBITO: ");
                            double valorDebito = scanner.nextDouble();

                            pg.adcionarImposto(new Pis(valorDebito,valorCredito));
                            System.out.println("IMPOSTO CADASTRADO!");

                            break;
                        }catch(InputMismatchException e){
                            System.out.println("ENTRADA INVÁLIDA;");
                            scanner.nextLine();
                        }
                    }
                    case 3 -> {
                        System.out.println("SAINDO...");
                        System.out.println();
                        fluxo = false;

                    }
                }
            }catch(InputMismatchException e){
                System.out.println("ENTRADA INVÁLIDA");
                scanner.nextLine();
            }
            
        }
        
        
        pg.imprimirPagamentos();
        

    }
}
