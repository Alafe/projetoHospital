package projetohospital;

public class Enfermeiro extends Pessoa{
    
    //atributos
    private Integer corem;
    private double salario;
    private String senhaEnfermeiro;

    public Enfermeiro() {
    }

    public Enfermeiro(Integer corem, double salario, String senhaEnfermeiro) {
        this.corem = corem;
        this.salario = salario;
        this.senhaEnfermeiro = senhaEnfermeiro;
    }

    public Integer getCorem() {
        return corem;
    }

    public double getSalario() {
        return salario;
    }

    public String getSenhaEnfermeiro() {
        return senhaEnfermeiro;
    }

    public void setCorem(Integer corem) {
        this.corem = corem;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSenhaEnfermeiro(String senhaEnfermeiro) {
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
    
    @Override
    public boolean logar(String senha){
        boolean op;
        if(senha == senhaEnfermeiro){
            op = true;
        }else{
            op = false;
        }
        return op;
    }
}
