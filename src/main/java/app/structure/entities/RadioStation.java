package app.structure.entities;

import javax.persistence.*;

@Entity(name = "RadioStation")
@Table(name = "radio_station")
public class RadioStation {

    @Id
    @Column(name = "radiostation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "radiostation_name", nullable = false)
    private String name;

    @Column(name = "radiostation_url", nullable = false)
    private String url;

    public RadioStation() {
    }

    public RadioStation(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
