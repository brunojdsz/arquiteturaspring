package com.project.brunojdsz.arquiteturaspring.automaker.api;

import com.project.brunojdsz.arquiteturaspring.automaker.Engine;
import com.project.brunojdsz.arquiteturaspring.automaker.HondaHRV;
import com.project.brunojdsz.arquiteturaspring.automaker.Key;
import com.project.brunojdsz.arquiteturaspring.automaker.StatusCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class FactoryControllerTest {

    @Autowired
    @Electric
    private Engine engine;

    @PostMapping
    public StatusCar TurnCarOn(@RequestBody  Key key){
        var car = new HondaHRV(engine);
        return car.ignite(key);
    }
}
