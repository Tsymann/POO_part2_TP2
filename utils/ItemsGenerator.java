package com.tactfactory.javaniveau2.tps.tp2.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tactfactory.javaniveau2.tps.tp2.entities.Car;
import com.tactfactory.javaniveau2.tps.tp2.entities.CarType;
import com.tactfactory.javaniveau2.tps.tp2.entities.User;

public class ItemsGenerator {

  private static final int CAR_NB_ITEMS = 10;
  private static final int CAR_NB_MARK = 4;
  private static final int CAR_MAX_MILEAGE = 600000;

  private static final int USER_NB_ITEMS = 100;

  public static List<User> generateUsers(){
    List<User> result = new ArrayList<User>();

    List<Car> cars = generateCars();

    for (int i = 1; i <= USER_NB_ITEMS; i++) {
      User user = new User();

      user.setId(i);
      user.setFirstname(StringUtils.randomString(5, 15));
      user.setLastname(StringUtils.randomString(5, 15));

      Car car = cars.get(new Random().nextInt(USER_NB_ITEMS - 1) % cars.size());
      user.setCar(car);
      cars.remove(car);

      result.add(user);
    }

    return result;
  }

  public static List<CarType> generateCarTypes(){
    List<CarType> result = new ArrayList<CarType>();

    for (int i = 1; i <= CAR_NB_ITEMS; i++) {
      CarType carType = new CarType();

      carType.setId(i);
      carType.setMark("marque" + ((i % CAR_NB_MARK) + 1));
      carType.setName(StringUtils.randomString(5, 15));

      result.add(carType);
    }

    return result;
  }

  public static List<Car> generateCars(){
    List<Car> result = new ArrayList<Car>();

    List<CarType> carTypes = generateCarTypes();

    for (int i = 1; i <= USER_NB_ITEMS; i++) {
      Car car = new Car();

      car.setId(i);
      car.setMileage(Math.abs(new Random().nextLong() % CAR_MAX_MILEAGE));
      car.setCarType(carTypes.get(new Random().nextInt(CAR_NB_ITEMS - 1) % CAR_NB_ITEMS + 1));

      result.add(car);
    }

    return result;
  }
}
