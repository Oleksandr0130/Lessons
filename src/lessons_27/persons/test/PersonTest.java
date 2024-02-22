package lessons_27.persons.test;

import lessons_27.persons.EnumTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @BeforeEach
    public void setup(){
        System.out.println("Метод BeforEach");
    }


    //@BeforeAll - метод запускается один раз перед выполнением первого теста
    //@AfterEach - выполняется после каждого тестового метода
    //@AfterAll - выполняется один раз после всех тестовых методов
    //@Disable - указывает, что тест или группа тестов отключен и выполняться не будет
    //@Nested - позволяет создавать вложенный тестовый класс

    @Test // Указывает что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);// проверяет равны ли два значения
        Assertions.assertNotEquals(5, result);// тест будет пройден если неожидаемый результат не совпадет с фактическим
        assertTrue(4 == result); // проверяет что условие верно
        assertFalse(5 == result);// проверяет что условия ложно
        assertNull(null);// проверяет что объект равен null
        assertNotNull("String");// Проверяет что объект не равен null
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple","banana","cherry"})
    public void testFruits(String fruit){
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testints(int value){
        System.out.println("current value" + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)
    void testEnums(EnumTest value){
        assertNotNull(value);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitsMethodSource(String argument){
        System.out.println("current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);

    }
    static Stream<String> stringProvider(){
        return Stream.of("apple","banana", "fig","orange");
    }

    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 2, true", "cherry, 3, false"})
    public void testWithCsvSource(String fruit, int rank,boolean flag){
        System.out.println(fruit + "|" + rank + '|' + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }
    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEqual){
        int result = input * input;
        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);
    }

    static Stream<Arguments> squareTestData(){
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,15,false)
        );
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/data.csv")
//        public void testWithSource(String fruit, int rank, boolean flag){
//        System.out.println(fruit + "|" + rank + "|" + flag);
//        Assertions.assertNotNull(fruit);
//    }


    @Disabled
    @Test
    public void testMethod(){
        Assertions.assertNotEquals(2,2);
    }


}