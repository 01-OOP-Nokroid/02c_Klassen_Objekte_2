package com.cc.java;

public class Cat
{

  private String name;
  private String furColor;
  private int age; 
  private int counter;

    // rechtsklick>Quellaktion>Generate Constructors
  public Cat(String name, String furColor, int age) {
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
    return checkCompliance();
  }

  private String checkCompliance()
  {
    counter++; // Zählt automatisch hoch bei der selben anfrage

    switch (counter)
    {
      case 1: 
        return "This is an inappropriate question!";
      case 2:
        return "What did I say?";
      case 3:
        return "Stop it!!";
      default:
        return "1#!?&&%";
    }
    
  }

}
  
