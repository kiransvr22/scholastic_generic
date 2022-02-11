
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
    "SHIPPING_TYPE",
    "SHIP_TO_ADDRESS_LINE_1",
    "SHIP_TO_ADDRESS_LINE_2",
    "SHIP_TO_CITY",
    "SHIP_TO_NAME",
    "SHIP_TO_STATE",
    "SHIP_TO_TELEPHONE",
    "SHIP_TO_ZIPCODE"
})
@Generated("jsonschema2pojo")
public class ShipTo {

    @JsonProperty("SHIPPING_TYPE")
    private String shippingType;
    @JsonProperty("SHIP_TO_ADDRESS_LINE_1")
    private String shipToAddressLine1;
    @JsonProperty("SHIP_TO_ADDRESS_LINE_2")
    private String shipToAddressLine2;
    @JsonProperty("SHIP_TO_CITY")
    private String shipToCity;
    @JsonProperty("SHIP_TO_NAME")
    private String shipToName;
    @JsonProperty("SHIP_TO_STATE")
    private String shipToState;
    @JsonProperty("SHIP_TO_TELEPHONE")
    private String shipToTelephone;
    @JsonProperty("SHIP_TO_ZIPCODE")
    private String shipToZipcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SHIPPING_TYPE")
    public String getShippingType() {
        return shippingType;
    }

    @JsonProperty("SHIPPING_TYPE")
    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    @JsonProperty("SHIP_TO_ADDRESS_LINE_1")
    public String getShipToAddressLine1() {
        return shipToAddressLine1;
    }

    @JsonProperty("SHIP_TO_ADDRESS_LINE_1")
    public void setShipToAddressLine1(String shipToAddressLine1) {
        this.shipToAddressLine1 = shipToAddressLine1;
    }

    @JsonProperty("SHIP_TO_ADDRESS_LINE_2")
    public String getShipToAddressLine2() {
        return shipToAddressLine2;
    }

    @JsonProperty("SHIP_TO_ADDRESS_LINE_2")
    public void setShipToAddressLine2(String shipToAddressLine2) {
        this.shipToAddressLine2 = shipToAddressLine2;
    }

    @JsonProperty("SHIP_TO_CITY")
    public String getShipToCity() {
        return shipToCity;
    }

    @JsonProperty("SHIP_TO_CITY")
    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    @JsonProperty("SHIP_TO_NAME")
    public String getShipToName() {
        return shipToName;
    }

    @JsonProperty("SHIP_TO_NAME")
    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    @JsonProperty("SHIP_TO_STATE")
    public String getShipToState() {
        return shipToState;
    }

    @JsonProperty("SHIP_TO_STATE")
    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    @JsonProperty("SHIP_TO_TELEPHONE")
    public String getShipToTelephone() {
        return shipToTelephone;
    }

    @JsonProperty("SHIP_TO_TELEPHONE")
    public void setShipToTelephone(String shipToTelephone) {
        this.shipToTelephone = shipToTelephone;
    }

    @JsonProperty("SHIP_TO_ZIPCODE")
    public String getShipToZipcode() {
        return shipToZipcode;
    }

    @JsonProperty("SHIP_TO_ZIPCODE")
    public void setShipToZipcode(String shipToZipcode) {
        this.shipToZipcode = shipToZipcode;
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
