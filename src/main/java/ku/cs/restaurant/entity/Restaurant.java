package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data //auto get-set
@Entity
public class Restaurant {
    @Id //primary key
    @GeneratedValue //auto-get pk
    private UUID id;

    private String name;
    private double rating;
    private String location;
}
