
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    
    private String nome; // Declaração da variável "nome" do tipo String 
    private LocalDate dataNascimento; // Declaração da variável "dataNascimento" do tipo LocalDate
    
    public Pessoa(String nome, int dia, int mes, int ano) { // Declaração do método construtor da classe
        this.nome = nome; // A palavra-chave "this" não é obrigatória nesta versão do Java
        this.dataNascimento = LocalDate.of(ano, mes, dia); // parâmetro do construtor   
    }
    
    public int calculaIdade() { // Este método foi declarado para retornar a idade
        return Period.between(dataNascimento, LocalDate.now()).getYears(); } // este parâmetro retorna o calculo da idade
    
    public String getNome() { return nome; }  
    // Método padrão "get" para que o objeto instanciado da classe posssa ser acessado
    
    
    public void setNome(String nome) { this.nome = nome; } 
    // Método padrão "set" para que o objeto instanciado da classe posssa ser alterado
    
    public LocalDate getDataNascimento() { return dataNascimento; }
    
}