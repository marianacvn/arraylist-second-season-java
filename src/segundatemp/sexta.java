package segundatemp;

import java.util.ArrayList;

public class sexta {
	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno(8, 9, 22, "Davi"));
		lista.add(new Aluno(8, 7, 21, "Mari"));
		lista.remove(1);
		System.out.println(lista);
	}

}
