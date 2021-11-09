package tav.faeterj;


public class Medico<M1, M2> 
{
    public final M1 nome;
    public final M2 endereco;

    public Medico(M1 first, M2 second) 
    {
        this.nome = first;
        this.endereco = second;
    }

    public M1 getKey() 
    {
        return nome;
    }

    public M2 getValue() 
    {
        return endereco;
    }
    
    public static Medico<String, String> Oftalmologista() 
    {
    	return new Medico <String, String>("DR. MARCOS CORRÊA", "RUA CARMEM MIRANDA 39, MÉIER, RJ. ");
    }
    
    public static Medico<String, String> Cardiologista() 
    {
    	return new Medico <String, String>("DR. FRANCISCO CHAGAS", "ESTRADA DO GALEÃO 24, JARDIM CARIOCA, ILHA DO GOVERNADOR, RJ.");
    }
    
    public static Medico<String, String> Ginecologista() 
    {
    	return new Medico <String, String>("DRA. CAROLINE LANDIGRAF", "AVENIDA DAS AMÉRICAS, BARRA, RJ.");
    }
    
    public static Medico<String, String> Fisioterapeuta() 
    {
    	return new Medico <String, String>("DRA. GIOVANNA PONTES", "RUA CONQUISTA 330, JARDIM GUANABARA, ILHA DO GOVERNADOR, RJ.");
    }
    
    public static Medico<String, String> LaboratorioDiagnostico() {
    	return new Medico <String, String>("LABS MEDICINA DIAGNÓSTICA", "RUA CAMBAÚBA, 100, JARDIM GUANABARA, ILHA DO GOVERNADOR, RJ.");
    }
    
    public static Medico<String, String> Clinica() {
    	return new Medico <String, String>("CLINICA BEM ESTAR", "RUA UM, 7, ILHA DO GOVERNADOR, CACUIA, ILHA DO GOVERNADOR, RJ.");
    }
    
}
