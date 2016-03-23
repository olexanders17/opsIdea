package ua.ak.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "FIELD_PROFILE")
public class FieldProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "FIELD_CODE")
    String fieldСode;

    @Column(name = "FIELD_AREA")
    String fieldArea;

    @Column(name = "OBLAST")
    String oblast;

    @Column(name = "RAIJON")
    String raijon;

    @Column(name = "VILLAGE")
    String village;

   /* @OneToMany(fetch = FetchType.EAGER, mappedBy = "fieldProfile")
    List<FieldOperation> fieldOperations;*/


    public FieldProfile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFieldСode() {
        return fieldСode;
    }

    public void setFieldСode(String fieldСode) {
        this.fieldСode = fieldСode;
    }

    public String getFieldArea() {
        return fieldArea;
    }

    public void setFieldArea(String fieldArea) {
        this.fieldArea = fieldArea;
    }

    public String getOblast() {
        return oblast;
    }

    public void setOblast(String oblast) {
        this.oblast = oblast;
    }

    public String getRaijon() {
        return raijon;
    }

    public void setRaijon(String raijon) {
        this.raijon = raijon;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "FieldProfile{" +
                "id=" + id +
                ", fieldСode='" + fieldСode + '\'' +
                ", fieldArea='" + fieldArea + '\'' +
                ", oblast='" + oblast + '\'' +
                ", raijon='" + raijon + '\'' +
                ", village='" + village + '\'' +

                '}';
    }
}
