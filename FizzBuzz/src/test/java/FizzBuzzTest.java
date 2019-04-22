import static org.junit.Assert.*;

import com.lnx.kata.FizzBuzz;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_say_one_when_number_is_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1",fizzBuzz.Say(1));

    }
}
