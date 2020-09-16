package array.sorting.medicines;

import java.util.ArrayList;

public class MedicalList {
    private ArrayList<String> medicalList = new ArrayList<>();

    public void addMedicineList(String items) {
        medicalList.add(items);
    }

    public void printMedicalList() {
        System.out.println(" your have " + medicalList.size() + " in your list ");
        for (int i = 0; i < medicalList.size(); i++) {
            System.out.println((i + 1) + ". " + medicalList.get(i));
        }
    }


}