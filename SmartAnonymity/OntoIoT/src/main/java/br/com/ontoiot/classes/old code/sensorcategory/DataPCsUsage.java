package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Cmos;
import br.com.ontoiot.classes.sensors.ElectroOptical;

public class DataPCsUsage {

    private Cmos cmos;
    private ElectroOptical electroOptical;


    public Cmos getCmos() {
        return cmos;
    }

    public void setCmos(Cmos cmos) {
        this.cmos = cmos;
    }

    public ElectroOptical getElectroOptical() {
        return electroOptical;
    }

    public void setElectroOptical(ElectroOptical electroOptical) {
        this.electroOptical = electroOptical;
    }
}
