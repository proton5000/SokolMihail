public class Doctor extends Human {
    private int skill;
    private String[] diagnosis;
    private int cost;
    private int patientCount;
    private Patient[] patients = new Patient[5];

    public Doctor(int skill, String[] diagnosis, int cost) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public void heal(){


            for (int i = 0; i < patientCount; i++) {
                int min = Math.min(skill, patients[i].getMoney());
                patients[i].increase(min);
                System.out.println("Пациент " + patients[i].getDiagnosis() + " стал здоровее на " + min + " значение " + "( здоровье " + patients[i].getHealth() + " )");
            }

    }

    public boolean ifCanHeal(Patient patient){
        if (patientCount == patients.length) {
            System.out.println("Я не могу лечить этого пациента");
            return false;
        }
        for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis[i].equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println("Я могу лечить этого пациента");
                return true;
            }
        }
        System.out.println("Я не могу лечить этого пациента");
        return false;
    }
    public void addPatient(Patient patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент добавлен к доктору");
    }


}
