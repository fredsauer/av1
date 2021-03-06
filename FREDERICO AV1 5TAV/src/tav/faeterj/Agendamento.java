package tav.faeterj;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento 
	{
		public int idAgendamento;
		public int idFuncionario;
		public String profissionalEncarregado;
		public String endereco;
		public LocalDate dataAgendamento;
		public LocalTime hora;
	
		public int getIdAgendamento() 
		{
		return idAgendamento;
		}
	
		public void setIdAgendamento(int idAgendamento) 
		{
			this.idAgendamento = idAgendamento;
		}
		public String getEndereco() 
		{
			return endereco;
		}
	
		public void setEndereco(String endereco) 
		{
			this.endereco = endereco;
		}
	
		public LocalTime getHora() 
		{
			return hora;
		}
	
		public void setHora(LocalTime hora) 
		{
			this.hora = hora;
		}
	
		public LocalDate getDataAgendamento() 
		{
			return dataAgendamento;
		}
	
		public void setDataAgendamento(LocalDate dataAgendamento) 
		{
			this.dataAgendamento = dataAgendamento;
		}
	
		public int getIdFuncionario() 
		{
			return idFuncionario;
		}
	
		public void setIdFuncionario(int idFuncionario) 
		{
			this.idFuncionario = idFuncionario;
		}
	
		public String Consulta (int idAgendamento, String profissionalEncarregado, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) 
		{
			return "TIPO DE COBERTURA: CONSULTA";
		}
	
		public String Exame (int idAgendamento, String profissionalEncarregado, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) 
		{
			return "TIPO DE COBERTURA: EXAME";
		}
	
		public String Internacao (int idAgendamento, String profissionalEncarregado, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) 
		{
			return "TIPO DE COBERTURA: INTERNAÇÃO";
		}
	}
