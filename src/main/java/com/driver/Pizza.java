package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraTopping;
    private int extraCheese;
    private int bagPrice;
    private String cheeseToppingBill = "";
    private String takeawayBill = "";

    private boolean isCheeseCalled;
    private boolean isToppingsCalled;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseCalled = false;
        this.isToppingsCalled = false;

        this.extraCheese = 80;
        this.bagPrice = 20;

        if(isVeg)
        {
            this.price = 300;
            this.extraTopping = 70;
        } else {
            this.price = 400;
            this.extraTopping = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseCalled)
        {
            this.isCheeseCalled = true;
            this.price += this.extraCheese;
            this.bill += "Extra Cheese Added: " + this.extraCheese + "\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsCalled)
        {
            this.isToppingsCalled = true;
            this.price += this.extraTopping;
            this.bill += "Extra Toppings Added: "+ extraTopping +"\n";
        }


    }

    public void addTakeaway(){
        this.price+=20;
        this.bill += "Paperbag Added: "+ this.bagPrice + "\n";
    }

    public String getBill(){
        // your code goes here

        this.bill += "Total Price: "+this.price+"\n";

        return this.bill;
    }
}
