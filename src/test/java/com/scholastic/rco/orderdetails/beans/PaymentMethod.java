
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
    "PAYMENT_METHOD_DETAIL"
})
@Generated("jsonschema2pojo")
public class PaymentMethod {

    @JsonProperty("PAYMENT_METHOD_DETAIL")
    private List<Object> paymentMethodDetail = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PAYMENT_METHOD_DETAIL")
    public List<Object> getPaymentMethodDetail() {
        return paymentMethodDetail;
    }

    @JsonProperty("PAYMENT_METHOD_DETAIL")
    public void setPaymentMethodDetail(List<Object> paymentMethodDetail) {
        this.paymentMethodDetail = paymentMethodDetail;
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
