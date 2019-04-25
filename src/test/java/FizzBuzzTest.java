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
    void fiveShouldReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.returnValue(5));
    }

    @Test
    void fifteenShouldReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.returnValue(15));
    }

    @Test
    void zeroShouldBeOutOfRange() {
        Assertions.assertEquals("The number 0 is out of range, please provide a number between 1 and 100 (both inclusive).", FizzBuzz.returnValue(0));
    }

    @Test
    void hundredAndOneShouldBeOutOfRange() {
        Assertions.assertEquals("The number 101 is out of range, please provide a number between 1 and 100 (both inclusive).", FizzBuzz.returnValue(101));
    }
}
