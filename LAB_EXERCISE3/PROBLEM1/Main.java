public class Main {
    public static void main(String[] args) {
        
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();
        Bharatvanshi kaurav = new Kaurav();
        
        
        System.out.println(arjun.getClass().getSimpleName() + " - Kind: " + arjun.isKind());
        arjun.fight();
        arjun.obey();
        
        
        System.out.println(bheem.getClass().getSimpleName() + " - Kind: " + bheem.isKind());
        bheem.fight();
        bheem.obey();
        
        
        System.out.println(vikarn.getClass().getSimpleName() + " - Kind: " + vikarn.isKind());
        vikarn.fight();
        vikarn.obey();
        
        
        System.out.println(kaurav.getClass().getSimpleName() + " - Kind: " + kaurav.isKind());
        kaurav.fight();
        kaurav.obey();
    }
}
