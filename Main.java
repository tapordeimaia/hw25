import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Animal leu = new Animal("Leu");
        Animal tigru = new Animal("Tigru");
        Animal urs = new Animal("Urs");
        SarcinaAlimentare sarcinaLeu = new SarcinaAlimentare(leu);
        SarcinaAlimentare sarcinaTigru = new SarcinaAlimentare(tigru);
        SarcinaAlimentare sarcinaUrs = new SarcinaAlimentare(urs);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.scheduleAtFixedRate(sarcinaLeu, 0, 3, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(sarcinaTigru, 0, 3, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(sarcinaUrs, 0, 3, TimeUnit.MINUTES);
    }
}