package com.example.springaop.Controller.Rest;

import com.example.springaop.Model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @PostMapping("")
    public ResponseEntity<?> saveCar(@Valid @RequestBody Car car, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, String> validationErrors = new HashMap<String, String>();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(validationErrors);
        }

        System.out.println("Car added");
        return ResponseEntity.ok(car);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findCarById(@PathVariable int id) throws IllegalStateException {

        // id not found throw exception

        /*// <-- Using with @ControllerAdvice Annotation and exception catch in ExceptionsHandler Class. -->
        throw new IllegalStateException(String.format("Car not found id: %s", id));*/

        try {
            throw new IllegalStateException(String.format("Car not found id: %s", id));
        } catch (Exception e){
            return new ResponseEntity<>("Error found", HttpStatus.NOT_FOUND);
        }

    }

}
