package upao.edu.pe.apiparking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import upao.edu.pe.apiparking.entities.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upao.edu.pe.apiparking.service.ParkingSevice;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    //Inyeccion de dependecias ==> Instancia
    private final ParkingSevice parkingSevice;
    public ParkingController(ParkingSevice parkingSevice){
        this.parkingSevice = parkingSevice;
    }

    @GetMapping("/cars")//http://dominio/parking/cars
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(this.parkingSevice.getAllCars());
    }

    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(Car car){
        this.parkingSevice.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }



}
