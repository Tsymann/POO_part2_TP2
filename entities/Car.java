package com.tactfactory.javaniveau2.tps.tp2.entities;

public class Car {

  private long id;
  private long mileage;
  private CarType carType;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getMileage() {
    return mileage;
  }

  public void setMileage(long mileage) {
    this.mileage = mileage;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  @Override
  public String toString() {
    return "Car [id=" + id + ", mileage=" + mileage + ", carType=" + carType + "]";
  }

}
