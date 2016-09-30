package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Franquia {
	INTERNA, INTRA, EXTERNA;

	private static Map<Integer, Franquia> frans;
	private final Integer franquiaId = 0;
	private final String nome = "";

	public Integer getFranquiaId() {
		return this.franquiaId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Franquia forKey(Integer franquiaId) {
		return ((Franquia) frans.get(franquiaId));
	}

	static {
		frans = new HashMap<Integer, Franquia>();

		Franquia[] vauts = values();

		for (int i = 0; i < vauts.length; ++i) {
			Franquia a = vauts[i];
			frans.put(a.getFranquiaId(), a);
		}
	}
}
