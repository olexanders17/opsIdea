package ua.ak.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "YIELD_HISTORY")
public class YieldHistory {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "FIELD_CODE")
    private String fieldCode;

    @Column(name = "CROP")
    private String сrop;

    @Column(name = "YEAR_HARVEST")
    private Integer yearHarvest;

    @Column(name = "HARVESTED_AREA")
    private Double harvestedArea;

    @Column(name = "HARVESTED_TONES")
    private Double harvestedTones;

    @Column(name = "GROSS_YIELD")
    private Double grossYield;

    public YieldHistory() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getСrop() {
        return сrop;
    }

    public void setСrop(String сrop) {
        this.сrop = сrop;
    }

    public Integer getYearHarvest() {
        return yearHarvest;
    }

    public void setYearHarvest(Integer yearHarvest) {
        this.yearHarvest = yearHarvest;
    }

    public Double getHarvestedArea() {
        return harvestedArea;
    }

    public void setHarvestedArea(Double harvestedArea) {
        this.harvestedArea = harvestedArea;
    }

    public Double getHarvestedTones() {
        return harvestedTones;
    }

    public void setHarvestedTones(Double harvestedTones) {
        this.harvestedTones = harvestedTones;
    }

    public Double getGrossYield() {
        return grossYield;
    }

    public void setGrossYield(Double grossYield) {
        this.grossYield = grossYield;
    }

    @Override
    public String toString() {
        return "YieldHistory [id=" + id + ", fieldCode=" + fieldCode + ", Crop=" + сrop + ", yearHarvest=" + yearHarvest + ", harvestedArea="
                + harvestedArea + ", harvestedTones=" + harvestedTones + ", grossYield=" + grossYield + "]";
    }

}
