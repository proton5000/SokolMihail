public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient(70, 30, false, "Болит горло");
        Patient patient2 = new Patient(60, 25, false, "Болят глаза");
        Doctor doctor = new Doctor(25, new String[]{"Болит горло", "Болят глаза"}, 15 );

        Hospital hospital = new Hospital();

        hospital.receiveDoctor(doctor);
        hospital.receivePatient(patient1);
        hospital.receivePatient(patient2);

        hospital.heal();

        hospital.releae();

        hospital.heal();

        hospital.releae();

        hospital.heal();

        hospital.releae();

        hospital.heal();

        hospital.releae();


    }
}
