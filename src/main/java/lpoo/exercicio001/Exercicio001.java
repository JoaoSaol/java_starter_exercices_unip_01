/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lpoo.exercicio001;

/**
 *
 * @author joaosaol
 */
public class Exercicio001 {

    // Escrevendo nome, data de nascimento, endereço e cidade de nascimento
    public static void a() {
        String nome, dataNascimento, endereco, cidadeNascimento;
        nome = "João Marcos";
        dataNascimento = "21/01/2004";
        endereco = "Setor Universitário";
        cidadeNascimento = "Santos-SP";

        System.out.println(nome + " " + dataNascimento);
        System.out.println(endereco + " " + cidadeNascimento);
    }

    // Escrevendo idades na terra
    public static void b() {
        int idade1, idade2, idade3, idade4, idade5;

        idade1 = 31;
        idade2 = 27;
        idade3 = 35;
        idade4 = 23;
        idade5 = 22;

        System.out.println("A idade de João é: " + idade1);
        System.out.println("A idade de Pedro é: " + idade2);
        System.out.println("A idade de Lucas é: " + idade3);
        System.out.println("A idade de Rodolfo é: " + idade4);
        System.out.println("A idade de Marina é: " + idade5);
    }

    public static void c() {
        double vreal, vdolar, dolar;

        vreal = 3657.38; // valor em reais
        vdolar = 2.35; // taxa de câmbio
        dolar = vreal / vdolar; // valor em dólares
        
        System.out.println("R$" + vreal + " equivale a $" + dolar);
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.out.println("Exercícios de JAVA UNIP Aula 1");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Letra A:");
        a();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Letra B:");
        b();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Letra C:");
        c();
    }
}
