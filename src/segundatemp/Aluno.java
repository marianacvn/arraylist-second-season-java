package segundatemp;

import java.util.ArrayList;

public class Aluno implements InterfaceAluno {
	int nota;
	int nota2;
	int idade;
	String nome;
	int media;
	
	

	public Aluno(int nota, int nota2, int idade, String nome) {
		super();
		this.nota = nota;
		this.nota2 = nota2;
		this.idade = idade;
		this.nome = nome;
	}

	@Override
	public void fazerAniversario() {
		idade++;
		System.out.println("Parabéns pelo seus "+idade+"anos,"+nome);
		
	}

	@Override
	public void calcularMedia() {
		int[] listaNotas = new int[2];
		listaNotas[0] = nota;
		listaNotas[1] = nota2;
		int total = 0;
		for(int perc : listaNotas) {
			total = total + perc;
		}
		 media = total/2;	
		 System.out.println(media);
		}

		
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno(10, 4, 21, "Mari");
		aluno.calcularMedia();
		aluno.fazerAniversario();
		aluno.verificar();
	}
	@Override
	public void verificar() {
		if ( media >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		
	}

	@Override
	public String toString() {
		return "Aluno [nota=" + nota + ", nota2=" + nota2 + ", idade=" + idade + ", nome=" + nome + ", media=" + media
				+ "]";
	}
}
	
	


