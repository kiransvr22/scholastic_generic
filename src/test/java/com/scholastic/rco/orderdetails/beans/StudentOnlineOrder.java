
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
    "ONLINE_TOTAL",
    "ONLINE_TOTAL_QTY",
    "ONLINE_TOTAL_TAX",
    "STUDENTS"
})
@Generated("jsonschema2pojo")
public class StudentOnlineOrder {

    @JsonProperty("ONLINE_TOTAL")
    private Double onlineTotal;
    @JsonProperty("ONLINE_TOTAL_QTY")
    private Integer onlineTotalQty;
    @JsonProperty("ONLINE_TOTAL_TAX")
    private Double onlineTotalTax;
    @JsonProperty("STUDENTS")
    private List<Student> students = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ONLINE_TOTAL")
    public Double getOnlineTotal() {
        return onlineTotal;
    }

    @JsonProperty("ONLINE_TOTAL")
    public void setOnlineTotal(Double onlineTotal) {
        this.onlineTotal = onlineTotal;
    }

    @JsonProperty("ONLINE_TOTAL_QTY")
    public Integer getOnlineTotalQty() {
        return onlineTotalQty;
    }

    @JsonProperty("ONLINE_TOTAL_QTY")
    public void setOnlineTotalQty(Integer onlineTotalQty) {
        this.onlineTotalQty = onlineTotalQty;
    }

    @JsonProperty("ONLINE_TOTAL_TAX")
    public Double getOnlineTotalTax() {
        return onlineTotalTax;
    }

    @JsonProperty("ONLINE_TOTAL_TAX")
    public void setOnlineTotalTax(Double onlineTotalTax) {
        this.onlineTotalTax = onlineTotalTax;
    }

    @JsonProperty("STUDENTS")
    public List<Student> getStudents() {
        return students;
    }

    @JsonProperty("STUDENTS")
    public void setStudents(List<Student> students) {
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
