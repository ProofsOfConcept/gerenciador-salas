package br.com.business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.model.Reserva;
import br.com.model.Sala;
import br.com.model.Usuario;
import br.com.model.enums.Status;

public class ReservaBusiness {
	public List<Reserva> getReservas(String orgId, String instId) {
		List<Reserva> reservas = new ArrayList<Reserva>();
		SalaBusiness salaBusiness = new SalaBusiness();
		List<Sala> salas = salaBusiness.getMinhasSalas("");
		Calendar calendar = Calendar.getInstance();
		Calendar calendarFim = Calendar.getInstance();
		
		Date inicio = new Date();
		Date fim = new Date();
		
		calendar.setTime(inicio);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendarFim.setTime(fim);
		calendarFim.add(Calendar.HOUR, 2);
		calendarFim.add(Calendar.MINUTE, 30);
		
		Usuario usuario = new Usuario();
		usuario.setNome("HISILVA");
		
		List<Usuario> participantes = new ArrayList<Usuario>();
		participantes.add(usuario);
		participantes.add(usuario);
		
		for(int i = 0; i < 5; i++) {
			Reserva reserva = new Reserva(salas.get(i), calendar.getTime(), calendarFim.getTime(), calendar.getTime(), 
					"Reserva da Sala " + salas.get(i).getNome(), "", false, 
					false, Status.APROVADO.name(), usuario);
			reserva.setReservaId(i);
			reserva.setListaParticipantes(participantes);
			reservas.add(reserva);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			calendarFim.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		return reservas;
	}
}
