package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int vegTopping = 70;
    private final int nonVegTopping = 120;
    private final int extraCheese = 80;
    private final int bagPrice = 20;
    private String cheeseToppingBill = "";
    private String takeawayBill = "";

    private boolean isCheeseCalled = false;
    private boolean isToppingsCalled = false;
    private boolean isBillCalled = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price = 300;
        }
        else {
            this.price = 400;
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
            this.price += extraCheese;
            cheeseToppingBill = "Extra Cheese Added: " + extraCheese + "\n" + cheeseToppingBill;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsCalled)
        {
            this.isToppingsCalled = true;
            if(this.isVeg)
            {
                this.price += vegTopping;
                cheeseToppingBill = cheeseToppingBill + "Extra Toppings Added: "+ vegTopping +"\n";
            }
            else {
                this.price += nonVegTopping;
                cheeseToppingBill = cheeseToppingBill + "Extra Toppings Added: "+ nonVegTopping +"\n";
            }
        }


    }

    public void addTakeaway(){
        this.price+=20;
        takeawayBill = "Paperbag Added: "+ bagPrice + "\n";
    }

    public String getBill(){
        // your code goes here

        this.bill += cheeseToppingBill;
        this.bill += takeawayBill;
        this.bill += "Total Price: "+this.price+"\n";

        return this.bill;
    }
}
