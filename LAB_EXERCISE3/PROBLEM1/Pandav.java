class Pandav extends Bharatvanshi {
    
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " fights courageously!");
    }
    
    @Override
    public boolean isKind() {
        return true;
    }
}
