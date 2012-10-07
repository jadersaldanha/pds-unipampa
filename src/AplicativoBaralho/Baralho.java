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

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

	public ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
	public ArrayList<Cartas> descartadas = new ArrayList<Cartas>();	 

	public Baralho(){
		 ArrayList<String> naipes = new ArrayList<String>();
		 naipes.add("Copas");
	     naipes.add("Espadas");
	     naipes.add("Ouros");
	     naipes.add("Paus");
		
	     for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 13; j++) {
	            	baralho.add(new Cartas(j+1,naipes.get(i)));
	            }
	        }
	}	     	     

	public void imprimeBaralho() {
		for (int count=0; count<baralho.size(); count++){
			System.out.println(baralho.get(count).imprimecarta());
        }
    }	
    public void embaralhaBaralho(){
        Collections.shuffle(baralho);
        System.out.println("Embaralhado com sucesso.");
   }

    public void cortaEmDois(int posicao) {
        if(baralho.size()<posicao){
            System.err.println("Voc� digitou um n�mero maior que o n�mero de cartas existente");
        }
        else{
            ArrayList<Cartas> temporario = new ArrayList<Cartas>();	        
            for(int i=posicao; i<baralho.size(); i++)
                temporario.add(baralho.get(i));
            for(int i=0; i<posicao; i++)
                temporario.add(baralho.get(i));	        
            Collections.copy(baralho, temporario);
            System.out.println("Baralho cortado com sucesso.");
        }
    }		

	public void moveCartaParaOFim(){
			baralho.add(baralho.remove(0));
			System.out.println("A carta foi movida para o fim.");
	}

	 public Cartas retiraCartaInicio(){
	        return this.baralho.get(0);
	 }

	 public Cartas retiraCartaFim(){
	       return this.baralho.get(baralho.size()-1);
	 }		  

	 public void Descarta(int numero, String naipe){
	    	for (int i=0; i<baralho.size(); i++){
	    		if (baralho.contains(numero) && baralho.contains(naipe)) {
	    			descartadas.add(baralho.get(i));
	    			System.out.println("Descartada a carta " + baralho.get(i).imprimecarta());
	    			baralho.remove(i);		    		
	    		}
	    	}		        
	  }

	 public void verCartasDescartadas() {
		  for(int i=0; i<descartadas.size(); i++)
			  System.out.println("Carta: " + descartadas.get(i).imprimecarta());
	  }
}