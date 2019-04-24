import com.lisihocke.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void oneShouldReturnOne() {
        Assertions.assertEquals("1", FizzBuzz.returnValue(1));
    }

    @Test
    void twoShouldReturnTwo() {
        Assertions.assertEquals("2", FizzBuzz.returnValue(2));
    }

    @Test
    void threeShouldReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.returnValue(3));
    }

    @Test
    void fourShouldReturnFour() {
        Assertions.assertEquals("4", FizzBuzz.returnValue(4));
    }

    @Test
    void fiveShouldReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.returnValue(5));
    }

    @Test
    void sixShouldReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.returnValue(6));
    }
}
