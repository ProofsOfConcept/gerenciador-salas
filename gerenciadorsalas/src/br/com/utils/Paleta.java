package br.com.utils;

import java.util.HashMap;
import java.util.Map;

public class Paleta {
	private static Map<Integer, String> salaPaleta = new HashMap<Integer, String>();
	private static int min = 150;
	private static int max = 255;
	private static int posicao = 1;
	private static float pulo = 0;
	private static float total = 0;
	
	static {
		total = (float)Math.pow(max - (min - 1), 3);
		pulo = total - 1;
	}
	
	public static String getCor(Integer id) {
		String cor = salaPaleta.get(id);
		
		if (cor == null) {
			cor = gerarCor(id);
		}
		
		return cor;
	}
	
	private static String gerarCor(Integer id) {
		String cor = "";
		int pos = (int) (posicao * pulo);
		posicao += 2;
		if (pos > total) {
			pulo /= 2;
			posicao = 1;
			pos = (int) (posicao * pulo);
			posicao += 2;
		}
		int dif = max - (min - 1);
		
		int R = min + (int)((pos) / (dif * dif));
		int G = min + (int)(((pos) / dif)  - ((R - min) * dif ));
		int B = max - (int)((pos) - ((R - min) * dif * dif) - ((G - min) * dif));
		String r = Integer.toHexString(R);
		String g = Integer.toHexString(G);
		String b = Integer.toHexString(B);
		if (r.length() < 2)
			r = "0"+r;
		if (g.length() < 2)
			g = "0"+g;
		if (b.length() < 2)
			b = "0"+b;
		cor = "#"+r+g+b;
		
		salaPaleta.put(id, cor);
		
		
		return cor;
	}
}
