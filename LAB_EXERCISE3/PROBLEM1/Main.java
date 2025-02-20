
public class Main {
    public static void main(String[] args) {

        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();
        

        System.out.println("Arjun:");
        arjun.fight();
        ((Pandav) arjun).kind(); 
        
        System.out.println("\nBheem:");
        bheem.fight();
        ((Pandav) bheem).kind();
        
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        ((Kaurav) duryodhan).cruelty();  
        
        System.out.println("\nVikarn:");
        vikarn.fight();
        ((Kaurav) vikarn).cruelty();
        vikarn.obey();
    }
}
