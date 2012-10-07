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


public class Cartas {

	private int numCarta;
    private String naipeCarta;

    /*
    * Método contrutor que seta o numero e o naipe da carta
    */	
    public Cartas(int numero, String naipe){    	
    	this.numCarta = numero;
    	this.naipeCarta = naipe;
    }

    /*
    * Método que retorna o número de uma carta
    */	
    public int getNumCarta(){
        return numCarta;
    }

    /*
    * Método que o naipe de uma carta
    */	
    public String getNaipeCarta(){
        return naipeCarta;
    }

    /*
    * Método que faz a impressão de uma carta, com seu respectivo número e naipe
    */	
    public String imprimecarta(){
        return this.getNumCarta() + " de " + this.getNaipeCarta();
    }
  
}