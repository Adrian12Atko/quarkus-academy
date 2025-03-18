package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cadet extends PanacheEntity {
    public String name;
    public int age;

    @ManyToOne
    @JoinColumn(name = "school_id")
    public School school;

    @ManyToMany(mappedBy = "cadets")
    public List<Master> masters;
}
