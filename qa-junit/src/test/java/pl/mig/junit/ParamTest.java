package pl.mig.junit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("ParamTest")
public class ParamTest {

    // https://junit.org/junit5/docs/current/user-guide/
//    @Nested
//    @DisplayName("NESTED ....... ")
//    class NestedClass{

        @ParameterizedTest
        @DisplayName("ParamTest1")
        @ValueSource(ints = {5,15,25})
        public void paramTest1(int number){
            assertTrue( number % 5 == 0);

        }
//    }

    @ParameterizedTest
    @DisplayName("ParamTest2")
    @CsvSource(delimiter = ',', value = {"Hello , 5 " , "Hello , 10 " , "'Hello2 , DDDDD' , 15 " }) //'Ciapki ' ' odpowiadają za scalenie stringu z przecinkami wewnacz textu
    public void paramTest2(String param1,int param2){
        assertTrue( param1.contains("Hello"));
        assertTrue( param2 % 5 == 0);
    }


    @ParameterizedTest
    @DisplayName("ParamTest3")
    @CsvFileSource(delimiter = ',',resources = "/test.csv") //'Ciapki ' ' odpowiadają za scalenie stringu z przecinkami wewnacz textu
    public void paramTest3(String param1,int param2){
        assertTrue( param1.contains("Hello"));
        assertTrue( param2 % 5 == 0);
    }

    @Test
    public void testFunkcjizMain(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    GamePlay.play(0);
                }
        );

    }


}
