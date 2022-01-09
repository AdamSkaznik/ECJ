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
@Table(name = "archiveCategory")
public class ArchiveCategory {
    @Id
    @GeneratedValue
    private int idArchive;
    private String symbol;
    private String clasificationKeyword;
    private String motherlyArchiveCategory;
    private String anotherArchiveCategory;
    private String description;
    private boolean isActive;
    private boolean isDeprected;
    private boolean isDelete;
}
