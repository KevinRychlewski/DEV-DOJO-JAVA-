
package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args) {
        String nome = "Kevin";
        String endereco = "Rua dos Bobos, 0";
        double salario = 2500.0;
        String data = "25/08/2025";
        String mensagem = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data de "+data;
        System.out.println(mensagem);
    }
}