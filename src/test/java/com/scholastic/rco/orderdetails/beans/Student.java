
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
    "STUDENTS_ITEMS",
    "STUDENT_NAME",
    "STUDENT_PLACED_DATE",
    "STUDENT_TOTAL_PRICE",
    "STUDENT_TOTAL_QTY",
    "STUDENT_TOTAL_TAX"
})
@Generated("jsonschema2pojo")
public class Student {

    @JsonProperty("STUDENTS_ITEMS")
    private List<StudentsItem> studentsItems = null;
    @JsonProperty("STUDENT_NAME")
    private String studentName;
    @JsonProperty("STUDENT_PLACED_DATE")
    private String studentPlacedDate;
    @JsonProperty("STUDENT_TOTAL_PRICE")
    private Double studentTotalPrice;
    @JsonProperty("STUDENT_TOTAL_QTY")
    private Integer studentTotalQty;
    @JsonProperty("STUDENT_TOTAL_TAX")
    private Double studentTotalTax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("STUDENTS_ITEMS")
    public List<StudentsItem> getStudentsItems() {
        return studentsItems;
    }

    @JsonProperty("STUDENTS_ITEMS")
    public void setStudentsItems(List<StudentsItem> studentsItems) {
        this.studentsItems = studentsItems;
    }

    @JsonProperty("STUDENT_NAME")
    public String getStudentName() {
        return studentName;
    }

    @JsonProperty("STUDENT_NAME")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @JsonProperty("STUDENT_PLACED_DATE")
    public String getStudentPlacedDate() {
        return studentPlacedDate;
    }

    @JsonProperty("STUDENT_PLACED_DATE")
    public void setStudentPlacedDate(String studentPlacedDate) {
        this.studentPlacedDate = studentPlacedDate;
    }

    @JsonProperty("STUDENT_TOTAL_PRICE")
    public Double getStudentTotalPrice() {
        return studentTotalPrice;
    }

    @JsonProperty("STUDENT_TOTAL_PRICE")
    public void setStudentTotalPrice(Double studentTotalPrice) {
        this.studentTotalPrice = studentTotalPrice;
    }

    @JsonProperty("STUDENT_TOTAL_QTY")
    public Integer getStudentTotalQty() {
        return studentTotalQty;
    }

    @JsonProperty("STUDENT_TOTAL_QTY")
    public void setStudentTotalQty(Integer studentTotalQty) {
        this.studentTotalQty = studentTotalQty;
    }

    @JsonProperty("STUDENT_TOTAL_TAX")
    public Double getStudentTotalTax() {
        return studentTotalTax;
    }

    @JsonProperty("STUDENT_TOTAL_TAX")
    public void setStudentTotalTax(Double studentTotalTax) {
        this.studentTotalTax = studentTotalTax;
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
