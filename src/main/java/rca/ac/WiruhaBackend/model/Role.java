package rca.ac.WiruhaBackend.model;

import jakarta.persistence.*;
import lombok.Generated;

import java.util.Set;

@Entity
public class Role {
    @Generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String category;
    private String address;


    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
