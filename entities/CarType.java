package com.tactfactory.javaniveau2.tps.tp2.entities;

public class CarType {

  private long id;
  private String mark;
  private String name;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Car [id=" + id + ", mark=" + mark + ", name=" + name + "]";
  }
}
