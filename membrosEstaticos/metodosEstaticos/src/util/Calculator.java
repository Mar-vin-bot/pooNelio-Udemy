package util;

public class Calculator {
	
	//uma costante deve ser declarada com (final) seu nome deve ser tudo maiuscula
	public static final double PI = 3.14159;

	public static double calculaCirc(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}

	/*
	 * tanto os metodos como o PI estão classificados como static pois independente
	 * do obj eles apontaram para o mesmo calculo
	 * a chamada acontece diretamente com a classe Calculator.volume()
	 */
	
}
