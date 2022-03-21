package com.example.product.model;

public class Product {
  
  //#region Attributes
  private Integer id;

  private String name;

  private String email;

  private String number;
//#endregion

//#region Getters Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
  //#endregion
  
}
