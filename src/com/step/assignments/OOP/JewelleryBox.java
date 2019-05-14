package com.step.assignments.OOP;

public class JewelleryBox {
  private JewelleryBox jewelleryBox;
  private Jewellery jewellery;
  private int noOfJwellery;

  public JewelleryBox(JewelleryBox jewelleryBox, Jewellery jewellery, int noOfJwellery) {
    this.jewelleryBox = jewelleryBox;
    this.jewellery = jewellery;
    this.noOfJwellery = noOfJwellery;
  }

  public JewelleryBox(Jewellery jewellery) {
    this(1);
    this.jewellery = jewellery;
    this.noOfJwellery = 1;
  }

  public JewelleryBox(int noOfJwellery){
    this.jewellery = null;
    this.jewelleryBox = null;
    this.noOfJwellery = noOfJwellery;
  }

  public int getJwellerCount(){
    if(this.jewelleryBox == null) return this.noOfJwellery;
    return this.jewelleryBox.getJwellerCount() + this.noOfJwellery;
  }
}
