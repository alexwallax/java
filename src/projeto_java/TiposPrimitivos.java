package projeto_java;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informa��es do funcionario
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = true; // ou false
		
		// Tipo caractere
		char status = 'A'; // s� pode colocar um caracter
		
		
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " dias trabalhados");
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2 + " N�mero de voos");
		
		// Quantos pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " Ponto acumulados");
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
		
	}

}
