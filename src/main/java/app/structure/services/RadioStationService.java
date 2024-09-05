package app.structure.services;

import app.structure.entities.RadioStation;
import app.structure.repositories.RadioStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class RadioStationService {

    @Autowired
    private RadioStationRepository radioStationRepository;

    public RadioStation save(RadioStation radioStation){
        return radioStationRepository.save(radioStation);
    }

    public List<RadioStation> getRadioStations() {
        Optional<List<RadioStation>> optionalRadioStations;
        List<RadioStation> radioStationsList = radioStationRepository.getRadioStations();
        optionalRadioStations = Optional.ofNullable(radioStationsList);
        List<RadioStation> radioStations = optionalRadioStations.orElse(Collections.EMPTY_LIST);
        return radioStations;
    }

}
