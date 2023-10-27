package questaoDois;

import java.util.HashMap;
import java.util.Scanner;

public class questaoDois {
    public HashMap<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) {
        questaoDois instancia = new questaoDois();

        while (1 == 1) {
            System.out.println("");
            System.out.println("O que voce quer fazer? 1 para cadastro e 2 para login");
            int escolha = new Scanner(System.in).nextInt();
            if (escolha == 1) {
                System.out.println("Digite um nome: ");
                String nome = new Scanner(System.in).nextLine();
                System.out.println("Digite uma senha: ");
                String senha = new Scanner(System.in).nextLine();
                instancia.cadastro(nome, senha);
            } else if (escolha == 2) {
                System.out.println("Digite um nome: ");
                String nome = new Scanner(System.in).nextLine();
                System.out.println("Digite uma senha: ");
                String senha = new Scanner(System.in).nextLine();
                instancia.login(nome, senha);
            } else {
                System.out.println("Escolha uma opção valida!!!");
                System.out.println("Essas é a lista com os usuários: ");
                System.out.println(instancia.getListOfMaps());
                System.out.println("");
            }
        }

    }

    public void cadastro(String nome, String senha) {
        this.map.put(nome, senha);
        System.out.println(this.getListOfMaps());
    }

    public HashMap<String, String> getListOfMaps() {
        return this.map;
    }

    public void setListOfMaps(HashMap<String, String> listOfMaps) {
        this.map = listOfMaps;
    }

    public void login(String nome, String senha) {
        String valor = this.map.get(nome);
        if (valor.equals(senha)) {
            System.out.println("Login foi um sucesso");
        } else {
            System.out.println("Login não foi efetuado");
        }
    }
}
