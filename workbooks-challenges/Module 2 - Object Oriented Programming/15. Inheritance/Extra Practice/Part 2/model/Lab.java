package model;

import java.util.ArrayList;
import java.util.List;

public class Lab {
    private List<LabEquipment> labEquipments;

    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        return this.labEquipments.get(index).clone();
    }

    public void setLabEquipment(int index, LabEquipment labEquipment) {
        this.labEquipments.set(index, labEquipment.clone());
    }

    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }
}
