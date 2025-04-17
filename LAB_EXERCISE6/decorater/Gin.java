class Gin extends Decorater{
    Gin(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+" with Gin";
    }
    int getPrice(){
        return offering.getPrice()+85;
    }
}