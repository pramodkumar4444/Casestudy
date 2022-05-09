package io.springboot.coupons;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Document(collection="COUPONS")
public class COUPONS {
	@Id
	private int id;
	@Field
	private String name;
	@Field
	private String Discription;
	@Field
	private String expiry;
	@Override
	public String toString() {
		return String.format("COUPONS[id='%s',name='%s',Discription='%s',expiry='%s']",id,name,Discription,expiry);
	}
	public COUPONS(int id, String name, String discription, String expiry) {
		super();
		this.id = id;
		this.name = name;
		Discription = discription;
		this.expiry = expiry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public COUPONS() {
			}

}
