package com.javatechie.couchbase.api.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Customer {
	@Id
	private int id;
	@Field
	private String name;
	@Field
	private String[] address;

	public Customer(){}
	public Customer(int a, String b, String[] c){
		id = a;
		name = b;
		address = c;
	}
}
