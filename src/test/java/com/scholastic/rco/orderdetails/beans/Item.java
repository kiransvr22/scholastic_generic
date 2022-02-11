
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
    "ITEM_BONUS",
    "ITEM_BONUS_QTY",
    "ITEM_BOOKTRUST",
    "ITEM_FLYER",
    "ITEM_ID",
    "ITEM_NLA",
    "ITEM_OOS",
    "ITEM_PRICE",
    "ITEM_QTY",
    "ITEM_TAX",
    "ITEM_TAX_RATE",
    "ITEM_TITLE"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("ITEM_BONUS")
    private String itemBonus;
    @JsonProperty("ITEM_BONUS_QTY")
    private String itemBonusQty;
    @JsonProperty("ITEM_BOOKTRUST")
    private String itemBooktrust;
    @JsonProperty("ITEM_FLYER")
    private String itemFlyer;
    @JsonProperty("ITEM_ID")
    private String itemId;
    @JsonProperty("ITEM_NLA")
    private String itemNla;
    @JsonProperty("ITEM_OOS")
    private String itemOos;
    @JsonProperty("ITEM_PRICE")
    private Double itemPrice;
    @JsonProperty("ITEM_QTY")
    private Integer itemQty;
    @JsonProperty("ITEM_TAX")
    private Double itemTax;
    @JsonProperty("ITEM_TAX_RATE")
    private Double itemTaxRate;
    @JsonProperty("ITEM_TITLE")
    private String itemTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ITEM_BONUS")
    public String getItemBonus() {
        return itemBonus;
    }

    @JsonProperty("ITEM_BONUS")
    public void setItemBonus(String itemBonus) {
        this.itemBonus = itemBonus;
    }

    @JsonProperty("ITEM_BONUS_QTY")
    public String getItemBonusQty() {
        return itemBonusQty;
    }

    @JsonProperty("ITEM_BONUS_QTY")
    public void setItemBonusQty(String itemBonusQty) {
        this.itemBonusQty = itemBonusQty;
    }

    @JsonProperty("ITEM_BOOKTRUST")
    public String getItemBooktrust() {
        return itemBooktrust;
    }

    @JsonProperty("ITEM_BOOKTRUST")
    public void setItemBooktrust(String itemBooktrust) {
        this.itemBooktrust = itemBooktrust;
    }

    @JsonProperty("ITEM_FLYER")
    public String getItemFlyer() {
        return itemFlyer;
    }

    @JsonProperty("ITEM_FLYER")
    public void setItemFlyer(String itemFlyer) {
        this.itemFlyer = itemFlyer;
    }

    @JsonProperty("ITEM_ID")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ITEM_ID")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("ITEM_NLA")
    public String getItemNla() {
        return itemNla;
    }

    @JsonProperty("ITEM_NLA")
    public void setItemNla(String itemNla) {
        this.itemNla = itemNla;
    }

    @JsonProperty("ITEM_OOS")
    public String getItemOos() {
        return itemOos;
    }

    @JsonProperty("ITEM_OOS")
    public void setItemOos(String itemOos) {
        this.itemOos = itemOos;
    }

    @JsonProperty("ITEM_PRICE")
    public Double getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("ITEM_PRICE")
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("ITEM_QTY")
    public Integer getItemQty() {
        return itemQty;
    }

    @JsonProperty("ITEM_QTY")
    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    @JsonProperty("ITEM_TAX")
    public Double getItemTax() {
        return itemTax;
    }

    @JsonProperty("ITEM_TAX")
    public void setItemTax(Double itemTax) {
        this.itemTax = itemTax;
    }

    @JsonProperty("ITEM_TAX_RATE")
    public Double getItemTaxRate() {
        return itemTaxRate;
    }

    @JsonProperty("ITEM_TAX_RATE")
    public void setItemTaxRate(Double itemTaxRate) {
        this.itemTaxRate = itemTaxRate;
    }

    @JsonProperty("ITEM_TITLE")
    public String getItemTitle() {
        return itemTitle;
    }

    @JsonProperty("ITEM_TITLE")
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
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
