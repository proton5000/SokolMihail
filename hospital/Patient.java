public class Patient extends Human  {
    private int health;
    private int money;
    private boolean insurance;
    private String diagnosis;

    public Patient(int health, int money, boolean insurance, String diagnosis) {
        this.health = health;
        this.money = money;
        this.insurance = insurance;
        this.diagnosis = diagnosis;
    }

    public boolean increase(int health) {
        this.health+=health;
        return health >= 100;
    }

    public int getMoney() {
        return money;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getHealth() {
        return health;
    }

    public boolean isInsurance() {
        return insurance;
    }
}
