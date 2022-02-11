
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
    "EVENT_DATE",
    "EVENT_NUMBER",
    "EVENT_STATUS",
    "SHIP_TO_HOME_FLAG",
    "TEACHER_ORDER_REF",
    "STORE_LABEL",
    "MAX_COUPON_DETAILS",
    "MAX_REWARD_DETAILS",
    "MAX_STUDENT_FLYER_ITEMS",
    "MAX_STUDENT_ONLINE_ITEMS",
    "NUMBER_OF_COUPONS",
    "NUMBER_OF_ITEMS",
    "NUMBER_OF_REWARDS",
    "NUMBER_OF_STUDENTS_ONLINE",
    "NUMBER_OF_STUDENT_FLYERS",
    "OPERATOR_ID",
    "ORDER_SUMMARY",
    "PAYMENT_METHOD",
    "SHIP_TO",
    "STUDENT_FLYER_ORDER",
    "STUDENT_ONLINE_ORDER",
    "STUDENT_ONLINE_ORDER_PSH",
    "TEACHER_ORDER",
    "BILL_TO",
    "CHILDREN",
    "COUPON",
    "REWARD"
})
@Generated("jsonschema2pojo")
public class Order {

    @JsonProperty("EVENT_DATE")
    private String eventDate;
    @JsonProperty("EVENT_NUMBER")
    private String eventNumber;
    @JsonProperty("EVENT_STATUS")
    private String eventStatus;
    @JsonProperty("SHIP_TO_HOME_FLAG")
    private String shipToHomeFlag;
    @JsonProperty("TEACHER_ORDER_REF")
    private String teacherOrderRef;
    @JsonProperty("STORE_LABEL")
    private String storeLabel;
    @JsonProperty("MAX_COUPON_DETAILS")
    private String maxCouponDetails;
    @JsonProperty("MAX_REWARD_DETAILS")
    private String maxRewardDetails;
    @JsonProperty("MAX_STUDENT_FLYER_ITEMS")
    private String maxStudentFlyerItems;
    @JsonProperty("MAX_STUDENT_ONLINE_ITEMS")
    private Integer maxStudentOnlineItems;
    @JsonProperty("NUMBER_OF_COUPONS")
    private Integer numberOfCoupons;
    @JsonProperty("NUMBER_OF_ITEMS")
    private Integer numberOfItems;
    @JsonProperty("NUMBER_OF_REWARDS")
    private Integer numberOfRewards;
    @JsonProperty("NUMBER_OF_STUDENTS_ONLINE")
    private Integer numberOfStudentsOnline;
    @JsonProperty("NUMBER_OF_STUDENT_FLYERS")
    private String numberOfStudentFlyers;
    @JsonProperty("OPERATOR_ID")
    private String operatorId;
    @JsonProperty("ORDER_SUMMARY")
    private OrderSummary orderSummary;
    @JsonProperty("PAYMENT_METHOD")
    private PaymentMethod paymentMethod;
    @JsonProperty("SHIP_TO")
    private ShipTo shipTo;
    @JsonProperty("STUDENT_FLYER_ORDER")
    private StudentFlyerOrder studentFlyerOrder;
    @JsonProperty("STUDENT_ONLINE_ORDER")
    private StudentOnlineOrder studentOnlineOrder;
    @JsonProperty("STUDENT_ONLINE_ORDER_PSH")
    private String studentOnlineOrderPsh;
    @JsonProperty("TEACHER_ORDER")
    private TeacherOrder teacherOrder;
    @JsonProperty("BILL_TO")
    private String billTo;
    @JsonProperty("CHILDREN")
    private String children;
    @JsonProperty("COUPON")
    private List<Object> coupon = null;
    @JsonProperty("REWARD")
    private List<Object> reward = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EVENT_DATE")
    public String getEventDate() {
        return eventDate;
    }

    @JsonProperty("EVENT_DATE")
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @JsonProperty("EVENT_NUMBER")
    public String getEventNumber() {
        return eventNumber;
    }

    @JsonProperty("EVENT_NUMBER")
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    @JsonProperty("EVENT_STATUS")
    public String getEventStatus() {
        return eventStatus;
    }

    @JsonProperty("EVENT_STATUS")
    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    @JsonProperty("SHIP_TO_HOME_FLAG")
    public String getShipToHomeFlag() {
        return shipToHomeFlag;
    }

    @JsonProperty("SHIP_TO_HOME_FLAG")
    public void setShipToHomeFlag(String shipToHomeFlag) {
        this.shipToHomeFlag = shipToHomeFlag;
    }

    @JsonProperty("TEACHER_ORDER_REF")
    public String getTeacherOrderRef() {
        return teacherOrderRef;
    }

    @JsonProperty("TEACHER_ORDER_REF")
    public void setTeacherOrderRef(String teacherOrderRef) {
        this.teacherOrderRef = teacherOrderRef;
    }

    @JsonProperty("STORE_LABEL")
    public String getStoreLabel() {
        return storeLabel;
    }

    @JsonProperty("STORE_LABEL")
    public void setStoreLabel(String storeLabel) {
        this.storeLabel = storeLabel;
    }

    @JsonProperty("MAX_COUPON_DETAILS")
    public String getMaxCouponDetails() {
        return maxCouponDetails;
    }

    @JsonProperty("MAX_COUPON_DETAILS")
    public void setMaxCouponDetails(String maxCouponDetails) {
        this.maxCouponDetails = maxCouponDetails;
    }

    @JsonProperty("MAX_REWARD_DETAILS")
    public String getMaxRewardDetails() {
        return maxRewardDetails;
    }

    @JsonProperty("MAX_REWARD_DETAILS")
    public void setMaxRewardDetails(String maxRewardDetails) {
        this.maxRewardDetails = maxRewardDetails;
    }

    @JsonProperty("MAX_STUDENT_FLYER_ITEMS")
    public String getMaxStudentFlyerItems() {
        return maxStudentFlyerItems;
    }

    @JsonProperty("MAX_STUDENT_FLYER_ITEMS")
    public void setMaxStudentFlyerItems(String maxStudentFlyerItems) {
        this.maxStudentFlyerItems = maxStudentFlyerItems;
    }

    @JsonProperty("MAX_STUDENT_ONLINE_ITEMS")
    public Integer getMaxStudentOnlineItems() {
        return maxStudentOnlineItems;
    }

    @JsonProperty("MAX_STUDENT_ONLINE_ITEMS")
    public void setMaxStudentOnlineItems(Integer maxStudentOnlineItems) {
        this.maxStudentOnlineItems = maxStudentOnlineItems;
    }

    @JsonProperty("NUMBER_OF_COUPONS")
    public Integer getNumberOfCoupons() {
        return numberOfCoupons;
    }

    @JsonProperty("NUMBER_OF_COUPONS")
    public void setNumberOfCoupons(Integer numberOfCoupons) {
        this.numberOfCoupons = numberOfCoupons;
    }

    @JsonProperty("NUMBER_OF_ITEMS")
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    @JsonProperty("NUMBER_OF_ITEMS")
    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @JsonProperty("NUMBER_OF_REWARDS")
    public Integer getNumberOfRewards() {
        return numberOfRewards;
    }

    @JsonProperty("NUMBER_OF_REWARDS")
    public void setNumberOfRewards(Integer numberOfRewards) {
        this.numberOfRewards = numberOfRewards;
    }

    @JsonProperty("NUMBER_OF_STUDENTS_ONLINE")
    public Integer getNumberOfStudentsOnline() {
        return numberOfStudentsOnline;
    }

    @JsonProperty("NUMBER_OF_STUDENTS_ONLINE")
    public void setNumberOfStudentsOnline(Integer numberOfStudentsOnline) {
        this.numberOfStudentsOnline = numberOfStudentsOnline;
    }

    @JsonProperty("NUMBER_OF_STUDENT_FLYERS")
    public String getNumberOfStudentFlyers() {
        return numberOfStudentFlyers;
    }

    @JsonProperty("NUMBER_OF_STUDENT_FLYERS")
    public void setNumberOfStudentFlyers(String numberOfStudentFlyers) {
        this.numberOfStudentFlyers = numberOfStudentFlyers;
    }

    @JsonProperty("OPERATOR_ID")
    public String getOperatorId() {
        return operatorId;
    }

    @JsonProperty("OPERATOR_ID")
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @JsonProperty("ORDER_SUMMARY")
    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    @JsonProperty("ORDER_SUMMARY")
    public void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }

    @JsonProperty("PAYMENT_METHOD")
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("PAYMENT_METHOD")
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("SHIP_TO")
    public ShipTo getShipTo() {
        return shipTo;
    }

    @JsonProperty("SHIP_TO")
    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    @JsonProperty("STUDENT_FLYER_ORDER")
    public StudentFlyerOrder getStudentFlyerOrder() {
        return studentFlyerOrder;
    }

    @JsonProperty("STUDENT_FLYER_ORDER")
    public void setStudentFlyerOrder(StudentFlyerOrder studentFlyerOrder) {
        this.studentFlyerOrder = studentFlyerOrder;
    }

    @JsonProperty("STUDENT_ONLINE_ORDER")
    public StudentOnlineOrder getStudentOnlineOrder() {
        return studentOnlineOrder;
    }

    @JsonProperty("STUDENT_ONLINE_ORDER")
    public void setStudentOnlineOrder(StudentOnlineOrder studentOnlineOrder) {
        this.studentOnlineOrder = studentOnlineOrder;
    }

    @JsonProperty("STUDENT_ONLINE_ORDER_PSH")
    public String getStudentOnlineOrderPsh() {
        return studentOnlineOrderPsh;
    }

    @JsonProperty("STUDENT_ONLINE_ORDER_PSH")
    public void setStudentOnlineOrderPsh(String studentOnlineOrderPsh) {
        this.studentOnlineOrderPsh = studentOnlineOrderPsh;
    }

    @JsonProperty("TEACHER_ORDER")
    public TeacherOrder getTeacherOrder() {
        return teacherOrder;
    }

    @JsonProperty("TEACHER_ORDER")
    public void setTeacherOrder(TeacherOrder teacherOrder) {
        this.teacherOrder = teacherOrder;
    }

    @JsonProperty("BILL_TO")
    public String getBillTo() {
        return billTo;
    }

    @JsonProperty("BILL_TO")
    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    @JsonProperty("CHILDREN")
    public String getChildren() {
        return children;
    }

    @JsonProperty("CHILDREN")
    public void setChildren(String children) {
        this.children = children;
    }

    @JsonProperty("COUPON")
    public List<Object> getCoupon() {
        return coupon;
    }

    @JsonProperty("COUPON")
    public void setCoupon(List<Object> coupon) {
        this.coupon = coupon;
    }

    @JsonProperty("REWARD")
    public List<Object> getReward() {
        return reward;
    }

    @JsonProperty("REWARD")
    public void setReward(List<Object> reward) {
        this.reward = reward;
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
