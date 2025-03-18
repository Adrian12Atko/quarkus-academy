package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Master extends PanacheEntity {
    public String name;
    public int age;

    @ManyToOne
    @JoinColumn(name = "school_id")
    public School school;

    @ManyToMany
    @JoinTable(
            name = "Trains",
            joinColumns = @JoinColumn(name = "master_id"),
            inverseJoinColumns = @JoinColumn(name = "cadet_id")
    )
    public List<Cadet> cadets;
}
