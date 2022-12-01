package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int takeawayPrice;

    private boolean isCheeseAdded;
    private boolean isTopingsAdded;
    private boolean isTakeawayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded=false;
        this.isTopingsAdded=false;
        this.isTakeawayAdded=false;

        this.extraCheesePrice=80;
        this.takeawayPrice=20;

        if(isVeg){
            this.extraToppingsPrice=70;
            this.price=300;
        }else{
            this.price=400;
            this.extraToppingsPrice=120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price+=this.extraCheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopingsAdded){
            this.price+=this.extraToppingsPrice;
            isTopingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){
            this.price+=this.takeawayPrice;
            isTakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isBillGenerated==false) {

                isBillGenerated = true;

                if (isCheeseAdded) {
                    this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
                }
                if (isTopingsAdded) {
                    this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
                }
                if (isTakeawayAdded) {
                    this.bill = this.bill + "Paperbag Added: " + this.takeawayPrice + "\n";
                }
                this.bill = this.bill + "Total Price: "+this.price + "\n";
            }
        }
        return this.bill;
    }
}
