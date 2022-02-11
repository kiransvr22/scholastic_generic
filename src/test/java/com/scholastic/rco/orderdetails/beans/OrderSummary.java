
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
    "GRAND_TOTAL",
    "ORDERS",
    "STUDENT_PAID",
    "STUDENT_PAID_TAX",
    "TOTAL_AMOUNT",
    "TOTAL_AMOUNT_TAX"
})
@Generated("jsonschema2pojo")
public class OrderSummary {

    @JsonProperty("GRAND_TOTAL")
    private Double grandTotal;
    @JsonProperty("ORDERS")
    private List<Object> orders = null;
    @JsonProperty("STUDENT_PAID")
    private String studentPaid;
    @JsonProperty("STUDENT_PAID_TAX")
    private String studentPaidTax;
    @JsonProperty("TOTAL_AMOUNT")
    private Double totalAmount;
    @JsonProperty("TOTAL_AMOUNT_TAX")
    private Double totalAmountTax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GRAND_TOTAL")
    public Double getGrandTotal() {
        return grandTotal;
    }

    @JsonProperty("GRAND_TOTAL")
    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    @JsonProperty("ORDERS")
    public List<Object> getOrders() {
        return orders;
    }

    @JsonProperty("ORDERS")
    public void setOrders(List<Object> orders) {
        this.orders = orders;
    }

    @JsonProperty("STUDENT_PAID")
    public String getStudentPaid() {
        return studentPaid;
    }

    @JsonProperty("STUDENT_PAID")
    public void setStudentPaid(String studentPaid) {
        this.studentPaid = studentPaid;
    }

    @JsonProperty("STUDENT_PAID_TAX")
    public String getStudentPaidTax() {
        return studentPaidTax;
    }

    @JsonProperty("STUDENT_PAID_TAX")
    public void setStudentPaidTax(String studentPaidTax) {
        this.studentPaidTax = studentPaidTax;
    }

    @JsonProperty("TOTAL_AMOUNT")
    public Double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("TOTAL_AMOUNT")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("TOTAL_AMOUNT_TAX")
    public Double getTotalAmountTax() {
        return totalAmountTax;
    }

    @JsonProperty("TOTAL_AMOUNT_TAX")
    public void setTotalAmountTax(Double totalAmountTax) {
        this.totalAmountTax = totalAmountTax;
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
