package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Maior de idade");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Menor de idade");
        }

        System.out.println("fora do if");

        boolean c = true;
        if (c == false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
