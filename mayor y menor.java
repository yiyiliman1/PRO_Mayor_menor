package modelocorregido;

import java.util.Scanner;

public class EjercicioA_corregido {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c, d;
		int min, max;
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		min = Math.min(a, b);
		min = Math.min(min, d);
		min = Math.min(min, c);
		
		max = Math.max(a, b);
		max = Math.max(max, d);
		max = Math.max(max, c);
		
		System.out.println("minimo: " + min);
		System.out.println("maximo: " + max);
	}

}
