package com.denizturkmen.Entity;

import java.sql.Blob;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Table")
public class Customer {
	
	
	@Id
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Customer_Name",length = 100,nullable = false)
	private String Name;
	
	//UUID 8-4-4-4 türünde hexadecimal sayilardır
	//128 bit yani 16 byte lik değerdir
	@Basic(fetch = FetchType.LAZY)
	private UUID accountsPayableXrefId;
	
	@Lob
	@Column(name = "Customer_pic")
	private Blob Image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public UUID getAccountsPayableXrefId() {
		return accountsPayableXrefId;
	}

	public void setAccountsPayableXrefId(UUID accountsPayableXrefId) {
		this.accountsPayableXrefId = accountsPayableXrefId;
	}

	public Blob getImage() {
		return Image;
	}

	public void setImage(Blob image) {
		Image = image;
	}
	
	

}
