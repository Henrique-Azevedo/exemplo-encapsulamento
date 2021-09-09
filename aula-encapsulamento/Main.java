
public class Main {
    
	public static void main(String[] args) {
	    
	    Pessoa eu = new Pessoa("Henrique Azevedo", 13, 04, 1984); 
	    // Criação do objeto Pessoa com a inserção de parâmetros
	    
	    System.out.println(eu.getNome());
	    System.out.println(eu.getDataNascimento());
	    System.out.println(eu.calculaIdade());
	    /* Impressão dos dados com a utilização de cada método correspondente 
	       ao que se pretende verificar*/
	    
	    eu.setNome("Henrique Azevedo");
	    
	    System.out.println(eu.getNome());
	}
}   

