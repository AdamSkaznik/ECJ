package pl.com.adam.ECJ.utils;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "archiveCategory")
public class loadArchiveCategory {
    private String symbol;
    private String clasificationKeyword;
    private String motherlyArchiveCategory;
    private String anotherArchiveCategory;
    private String description;
    private boolean isActive;
    private boolean isDeprected;
    private boolean isDelete;

    @XmlElement(name = "symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    @XmlElement(name = "clasificationKeyword")
    public String getClasificationKeyword() {
        return clasificationKeyword;
    }

    public void setClasificationKeyword(String clasificationKeyword) {
        this.clasificationKeyword = clasificationKeyword;
    }

    @XmlElement(name = "motherlyArchiveCategory")
    public String getMotherlyArchiveCategory() {
        return motherlyArchiveCategory;
    }

    public void setMotherlyArchiveCategory(String motherlyArchiveCategory) {
        this.motherlyArchiveCategory = motherlyArchiveCategory;
    }

    @XmlElement(name = "anotherArchiveCategory")
    public String getAnotherArchiveCategory() {
        return anotherArchiveCategory;
    }

    public void setAnotherArchiveCategory(String anotherArchiveCategory) {
        this.anotherArchiveCategory = anotherArchiveCategory;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "isActive")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @XmlElement(name = "isDeprected")
    public boolean isDeprected() {
        return isDeprected;
    }

    public void setDeprected(boolean deprected) {
        isDeprected = deprected;
    }

    @XmlElement(name = "isDelete")
    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
