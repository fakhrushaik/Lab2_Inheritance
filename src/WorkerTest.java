import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay_Under40Hours() {
        Worker worker = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        double pay = worker.calculateWeeklyPay(35);
        assertEquals(700, pay, 0.01);
    }

    @Test
    public void testCalculateWeeklyPay_Over40Hours() {
        Worker worker = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        double pay = worker.calculateWeeklyPay(45);
        assertEquals(950, pay, 0.01);
    }

    @Test
    public void testToCSV() {
        Worker worker = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        String csv = worker.toCSV();
        assertEquals("John,Doe,W01,Mr.,1985,20.0", csv);
    }

    @Test
    public void testToXML() {
        Worker worker = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        String xml = worker.toXML();
        assertTrue(xml.contains("<HourlyPayRate>20.0</HourlyPayRate>"));
    }

    @Test
    public void testToJSON() {
        Worker worker = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        String json = worker.toJSON();
        assertTrue(json.contains("\"hourlyPayRate\": 20.0"));
    }
}
