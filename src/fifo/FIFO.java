package fifo;

import java.util.Scanner;
import java.util.Random;

public class FIFO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random aleat = new Random();
        int temptot=0;
        float tempomedioespera = 0;
        
        // VARIÁVEIS
        int aleator, n_processos;
        
        // LEITURA DO NÚMERO DE PROCESSOS
        System.out.print("Digite o número de processos: ");
            n_processos = input.nextInt();
            
        // VARIÁVEIS COM TEMPO DE EXECUÇÃO  E DE ESPERA
        int tempo_execucao [] = new int[n_processos];
        
        // GERAR TEMPO ALEATÓRIO OU DIGITAR AUTOMATICAMENTE
        do{
            System.out.println("Deixar o tempo por escolha aleatória [1 = S/ 2 = N]: ");
                aleator = input.nextInt();
                
             // SE DIGITAR A OPÇÃO INCORRETA   
             if(aleator!=2 && aleator!=1){
                 System.err.println("DIGITE UMA OPÇÃO VÁLIDA");
             }               
        }while(aleator!=2 && aleator!=1);
        
        //DEFININDO O TEMPO DE CADA PROCESSO
        if(aleator==1){
            for(int i=0; i< n_processos; i++){
                tempo_execucao[i] = aleat.nextInt(10);
            }
        }else{
            for(int i=0; i< n_processos; i++){
                System.out.print("Digite o tempo de execução do processo "+(i+1)+": ");
                tempo_execucao[i] = input.nextInt();
            }
        }
        
        //SAÍDA DE DADOS
        System.out.println("====================================================================");
        
        //FILA E TEMPO DE PROCESSAMENTO
        System.out.println("FILA DE PROCESSOS");
        for(int i=0; i<n_processos; i++){
            System.out.println("PROCESSO "+(i+1)+": ");
            System.out.println("TEMPO DE EXECUÇÃO: "+tempo_execucao[i]);
            System.out.println("--------------------------------------------------------------------");
        }
        
        System.out.println("PROCESSO || TEMPO || TEMPO TOTAL || TEMPO DE ESPERA DE CADA PROCESSO");
        System.out.println("--------------------------------------------------------------------");
        for(int i=0; i<n_processos; i++){
            tempomedioespera += temptot; // CALCULANDO O TEMPO MÉDIO DE ESPERA
            int aux2 = temptot; // SALVA O TEMPO DE ESPERA DO PROCESSO
            for(int j=tempo_execucao[i];j>0;j--){
                System.out.print("    " +(i+1)+ "    ||   " +j+ "   ||      " +temptot+ "      ||                ");
                
                if(aux2 == temptot){ //IF PARA IMPRIMIR APENAS UMA VEZ O TEMPO DE ESPERA
                    System.out.print(aux2); 
                }
                System.out.println("");
                temptot+=1;
            }
            System.out.println("--------------------------------------------------------------------");
        }
        System.out.println("TEMPO MÉDIO DE ESPERA: "+tempomedioespera/n_processos);
    }
    
}
