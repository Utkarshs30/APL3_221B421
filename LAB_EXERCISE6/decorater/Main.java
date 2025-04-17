class Main
{
    public static void main(String args[]){
        Offering offering = new Coffee(); // Base is coffee
        offering = new Rum(offering); // Coffee with Rum
        offering = new Rum(offering);// Coffee with double Rum
        System.out.println(offering.getName() + " " + offering.getPrice());
        offering = new Icecream();// Base is Icecream
        offering = new Gin(offering); // with Gin
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}