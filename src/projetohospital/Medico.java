package projetohospital;

public class Medico extends Pessoa{
    
    //atributos
    private String espacialidade;
    private Integer crm;
    private String senhaMedico;
    private double salario;
    
    //métodos

    public Medico() {
    }

    public Medico(String espacialidade, Integer crm, String senhaMedico, double salario) {
        this.espacialidade = espacialidade;
        this.crm = crm;
        this.senhaMedico = senhaMedico;
        this.salario = salario;
    }

    public String getEspacialidade() {
        return espacialidade;
    }

    public Integer getCrm() {
        return crm;
    }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspacialidade(String espacialidade) {
        this.espacialidade = espacialidade;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public boolean logar(String senha){
        boolean op;
        if(senha == senhaMedico){
            op = true;
        }else{
            op = false;
        }
        return op;
    }
    
   
}
