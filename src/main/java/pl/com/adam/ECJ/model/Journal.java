package pl.com.adam.ECJ.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "journal")
public class Journal {

    @Id
    @GeneratedValue
    private Long idJournal;
    private String description;
    private boolean isActive;
    @OneToMany(mappedBy = "idDepartment")
    private Set<Department> departments;
}
