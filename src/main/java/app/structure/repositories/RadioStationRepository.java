package app.structure.repositories;

import app.structure.entities.RadioStation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RadioStationRepository extends PagingAndSortingRepository<RadioStation, Long> {

    @Query("from RadioStation rs")
    List<RadioStation> getRadioStations();

}
