package src.main.java.com.clean_architecture_utils;

import com.clean_architecture_utils.Main;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    Main main = new Main();

    @Test
    public void tryToStartMain() {
        System.out.println(main.hashCode());
    }
}
