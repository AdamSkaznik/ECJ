package pl.com.adam.ECJ.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "unit")
public class Unit {
    @Id
    @GeneratedValue
    private int idUnit;
    private String codeUnit;
    private String shortName;
    private String fullName;
    private String codeParentUnit;
    @OneToMany(mappedBy = "idDepartment")
    private Set<Department> departments;

}
