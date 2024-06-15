import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {

    @Test
    public void arraysShouldBeEqual() {
        String[] arrayOne = new String[] {"hlo", "world" };
        String[] arrayTwo = new String[] {"hello", "world" };

        System.out.println("Равенство массивов: " + Arrays.equals(arrayOne, arrayTwo));

        assertArrayEquals(arrayTwo, arrayOne, "Массивы не равны!");
    }
}