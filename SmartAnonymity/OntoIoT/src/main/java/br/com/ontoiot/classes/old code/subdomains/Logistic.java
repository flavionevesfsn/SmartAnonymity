package br.com.ontoiot.classes.subdomains;

import br.com.ontoiot.classes.sensorcategory.*;

public class Logistic {

    private DataDoor dataDoor;
    private DataProductIdentification dataProductIdentification;
    private DataProductsLocation dataProductsLocation;
    private DataQualityProduct dataQualityProduct;
    private DataStockLevel dataStockLevel;
    private DataVehicleFuelConsumption dataVehicleFuelConsumption;
    private DataVehicleLocation dataVehicleLocation;
    private DataVehicleSpeedControl dataVehicleSpeedControl;

    public DataDoor getDataDoor() {
        return dataDoor;
    }

    public void setDataDoorSensors(DataDoor dataDoor) {
        this.dataDoor = dataDoor;
    }

    public DataProductIdentification getDataProductIdentification() {
        return dataProductIdentification;
    }

    public void setDataProductIdentification(DataProductIdentification dataProductIdentification) {
        this.dataProductIdentification = dataProductIdentification;
    }

    public DataProductsLocation getDataProductsLocation() {
        return dataProductsLocation;
    }

    public void setDataProductsLocation(DataProductsLocation dataProductsLocation) {
        this.dataProductsLocation = dataProductsLocation;
    }

    public DataQualityProduct getDataQualityProduct() {
        return dataQualityProduct;
    }

    public void setDataQualityProduct(DataQualityProduct dataQualityProduct) {
        this.dataQualityProduct = dataQualityProduct;
    }

    public DataStockLevel getDataStockLevel() {
        return dataStockLevel;
    }

    public void setDataStockLevel(DataStockLevel dataStockLevel) {
        this.dataStockLevel = dataStockLevel;
    }

    public DataVehicleFuelConsumption getDataVehicleFuelConsumption() {
        return dataVehicleFuelConsumption;
    }

    public void setDataVehicleFuelConsumption(DataVehicleFuelConsumption dataVehicleFuelConsumption) {
        this.dataVehicleFuelConsumption = dataVehicleFuelConsumption;
    }

    public DataVehicleLocation getDataVehicleLocation() {
        return dataVehicleLocation;
    }

    public void setDataVehicleLocation(DataVehicleLocation dataVehicleLocation) {
        this.dataVehicleLocation = dataVehicleLocation;
    }

    public DataVehicleSpeedControl getDataVehicleSpeedControl() {
        return dataVehicleSpeedControl;
    }

    public void setDataVehicleSpeedControl(DataVehicleSpeedControl dataVehicleSpeedControl) {
        this.dataVehicleSpeedControl = dataVehicleSpeedControl;
    }
}
