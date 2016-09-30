package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Status {
	PENDENTE, APROVADO, CANCELADO, PENDENTE_DEMAIS, PENDENTE_SD;

	private static Map<Integer, Status> auts;
	private final Integer statusId = 0;
	private final String nome = "";

	public Integer getStatusId() {
		return this.statusId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Status forKey(Integer statusId) {
		return ((Status) auts.get(statusId));
	}

	static {
		auts = new HashMap<Integer, Status>();

		Status[] vauts = values();

		for (int i = 0; i < vauts.length; ++i) {
			Status a = vauts[i];
			auts.put(a.getStatusId(), a);
		}
	}
}
