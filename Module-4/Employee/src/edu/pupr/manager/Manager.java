package edu.pupr.manager;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        setBonus(0.0);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + getBonus();
    }

    @Override
    public String toString(){
        return super.toString() + "\t\t   *";
    }
}