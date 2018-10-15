package pl.mig.junit;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.hamcrest.*;

@DisplayName("To jest nasza klasa testowa")
public class JunitTest {

    String testString ;

    @BeforeAll
    static void beforeAll(){
        System.out.println("---------------------------------before ALL TEST " );

    }

    @BeforeEach
    void before(){
        System.out.println("---------------------------------before TEST " );
        testString = "TestowyString";
    }

    @AfterEach
    void after(){
        System.out.println("---------------------------------after TEST " );
    }

    @Test
    @DisplayName("Klasa testowa firstTest() ")
    public void firstTest(){
        System.out.println( 0.2 * 0.2 );
        assertTrue( new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
    }


    @DisplayName("Klasa testowa testString() ")
    @Test
    public void testString(){
        //assertEquals("TestowyString",testString);

        //assertThat();

    }


    @DisplayName("Klasa testowa testString2() ")
    @Test
    public void testString2(){
      //  assertAll(() -> [] );

    }
}
