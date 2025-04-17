class Rum extends Decorater{
    Rum(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+" with Rum";
    }
    int getPrice(){
        return offering.getPrice()+55;
    }
}