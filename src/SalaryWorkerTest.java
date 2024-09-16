import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Sarah", "Lee", "S01", "Mrs.", 1982, 52000.0);
        double weeklyPay = salaryWorker.calculateWeeklyPay(40);
        assertEquals(1000, weeklyPay, 0.01);
    }

    @Test
    public void testToCSV() {
        SalaryWorker salaryWorker = new SalaryWorker("Sarah", "Lee", "S01", "Mrs.", 1982, 52000.0);
        String csv = salaryWorker.toCSV();
        assertEquals("Sarah,Lee,S01,Mrs.,1982,0.0,52000.0", csv);
    }

    @Test
    public void testToXML() {
        SalaryWorker salaryWorker = new SalaryWorker("Sarah", "Lee", "S01", "Mrs.", 1982, 52000.0);
        String xml = salaryWorker.toXML();
        assertTrue(xml.contains("<AnnualSalary>52000.0</AnnualSalary>"));
    }

    @Test
    public void testToJSON() {
        SalaryWorker salaryWorker = new SalaryWorker("Sarah", "Lee", "S01", "Mrs.", 1982, 52000.0);
        String json = salaryWorker.toJSON();
        assertTrue(json.contains("\"annualSalary\": 52000.0"));
    }
}
