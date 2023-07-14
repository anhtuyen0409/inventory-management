package com.nguyenanhtuyen.model;
// Generated Jul 14, 2023, 6:04:12 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * ProductInStock generated by hbm2java
 */
public class ProductInStock implements java.io.Serializable {

	private Integer id;
	private ProductInfo productInfo;
	private int qty;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;

	public ProductInStock() {
	}

	public ProductInStock(ProductInfo productInfo, int qty, int activeFlag, Date createDate, Date updateDate) {
		this.productInfo = productInfo;
		this.qty = qty;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}