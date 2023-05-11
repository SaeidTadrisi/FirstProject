import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void Should_Print_Message() {

        HelloWorld helloWorld = new HelloWorld();

        String message = helloWorld.printMessage();

        Assertions.assertThat(message).isEqualTo("Hello World!");
    }
}
