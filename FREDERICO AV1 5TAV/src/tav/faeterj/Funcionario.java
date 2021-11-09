package tav.faeterj;

public class Funcionario 
	{
	
	public int idFuncionario;
	public String nomeFuncionario;
	public boolean planoSaude;
	
	public int getIdFuncionario()
	{
		return idFuncionario;
	}
	
	public void setIdFuncionario(int idFuncionario) 
	{
		this.idFuncionario = idFuncionario;
	}
	
	public String getNomeFuncionario() 
	{
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) 
	{
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public boolean isPlanoSaude() 
	{
		return planoSaude;
	}
	
	public void setPlanoSaude(boolean planoSaude) 
	{
		this.planoSaude = planoSaude;
	}
	
	public String carteirinhaPlano (int idFuncionario, String nomeFuncionario, boolean planoSaude) {
		int id = idFuncionario;
		String nome = nomeFuncionario;
		String confirmaPlanoSaude;
		
		if (planoSaude == true) {
			confirmaPlanoSaude = "PLANO DE SAÚDE DISPONÍVEL.";
		} else {
			confirmaPlanoSaude = "PLANO DE SAÚDE INDISPONÍVEL.";
		}
		return "O USUÁRIO DE ID " + id + " RECONHECIDO PELO NOME " + nome +  "SE ENCONTRA NA SEGUINTE SITUAÇÃO: " + confirmaPlanoSaude;
	}	
}
