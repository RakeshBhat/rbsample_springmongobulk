package com.rbsample.springmongobulk.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

/*MongoDB stores data in collections. Spring Data MongoDB will map the class Customer 
into a collection called customer. If you want to change the name of the collection, 
you can use Spring Data MongoDB’s @Document annotation on the class.
*/
@Document
public class Product {

	@Id
	long id;	
	@Indexed(background=true)
	String name;
	@Indexed()
	double price;
	int category;
	@TextIndexed(weight=1)
	String supplier;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s, category=%s, supplier=%s]", id, name, price, category,
				supplier);
	}
	
	
}
