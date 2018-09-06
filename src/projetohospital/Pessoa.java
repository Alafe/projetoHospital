package projetohospital;

public class Pessoa {
    //atributos da classe
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    
    //métodos get e set
    public void setNome(String nome){
        if(nome != ""){
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome){
        if(sobrenome != ""){
            this.sobrenome = sobrenome;
        }
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setCpf(String cpf){
        if(cpf != ""){
            this.cpf = cpf;
        }
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setRg(String rg){
        if(rg != ""){
            this.rg = rg;
        }
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public abstract boolean logar(String senha);
    
    
}
