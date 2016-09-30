package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Visibilidade {
	INTERNA, INTRA, EXTERNA;

	private static Map<Integer, Visibilidade> vis;
	private final Integer visibilidadeId = 0;
	private final String nome = "";

	public Integer getVisibilidadeId() {
		return this.visibilidadeId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Visibilidade forKey(Integer visibilidadeId) {
		return ((Visibilidade) vis.get(visibilidadeId));
	}

	static {
		vis = new HashMap<Integer, Visibilidade>();

		Visibilidade[] vvis = values();

		for (int i = 0; i < vvis.length; ++i) {
			Visibilidade a = vvis[i];
			vis.put(a.getVisibilidadeId(), a);
		}
	}
}
