package cn.vip.pojo;

import java.util.Date;

public class GoodsPack {
    private Long id;

    private String goodsPackName;

    private String goodsPackCode;

    private Integer typeId;

    private String typeName;

    private Double totalPrice;

    private Integer state;

    private Integer num;

    private String createdBy;

    private Date createTime;

    private Date lastUpdateTime;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsPackName() {
        return goodsPackName;
    }

    public void setGoodsPackName(String goodsPackName) {
        this.goodsPackName = goodsPackName == null ? null : goodsPackName.trim();
    }

    public String getGoodsPackCode() {
        return goodsPackCode;
    }

    public void setGoodsPackCode(String goodsPackCode) {
        this.goodsPackCode = goodsPackCode == null ? null : goodsPackCode.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}