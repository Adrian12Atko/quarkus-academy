package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School extends PanacheEntity {
    public String name;
    public String location;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    public List<Master> masters;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    public List<Cadet> cadets;
}
