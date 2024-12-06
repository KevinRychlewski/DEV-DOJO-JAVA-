package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06DESAFIO {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia util ou final de semana
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo, dia não util");
                break;
            case 2:
                System.out.println("Segunda-feira, dia util");
                break;
            case 3:
                System.out.println("Terca-feira, dia util");
                break;
            case 4:
                System.out.println("Quarta-feira, dia util");
                break;
            case 5:
                System.out.println("Quinta-feira, dia util");
                break;
            case 6:
                System.out.println("Sexta-feira, dia util");
                break;
            case 7:
                System.out.println("Sabado, dia não util");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
