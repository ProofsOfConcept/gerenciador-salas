package br.com.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Autorizacao {
	INTERNA, INTRA, EXTERNA;

	private static Map<Integer, Autorizacao> auts;
	private final Integer autorizacaoId = 0;
	private final String nome = "";

	public Integer getAutorizacaoId() {
		return this.autorizacaoId;
	}

	public String getNome() {
		return this.nome;
	}

	public static Autorizacao forKey(Integer autorizacaoId) {
		return ((Autorizacao) auts.get(autorizacaoId));
	}

	static {
		auts = new HashMap<Integer, Autorizacao>();

		Autorizacao[] vauts = values();

		for (int i = 0; i < vauts.length; ++i) {
			Autorizacao a = vauts[i];
			auts.put(a.getAutorizacaoId(), a);
		}
	}
}
