package ebus.model;

public class Cart {
    private Integer userId;

    private Integer productId;

    private Integer orderId;

    private Integer qty;

    private Float price;

    private Long graphid;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getGraphid() {
        return graphid;
    }

    public void setGraphid(Long graphid) {
        this.graphid = graphid;
    }
}