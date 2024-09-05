package app.structure.controllers;

import app.structure.entities.RadioStation;
import app.structure.services.RadioStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/radioStations")
public class RadioStationController {

    @Autowired
    private RadioStationService radioStationService;

    @GetMapping
    public ResponseEntity<List<RadioStation>> get(){
        return ResponseEntity.ok(radioStationService.getRadioStations());
    }

    @PostMapping
    public RadioStation save(@RequestBody RadioStation radioStation) {
        return radioStationService.save(radioStation);
    }


}
