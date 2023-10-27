package questaoUm;

import java.util.ArrayList;

public class Company {
    public String name;
    public ArrayList<Employ> employees;

    public Company(String name, ArrayList<Employ> employe) {
        this.name = name;
        this.employees = employe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employ> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employ> employees) {
        this.employees = employees;
    }

}
