package projetohospital;

public class Paciente extends Pessoa{
    //atributos da classe
    private Integer codPaciente;
    private String senhaPaciente;
    
    //métodos
    public boolean logar(String senha){
        boolean op;
        if(senha == this.senhaPaciente){
            op = true;
        }else{
            op = false;
        }
        return op;
    }
    //metodos get set
    public Integer getCodPaciente(){
        return this.codPaciente;
    }
    
    public void setCodPaciente(Integer codPaciente){
        if(codPaciente != null){
            this.codPaciente = codPaciente;
        }
    }
    
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    
    //diz no diagrama que setSenhaFuncionario returne senhaPaciente
    // professor disse que é setSenhaPaciente
    public void setSenhaPaciente(String senhaPaciente){
        if(senhaPaciente != ""){
            this.senhaPaciente = senhaPaciente;
        }
    }
    
    
}
