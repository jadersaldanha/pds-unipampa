/**
 * Copyright (c) 2012 Jader de Freitas Saldanha
 * 
 * Este arquivo e parte do programa AplicativoBaralho
 * 
 * AplicativoBaralho e um software livre; voce pode redistribui-lo e/ou modifica-lo dentro dos termos da Licenca Publica Geral Menor GNU 
 * como publicada pela Fundacao do Software Livre (FSF); na versao 2 da Licenca, ou (na sua opiniao) qualquer versao.
 * 
 *  Este programa e distribuido na esperanca que possa ser util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUACAO a qualquer
 *  MERCADO ou APLICACAO EM PARTICULAR. Veja a Licenca Publica Geral Menor GNU para maiores detalhes.
 *  
 *  Voce deve ter recebido uma copia da Licenca Publica Geral Menor GNU junto com este programa, se nao, escreva para a Fundacao do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 */



package AplicativoBaralho;

import java.util.Scanner;

public class Main {
	
	public static Baralho baralho = new Baralho();
	public static Cartas card;
    public static Baralho desc;
    public static int option = 100;
    public static int localdocorte = 0;
    
   public static void ManipulaCartas(){ 
	   
	   Scanner is = new Scanner(System.in);
    	
       System.out.println("\n\n" + "Digite a op��o que deseja realizar sobre o baralho: ");
       System.out.println("1 - Mostrar baralho");
       System.out.println("2 - Embaralhar");
       System.out.println("3 - Cortar o baralho no local que voc� define");
       System.out.println("4 - Mover uma carta do in�cio para o final do baralho, sem mostrar a carta");
       System.out.println("5 - Retirar a primeira carta do baralho");
       System.out.println("6 - Retirar a �ltima carta do baralho");
       System.out.println("7 - Descartar do baralho uma carta que voc� define");
       System.out.println("8 - Mostrar as cartas descartadas" + "\n\n");
        
       option = is.nextInt();
    
        if (option==1){
        	baralho.imprimeBaralho();
        	ManipulaCartas();   
        }

        else if (option==2){
        	baralho.embaralhaBaralho(); 
        	ManipulaCartas();   
        }
    
        else if (option==3){    
        	System.out.println("Posi��o do corte: ");
        	localdocorte = is.nextInt();
        	baralho.cortaEmDois(localdocorte); 
        	ManipulaCartas();   
        }
   
        else if (option==4){
        	baralho.moveCartaParaOFim();
        	ManipulaCartas();   
        }
    
        else if (option==5){
        	card = baralho.retiraCartaInicio();
            System.out.println("Voc� retirou a carta: " + card.imprimecarta());
        	ManipulaCartas();   
        }
       
        else if(option==6){
        	card = baralho.retiraCartaFim();
        	System.out.println("Voc� retirou a carta: " + card.imprimecarta());
        	ManipulaCartas();   
        }
    
        else if(option==7){      
        	System.out.println("Descartando carta...");
        	System.out.println("Digite o n�mero da carta: ");
            int numero = is.nextInt();
        	System.out.println("Digite o n�mero correspondente ao naipe: (1 = Copas; 2 = Espadas; 3 = Ouros; 4 = Paus) ");
        	int n = is.nextInt();
        	
        	if (n==1){
        		baralho.Descarta(numero, "Copas");
        	}
        	else if (n==2){
        		baralho.Descarta(numero, "Espadas");
        	}        	
        	else if (n==3){
        		baralho.Descarta(numero, "Ouros");
        	}        	
        	else if (n==4){
        		baralho.Descarta(numero, "Paus");
        	}
        	else{
        		System.err.println("Erro: voc� digitou um naipe inv�lido!");
            	ManipulaCartas();
        	}        	
            
        	ManipulaCartas();
        }
        
        else if(option==8){
        	baralho.verCartasDescartadas();
        	ManipulaCartas();   
        }
    
        else{
        	System.err.println("Erro: voc� digitou um n�mero inv�lido!");
        	ManipulaCartas();   
        }	 
   
    }

    public static void main(String[] args) {
    	ManipulaCartas();        
    }
    
}