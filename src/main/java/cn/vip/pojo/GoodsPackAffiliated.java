package cn.vip.pojo;

public class GoodsPackAffiliated {
    private Long id;

    private Long goodsPackId;

    private Long goodsInfoId;

    private Integer goodsNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsPackId() {
        return goodsPackId;
    }

    public void setGoodsPackId(Long goodsPackId) {
        this.goodsPackId = goodsPackId;
    }

    public Long getGoodsInfoId() {
        return goodsInfoId;
    }

    public void setGoodsInfoId(Long goodsInfoId) {
        this.goodsInfoId = goodsInfoId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}