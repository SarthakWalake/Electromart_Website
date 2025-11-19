package com.electromart.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking{
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private String date;
    private String productName;
    private String paymentMethod;
    private String paymentStatus;

    public Booking()
    {

    }

    public Booking(String id,String name,String email,String address,String date,String productName,String paymentMethod,String paymentStatus)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.date = date;
        this.productName = productName;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}