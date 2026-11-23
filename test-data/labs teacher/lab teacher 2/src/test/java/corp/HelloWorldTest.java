package corp;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void test() {

        var helloWorld = new HelloWorld();
        assertThat("Hello world").isEqualTo(helloWorld.getString());
    }
}
