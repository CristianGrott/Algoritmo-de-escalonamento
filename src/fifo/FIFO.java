package fifo;

import java.util.Scanner;
import java.util.Random;

public class FIFO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random aleat = new Random();
        
        // VARIÁVEIS
        int aleator, n_processos;
        
        // LEITURA DO NÚMERO DE PROCESSOS
        System.out.print("Digite o úmero de processos: ");
            n_processos = input.nextInt();
            
        // VARIÁVEIS COM TEMPO DE EXECUÇÃO  E DE ESPERA
        int tempo_execucao [] = new int[n_processos];
        int tempo_espera [] = new int [n_processos];
        
        // GERAR TEMPO ALEATÓRIO OU DIGITAR AUTOMATICAMENTE
        do{
            System.out.println("Deixar o tempo por escolha aleatória [1 = S/ 2 = N]: ");
                aleator = input.nextInt();
                
             // SE DIGITAR A OPÇÃO INCORRETA   
             if(aleator!=2 && aleator!=1){
                 System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
             }               
        }while(aleator!=2 && aleator!=1);
        
        //DEFININDO O TEMPO DE CADA PROCESSO
        if(aleator==1){
            for(int i=0; i< n_processos; i++){
                tempo_execucao[i] = aleat.nextInt(11);
            }
        }else{
            for(int i=0; i< n_processos; i++){
                System.out.print("Digite o tempo de execução do processo "+(i+1)+": ");
                tempo_execucao[i] = input.nextInt();
            }
        }
        
        //for(int i=0; i<n_processos; i++){
          //  System.out.println(tempo_execucao[i]);
        //}
        
        //SAÍDA DE DADOS
        System.out.println("===========================================");
        
        System.out.println("PROCESSO || TEMPO");
        System.out.println("-----------------");
        for(int i=0; i<n_processos; i++){
            for(int j=tempo_execucao[i];j>0;j--){
                System.out.println("    "+(i+1)+"    ||   "+j); 
            }
            System.out.println("-----------------");
        }
    }
    
}