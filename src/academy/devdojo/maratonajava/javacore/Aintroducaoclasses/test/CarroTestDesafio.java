package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTestDesafio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Mitsubishi lancer";
        carro1.modelo = "GT";
        carro1.ano = 2019;
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("--------------------");

        Carro carro2 = new Carro();
        carro2.nome = "Ford";
        carro2.modelo = "Maverick";
        carro2.ano = 2020;
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
