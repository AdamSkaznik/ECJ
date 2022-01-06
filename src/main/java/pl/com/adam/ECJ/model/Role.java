package pl.com.adam.ECJ.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;
    @Column(name = "role_description")
    private String roleDescription;
    @Column(name = "role_active")
    private boolean isActive;
}
