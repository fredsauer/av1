package testAgendamento;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

import tav.faeterj.Agendamento;
import tav.faeterj.Funcionario;
import tav.faeterj.Medico;


class JUnitTestAgendamento 
	{
		@Test
		void TestConsulta()
		{
			// ARRANGE !!!
			
			Agendamento Agendar = new Agendamento();
			String esperado = "CONSULTA COM OFTALMOLOGISTA REALIZADA.";
		
			LocalTime hora = LocalTime.of(9,0);
			LocalDate data = LocalDate.of(2021, 11, 09);
		
    			Medico<String, String> doutor = Medico.Oftalmologista();

		
			// ACT !!!
			String resultado = Agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
			// ASSERT !!!
			assertEquals(esperado, resultado);
		}
	
		@Test
		void TestConsultaCardiologista() 
		{
		
			// ARRANGE !!!
			Agendamento Agendar = new Agendamento();
			String esperado = "CONSULTA COM CARDIOLOGISTA REALIZADA.";
		
			LocalTime hora = LocalTime.of(9,0);
			LocalDate data = LocalDate.of(2021, 11, 09);
		
   			Medico<String, String> doutor = Medico.Cardiologista();

		
			// ACT !!!
			String resultado = Agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
			// ASSERT !!!
			assertEquals(esperado, resultado);
		}
	
		@Test
		void TestExame() 
		{
			// ARRANGE !!!
			Agendamento Agendar = new Agendamento();
			String esperado = "EXAME AGENDADO.";
		
			LocalTime hora = LocalTime.of(9,0);
			LocalDate data = LocalDate.of(2021, 11, 09);
		
    			Medico<String, String> doutor = Medico.Laboratorio();

		
			// ACT !!!
			String resultado = Agendar.Exame(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
			// ASSERT !!!
			assertEquals(esperado, resultado);
		}
	
		@Test
		void TestInternacao() 
		{
			// ARRANGE !!!
			Agendamento Agendar = new Agendamento();
			String esperado = "INTERNACAO REALIZADA.";
				
			LocalTime hora = LocalTime.of(9,0);
			LocalDate data = LocalDate.of(2021, 11, 09);
				
    			Medico<String, String> doutor = Medico.Internacao();

				
			// ACT !!!
			String resultado = Agendar.Internacao(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
				
			// ASSERT !!!
			assertEquals(esperado, resultado);
		}
	
		@Test
		void TestCarteirinha() 
		{	
			// ARRANGE !!!
			Funcionario Funcionario = new Funcionario();
		
			int id = 1;
			String nome = "SR. OSWALDO ALVES";
			String confirmaPlanoSaude = "DISPONÍVEL.";
		
			String esperado = "O USUÁRIO DE ID:" + id + "RECONHECIDO PELO NOME " + nome + "SE ENCONTRA NA SEGUINTE SITUAÇÃO: " + confirmaPlanoSaude;
		
								
			// ACT !!!
			String resultado = Funcionario.carteirinhaPlano(id, nome, true);
		
			// ASSERT !!!
			assertEquals(esperado,resultado);
		}

	}
