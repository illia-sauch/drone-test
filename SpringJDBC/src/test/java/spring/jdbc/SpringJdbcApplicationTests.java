package spring.jdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJdbcApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		assertEquals(2, 1 + 1, "1 + 1 should equal 2");
	}
}
