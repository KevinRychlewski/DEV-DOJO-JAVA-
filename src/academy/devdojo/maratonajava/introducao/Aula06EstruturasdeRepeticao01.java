package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdeRepeticao01 {
    public static void main(String[] args) {
        // Estruturas de repetição: while, do while, for, for each
        int count = 0;
        while (count < 10){
            System.out.println("Count: " + count);
            count++;
        }
        do {
            System.out.println("Count: " + count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Count: " + i);
        }
    }
}
