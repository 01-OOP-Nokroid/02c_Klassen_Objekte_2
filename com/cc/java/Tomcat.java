package com.cc.java;

public class Tomcat
{

  private String name;
  private String furColor;
  private int age; 



  public Tomcat(String name, String furColor, int age)
  {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
  }

  public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

  public String getAge()
  {
    return String.valueOf(age);
  }

}
  
