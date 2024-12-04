package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Menor de idade");
        }
        boolean c = true;
        if (c == false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("fora do if");
    }
}
