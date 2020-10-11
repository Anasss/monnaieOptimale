import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonnaieTest {

  @Test
  public void shouldReturnNull() {
    Assertions.assertNull(Monnaie.monnaieOptimale(1));
  }

  @Test
  public void testMonnaieOptimalOf6() {
    Monnaie a = new Monnaie(3, 0, 0);
    Assertions.assertEquals(a, Monnaie.monnaieOptimale(6));
  }

  @Test
  public void testMonnaieOptimalOf8() {
    Monnaie a = new Monnaie(4, 0, 0);
    Assertions.assertEquals(a, Monnaie.monnaieOptimale(8));
  }

  @Test
  public void testMonnaieOptimalOf10() {
    Monnaie a = new Monnaie(0, 0, 1);
    Assertions.assertEquals(a, Monnaie.monnaieOptimale(10));
  }

  @Test
  public void testMonnaieOptimalOf27() {
    Monnaie a = new Monnaie(1, 1, 2);
    Assertions.assertEquals(a, Monnaie.monnaieOptimale(27));
  }

  @Test
  public void testMonnaieBigChange() {
    Monnaie a = new Monnaie(1, 1, 922337203685477580L);
    Assertions.assertEquals(a, Monnaie.monnaieOptimale(9223372036854775807L));
  }

}