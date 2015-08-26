package com.jten2015.ebike.vo;

import org.springframework.web.multipart.MultipartFile;

public class ProductVo {
	
	private Long productNO;
	private Long producTypeNo;
	private String productCode;
	private String productName;
	private String productCompany;
	private String productNation;
	private Long productOption1No;
	private Long productOption2No;
	private Long productPrice;
	private String productInfo;
	private String productStatus;
	private String productIcon1;
	private String productIcon2;
	private String productIcon3;
	private Long productSale;
	private MultipartFile productImage1;
	private MultipartFile productImage2;
	private MultipartFile productImage3;
	
	public Long getProductNO() {
		return productNO;
	}
	public void setProductNO(Long productNO) {
		this.productNO = productNO;
	}
	public Long getProducTypeNo() {
		return producTypeNo;
	}
	public void setProducTypeNo(Long producTypeNo) {
		this.producTypeNo = producTypeNo;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public String getProductNation() {
		return productNation;
	}
	public void setProductNation(String productNation) {
		this.productNation = productNation;
	}
	public Long getProductOption1No() {
		return productOption1No;
	}
	public void setProductOption1No(Long productOption1No) {
		this.productOption1No = productOption1No;
	}
	public Long getProductOption2No() {
		return productOption2No;
	}
	public void setProductOption2No(Long productOption2No) {
		this.productOption2No = productOption2No;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductIcon1() {
		return productIcon1;
	}
	public void setProductIcon1(String productIcon1) {
		this.productIcon1 = productIcon1;
	}
	public String getProductIcon2() {
		return productIcon2;
	}
	public void setProductIcon2(String productIcon2) {
		this.productIcon2 = productIcon2;
	}
	public String getProductIcon3() {
		return productIcon3;
	}
	public void setProductIcon3(String productIcon3) {
		this.productIcon3 = productIcon3;
	}
	public Long getProductSale() {
		return productSale;
	}
	public void setProductSale(Long productSale) {
		this.productSale = productSale;
	}
	
	public MultipartFile getProductImage1() {
		return productImage1;
	}
	public void setProductImage1(MultipartFile productImage1) {
		this.productImage1 = productImage1;
	}
	public MultipartFile getProductImage2() {
		return productImage2;
	}
	public void setProductImage2(MultipartFile productImage2) {
		this.productImage2 = productImage2;
	}
	public MultipartFile getProductImage3() {
		return productImage3;
	}
	public void setProductImage3(MultipartFile productImage3) {
		this.productImage3 = productImage3;
	}
	@Override
	public String toString() {
		return "ProductVo [productNO=" + productNO + ", producTypeNo="
				+ producTypeNo + ", productCode=" + productCode
				+ ", productName=" + productName + ", productCompany="
				+ productCompany + ", productNation=" + productNation
				+ ", productOption1No=" + productOption1No
				+ ", productOption2No=" + productOption2No + ", productPrice="
				+ productPrice + ", productInfo=" + productInfo
				+ ", productStatus=" + productStatus + ", productIcon1="
				+ productIcon1 + ", productIcon2=" + productIcon2
				+ ", productIcon3=" + productIcon3 + ", productSale="
				+ productSale + ", productImage1=" + productImage1
				+ ", productImage2=" + productImage2 + ", productImage3="
				+ productImage3 + "]";
	}
	
}
