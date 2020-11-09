package com.tactfactory.javaniveau2.tps.tp2.entities;

public class User {

  private long id;
  private String firstname;
  private String lastname;
  private Car car;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public String getFullName() {
    return this.firstname + "." + this.lastname;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", car=" + car
        + ", getFullName()=" + getFullName() + "]";
  }
}
