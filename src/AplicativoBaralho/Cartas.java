package AplicativoBaralho;


public class Cartas {

	private int numCarta;
    private String naipeCarta;

    public Cartas(int numero, String naipe){    	
    	this.numCarta = numero;
    	this.naipeCarta = naipe;
    }

    public int getNumCarta(){
        return numCarta;
    }

    public String getNaipeCarta(){
        return naipeCarta;
    }

    public String imprimecarta(){
        return this.getNumCarta() + " de " + this.getNaipeCarta();
    }
  
}