package br.com.ontoiot.classes.subdomains;

import br.com.ontoiot.classes.sensorcategory.*;

public class SmartGrid {
    private DataConnectedDevicesEnergy dataConnectedDevicesEnergy;
    private DataEnergyConsumption dataEnergyConsumption;
    private DataEnergyGeneration dataEnergyGeneration;
    private DataEnergyStorage dataEnergyStorage;
    private DataEnergyTransmission dataEnergyTransmission;
    private DataPowerEnergy dataPowerEnergy;
    private DataTimeUseDevices dataTimeUseDevices;

    public DataConnectedDevicesEnergy getDataConnectedDevicesEnergy() {
        return dataConnectedDevicesEnergy;
    }

    public void setDataConnectedDevicesEnergy(DataConnectedDevicesEnergy dataConnectedDevicesEnergy) {
        this.dataConnectedDevicesEnergy = dataConnectedDevicesEnergy;
    }

    public DataEnergyConsumption getDataEnergyConsumption() {
        return dataEnergyConsumption;
    }

    public void setDataEnergyConsumption(DataEnergyConsumption dataEnergyConsumption) {
        this.dataEnergyConsumption = dataEnergyConsumption;
    }

    public DataEnergyGeneration getDataEnergyGeneration() {
        return dataEnergyGeneration;
    }

    public void setDataEnergyGeneration(DataEnergyGeneration dataEnergyGeneration) {
        this.dataEnergyGeneration = dataEnergyGeneration;
    }

    public DataEnergyStorage getDataEnergyStorage() {
        return dataEnergyStorage;
    }

    public void setDataEnergyStorage(DataEnergyStorage dataEnergyStorage) {
        this.dataEnergyStorage = dataEnergyStorage;
    }

    public DataEnergyTransmission getDataEnergyTransmission() {
        return dataEnergyTransmission;
    }

    public void setDataEnergyTransmission(DataEnergyTransmission dataEnergyTransmission) {
        this.dataEnergyTransmission = dataEnergyTransmission;
    }

    public DataPowerEnergy getDataPowerEnergy() {
        return dataPowerEnergy;
    }

    public void setDataPowerEnergy(DataPowerEnergy dataPowerEnergy) {
        this.dataPowerEnergy = dataPowerEnergy;
    }

    public DataTimeUseDevices getDataTimeUseDevices() {
        return dataTimeUseDevices;
    }

    public void setDataTimeUseDevices(DataTimeUseDevices dataTimeUseDevices) {
        this.dataTimeUseDevices = dataTimeUseDevices;
    }
}
