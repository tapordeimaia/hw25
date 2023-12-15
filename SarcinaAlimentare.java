public class SarcinaAlimentare implements Runnable{
    private Animal animal;
    public SarcinaAlimentare(Animal animal){
        this.animal = animal;
    }
    public void run(){
        System.out.println("Animalul " + animal.getNume() + " a fost alimentat");
    }
}
