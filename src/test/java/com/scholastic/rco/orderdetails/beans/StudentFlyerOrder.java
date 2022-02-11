
package com.scholastic.rco.orderdetails.beans;

import java.util.HashMap;
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
    "STUDENT_FLYER_TOTAL",
    "STUDENT_FLYER_TOTAL_QTY",
    "STUDENT_FLYER_TOTAL_TAX",
    "STUDENTS"
})
@Generated("jsonschema2pojo")
public class StudentFlyerOrder {

    @JsonProperty("STUDENT_FLYER_TOTAL")
    private Integer studentFlyerTotal;
    @JsonProperty("STUDENT_FLYER_TOTAL_QTY")
    private Integer studentFlyerTotalQty;
    @JsonProperty("STUDENT_FLYER_TOTAL_TAX")
    private Double studentFlyerTotalTax;
    @JsonProperty("STUDENTS")
    private String students;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("STUDENT_FLYER_TOTAL")
    public Integer getStudentFlyerTotal() {
        return studentFlyerTotal;
    }

    @JsonProperty("STUDENT_FLYER_TOTAL")
    public void setStudentFlyerTotal(Integer studentFlyerTotal) {
        this.studentFlyerTotal = studentFlyerTotal;
    }

    @JsonProperty("STUDENT_FLYER_TOTAL_QTY")
    public Integer getStudentFlyerTotalQty() {
        return studentFlyerTotalQty;
    }

    @JsonProperty("STUDENT_FLYER_TOTAL_QTY")
    public void setStudentFlyerTotalQty(Integer studentFlyerTotalQty) {
        this.studentFlyerTotalQty = studentFlyerTotalQty;
    }

    @JsonProperty("STUDENT_FLYER_TOTAL_TAX")
    public Double getStudentFlyerTotalTax() {
        return studentFlyerTotalTax;
    }

    @JsonProperty("STUDENT_FLYER_TOTAL_TAX")
    public void setStudentFlyerTotalTax(Double studentFlyerTotalTax) {
        this.studentFlyerTotalTax = studentFlyerTotalTax;
    }

    @JsonProperty("STUDENTS")
    public String getStudents() {
        return students;
    }

    @JsonProperty("STUDENTS")
    public void setStudents(String students) {
        this.students = students;
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
