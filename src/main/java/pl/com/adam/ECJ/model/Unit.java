package pl.com.adam.ECJ.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
