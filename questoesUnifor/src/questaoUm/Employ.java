package questaoUm;

import java.util.ArrayList;

public class Employ {
    public ArrayList<Vehicle> automoveis;
    public Company companhia;
    public String name;

    public Employ(Company companhia, String name) {
        this.automoveis = new ArrayList<Vehicle>();
        this.companhia = companhia;
        this.name = name;
    }

}
