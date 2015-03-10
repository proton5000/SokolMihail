public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new Patient[5];
    private Doctor[] doctors = new Doctor[3];

    public  boolean receivePatient(Patient newPatient){
        if (newPatient.getMoney() <= 0 && !newPatient.isInsurance()){
            return false;
        }
        if (patientCount == patients.length){
            return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
            return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        System.out.println("Patient leg v bolnitcu");
        patients[patientCount] = newPatient;
        patientCount++;
        return true;
    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Doctor prishel v bolnitcu");
        return true;
    }
    public void heal(){
        if (patientCount != 0) {
            for (int i = 0; i < doctorCount; i++) {
                doctors[i].heal();
            }
        } else {
            System.out.println("Пациентов нет");
        }
    }
    public void releae(){

        if (patientCount != 0) {

            for (int i = 0; i < patients.length; i++) {

                if (patients[i] != null) {

                    if (patients[i].getHealth() >= 100) {
                        System.out.println("Пациент " + patients[i].getDiagnosis() + " здоров - выписываеться из больницы");
                        patients[i] = null;
                        patientCount--;
                    }
                }

            }
        }
    }

}
