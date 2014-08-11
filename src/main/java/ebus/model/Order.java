package ebus.model;

import java.util.Date;

public class Order {
    private Integer id;

    private String addr;

    private Date createdate;

    private Date updatedate;

    private Integer userId;

    private Long graphid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getGraphid() {
        return graphid;
    }

    public void setGraphid(Long graphid) {
        this.graphid = graphid;
    }
}