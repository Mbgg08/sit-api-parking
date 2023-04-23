package upao.edu.pe.apiparking.service;


import upao.edu.pe.apiparking.entities.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ParkingSevice {
    private List<Car> parkingLot;

    public ParkingSevice(){
        this.parkingLot = new ArrayList<>();
    }


    //TODO: US 1: Como usuario, quiero poder ver la lista de todos los autos estacionados en el
    //parqueo, para poder tener una visión general del estado actual del
    //estacionamiento.

    public List<Car> getAllCars() {
        return parkingLot;
    }

    //TODO: US 2: Como usuario, quiero poder agregar un auto al parqueo, para poder estacionar
    //mi vehículo.

    public void addCar(Car car){
        this.parkingLot.add(car);
    }
}
