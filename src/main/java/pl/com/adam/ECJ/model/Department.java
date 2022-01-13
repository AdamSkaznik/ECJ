package pl.com.adam.ECJ.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    private int idDepartment;
    private String departmentName;
    private String departmentDescription;
    @ManyToOne
    @JoinColumn(name = "idUnit")
    private Unit unit;
    @ManyToOne
    @JoinColumn(name = "idJournal")
    private Journal journal;
}
