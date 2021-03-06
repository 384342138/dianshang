package org.lanqiao.entity;

import java.util.List;
import java.util.Set;

public class ProDetail {
    private Integer pdetailId;

    private Product product;

    private Integer dtlProId;

    private Double proPrice;

    private Integer stock;

    private List<StandardsVal> standardsVal;


    public Integer getPdetailId() {
        return pdetailId;
    }

    public void setPdetailId(Integer pdetailId) {
        this.pdetailId = pdetailId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<StandardsVal> getStandardsVal() {
        return standardsVal;
    }

    public void setStandardsVal(List<StandardsVal> standardsVal) {
        this.standardsVal = standardsVal;
    }

    public Integer getDtlProId() {
        return dtlProId;
    }

    public void setDtlProId(Integer dtlProId) {
        this.dtlProId = dtlProId;
    }

    @Override
    public String toString() {
        return "ProDetail{" +
                "pdetailId=" + pdetailId +
                ", product=" + product +
                ", proPrice=" + proPrice +
                ", stock=" + stock +
                ", standardsVal=" + standardsVal +
                '}';
    }
}