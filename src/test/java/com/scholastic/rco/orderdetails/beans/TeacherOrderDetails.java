
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
    "GENERALINFO",
    "ORDER"
})
@Generated("jsonschema2pojo")
public class TeacherOrderDetails {

    @JsonProperty("GENERALINFO")
    private Generalinfo generalinfo;
    @JsonProperty("ORDER")
    private Order order;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GENERALINFO")
    public Generalinfo getGeneralinfo() {
        return generalinfo;
    }

    @JsonProperty("GENERALINFO")
    public void setGeneralinfo(Generalinfo generalinfo) {
        this.generalinfo = generalinfo;
    }

    @JsonProperty("ORDER")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("ORDER")
    public void setOrder(Order order) {
        this.order = order;
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
