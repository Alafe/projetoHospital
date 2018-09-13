package projetohospital;

public class ProjetoHospital {

    public static void main(String[] args) {
        
        //instanciando os objetos
        Paciente p = new Paciente();
        Medico m = new Medico();
        Enfermeiro e = new Enfermeiro();
        
        
        p.setNome("Gustavo");
        p.setSobrenome("Santos");
        p.setCpf("455.002.124-52");
        p.setRg("56.415.150-x");
        p.setCodPaciente(231652);
        p.setSenhaPaciente("as1234");
        
        m.setNome("Maria");
        m.setSobrenome("Eduarda");
        m.setCpf("454.102.250-62");
        m.setRg("66.999.159-2");
        m.setCrm(123456);
        m.setEspacialidade("pediatra");
                
        e.setNome("Alan");
        e.setSobrenome("Santana");
        e.setCpf("405.152.154-32");
        e.setRg("16.445.550-8");
        e.setCorem(12454);
        e.setSalario(1500);
        e.setSenhaEnfermeiro("12345678");
        
        System.out.println("##### PACIENTE #####");
        System.out.println("Nome: " + p.getNome());
        System.out.println("SobreNome: " + p.getSobrenome());
        System.out.println("CPF: " + p.getCpf());
        System.out.println("RG: " + p.getRg());
        System.out.println("Codigo do paciente: " + p.getSenhaPaciente());
        System.out.println("Senha do paciente: " + p.getSenhaPaciente());
        
        System.out.println("--------------------------------");
        System.out.println("##### ENFERMEIRO #####");
        System.out.println("Nome: " + e.getNome());
        System.out.println("SobreNome: " + e.getSobrenome());
        System.out.println("CPF: " + e.getCpf());
        System.out.println("RG: " + e.getRg());
        System.out.println("Corem: " + e.getCorem());
        System.out.println("Salario: " + e.getSalario());
        System.out.println("Senha do enfermeiro: " + e.getSenhaEnfermeiro());
        
        System.out.println("--------------------------------");
        System.out.println("##### MÉDICO #####");
        System.out.println("Nome: " + m.getNome());
        System.out.println("SobreNome: " + m.getSobrenome());
        System.out.println("CPF: " + m.getCpf());
        System.out.println("RG: " + m.getRg());
        System.out.println("CRM:" + m.getCrm());
        System.out.println("Especialidade: " + m.getEspacialidade());
        
    }
    
}
