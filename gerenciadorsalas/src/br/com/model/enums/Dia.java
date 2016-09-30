package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Dia {
	DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;

	private static Map<Integer, Dia> dias;
	private final Integer diaId = 0;
	private final String nome = "";

	public Integer getDiaId() {
		return this.diaId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Dia forKey(Integer diaId) {
		return ((Dia) dias.get(diaId));
	}

	static {
		dias = new HashMap<Integer, Dia>();

		Dia[] vdias = values();

		for (int i = 0; i < vdias.length; ++i) {
			Dia d = vdias[i];
			dias.put(d.getDiaId(), d);
		}
	}
}
