package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Raimundo";
        professor.idade = 53;
        professor.sexo = 'M';
        System.out.println("O professor " + professor.nome + " tem " + professor.idade + " anos e é do sexo " + professor.sexo);
    }
}