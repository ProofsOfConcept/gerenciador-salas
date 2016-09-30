package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Tipo {
	TELEPRESENCA, VIDEOCONFERENCIA, WEBCONFERENCIA, PRESENCIAL, SALA_VIRTUAL_VIDEOCONFERENCIA, SALA_VIRTUAL_TELEPRESENCA;

	private static Map<Integer, Tipo> tipos;
	private final Integer tipoId = 0;
	private final String nome = "";

	public Integer getTipoId() {
		return this.tipoId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Tipo forKey(Integer tipoId) {
		return ((Tipo) tipos.get(tipoId));
	}

	public static Map<Integer, Tipo> getAllTipos() {
		return tipos;
	}

	static {
		tipos = new HashMap<Integer, Tipo>();

		Tipo[] vtipos = values();

		for (int i = 0; i < vtipos.length; ++i) {
			Tipo t = vtipos[i];
			tipos.put(t.getTipoId(), t);
		}
	}
}
