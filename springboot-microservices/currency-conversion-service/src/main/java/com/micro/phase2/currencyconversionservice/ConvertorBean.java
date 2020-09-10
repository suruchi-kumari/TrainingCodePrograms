package com.micro.phase2.currencyconversionservice;


public class ConvertorBean {
	
	private int id;
	private String from;
	private String to;
	private int conversionMultiple;
	private long quantity;
	private long calculatedValue;
	private int port;
	
	
	public ConvertorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConvertorBean(int id, String from, String to, int conversionMultiple, long quantity, long calculatedValue,int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.calculatedValue = calculatedValue;
		this.port = port;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getCalculatedValue() {
		return calculatedValue;
	}
	public void setCalculatedValue(long calculatedValue) {
		this.calculatedValue = calculatedValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
