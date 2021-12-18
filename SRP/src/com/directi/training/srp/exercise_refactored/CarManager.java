package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarManager{
    
    private final CarDao carDao;
    private final CarFormatter carFormatter;
    private final CarRater carRater;

    public CarManager(CarDao carDao, CarFormatter carFormatter, CarRater carRater){
        this.carDao = carDao;
        this.carFormatter = carFormatter;
        this.carRater = carRater;
    }

    public Car getCarById(final String carId){
        return carDao.findById(carId);
    }

    public String getCarsNames(){
        return carFormatter.getCarsNames(carDao.findAll());
    }

    public Car getBestCar(){
        return carRater.getBestCar(carDao.findAll());
    }
}
