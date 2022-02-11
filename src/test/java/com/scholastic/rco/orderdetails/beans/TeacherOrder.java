
package com.scholastic.rco.orderdetails.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TEACHER_TOTAL_BONUS",
    "TEACHER_TOTAL_BONUS_QTY",
    "TEACHER_TOTAL_PRICE",
    "TEACHER_TOTAL_QTY",
    "TEACHER_TOTAL_TAX",
    "ITEMS"
})
@Generated("jsonschema2pojo")
public class TeacherOrder {

    @JsonProperty("TEACHER_TOTAL_BONUS")
    private Integer teacherTotalBonus;
    @JsonProperty("TEACHER_TOTAL_BONUS_QTY")
    private String teacherTotalBonusQty;
    @JsonProperty("TEACHER_TOTAL_PRICE")
    private Double teacherTotalPrice;
    @JsonProperty("TEACHER_TOTAL_QTY")
    private Integer teacherTotalQty;
    @JsonProperty("TEACHER_TOTAL_TAX")
    private Double teacherTotalTax;
    @JsonProperty("ITEMS")
    private List<Item> items = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TEACHER_TOTAL_BONUS")
    public Integer getTeacherTotalBonus() {
        return teacherTotalBonus;
    }

    @JsonProperty("TEACHER_TOTAL_BONUS")
    public void setTeacherTotalBonus(Integer teacherTotalBonus) {
        this.teacherTotalBonus = teacherTotalBonus;
    }

    @JsonProperty("TEACHER_TOTAL_BONUS_QTY")
    public String getTeacherTotalBonusQty() {
        return teacherTotalBonusQty;
    }

    @JsonProperty("TEACHER_TOTAL_BONUS_QTY")
    public void setTeacherTotalBonusQty(String teacherTotalBonusQty) {
        this.teacherTotalBonusQty = teacherTotalBonusQty;
    }

    @JsonProperty("TEACHER_TOTAL_PRICE")
    public Double getTeacherTotalPrice() {
        return teacherTotalPrice;
    }

    @JsonProperty("TEACHER_TOTAL_PRICE")
    public void setTeacherTotalPrice(Double teacherTotalPrice) {
        this.teacherTotalPrice = teacherTotalPrice;
    }

    @JsonProperty("TEACHER_TOTAL_QTY")
    public Integer getTeacherTotalQty() {
        return teacherTotalQty;
    }

    @JsonProperty("TEACHER_TOTAL_QTY")
    public void setTeacherTotalQty(Integer teacherTotalQty) {
        this.teacherTotalQty = teacherTotalQty;
    }

    @JsonProperty("TEACHER_TOTAL_TAX")
    public Double getTeacherTotalTax() {
        return teacherTotalTax;
    }

    @JsonProperty("TEACHER_TOTAL_TAX")
    public void setTeacherTotalTax(Double teacherTotalTax) {
        this.teacherTotalTax = teacherTotalTax;
    }

    @JsonProperty("ITEMS")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("ITEMS")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
