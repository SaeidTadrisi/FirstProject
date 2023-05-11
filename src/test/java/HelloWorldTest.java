import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloWorldTest {
    @Test
    void Should_Print_Message() {

        HelloWorld helloWorld = new HelloWorld();

        String message = helloWorld.printMessage();

        assertThat(message).isEqualTo("Hello World!");
    }
}
