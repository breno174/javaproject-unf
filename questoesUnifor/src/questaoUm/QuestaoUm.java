package questaoUm;

import java.util.ArrayList;

public class QuestaoUm {
    public static void main(String[] args) {
        ArrayList<Employ> vazio = new ArrayList<Employ>();
        Company companhia = new Company("Ford", vazio);
        Employ empregado = new Employ(companhia, "Fulano");
        Car carro = new Car("23", "powershift");
        Truck scania = new Truck("32154", 30);

        System.out.println(empregado.name);
        System.out.println("vende carros da marca");
        System.out.println(companhia.name);
        System.out.print("e o modelo mais vendido é o com cambio: ");
        System.out.println(carro.gettransmission());
        System.out.print("massa do caminhão: ");
        System.out.println(scania.getMass());
        System.out.print("companhia do empregado: ");
        System.out.println(empregado.companhia.name);
    }

}
