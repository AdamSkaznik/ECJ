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
@Table(name = "levelUnit")
public class Level {
    @Id
    @GeneratedValue
    private int idLevelUnit;
    private String description;
}
