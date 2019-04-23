import com.lisihocke.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void shouldReturnOne() {
        Assertions.assertEquals(1, FizzBuzz.returnOne());
    }
}
