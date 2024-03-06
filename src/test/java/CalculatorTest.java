import org.example.calculator;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    private int result = 0;

    @BeforeAll
    void setupClass(){
        System.out.println("Before all is called");
    }
    @BeforeEach
    void setupMethod(){
        System.out.println("Before each is called");
    }
    @AfterEach
    void classMethod(){
        System.out.println("After each is called");
    }
    @AfterAll
    void cleanClass(){
        System.out.println("After all is called");
    }

    @Test
    @Order(1)
    void testTambah(){
        System.out.println("meth 1 called");
        //create obj calculator, assign a dan b
//        calculator calc = new calculator(6,3);
//
////        Assertions.assertEquals(9,calc.tambah(), "ini fungsi tambah");
//    Assertions.assertAll(
//            () -> Assertions.assertEquals(6, calc.a),
//            () -> Assertions.assertEquals(3, calc.b),
//            () -> Assertions.assertNotNull(calc.tambah())
//    );

        int a = 10;
        int b = 7;

        calculator calcs = new calculator(a, b);
        result = calcs.tambah();

        Assertions.assertEquals(17, result);
    }


    @Test
    @Order(2)
    void testKurang(){
        System.out.println("meth 2 called");
        //create obj calculator, assign a dan b
//        calculator calc = new calculator(6,3);
//
//        Assertions.assertEquals(3,calc.kurang(), "ini fungsi kurang");

        int b = 5;
        calculator calcs2 = new calculator(result, b);
        result = calcs2.kurang();

        Assertions.assertEquals(17, result);
    }

    @Test

    void testKali(){
        //create obj calculator, assign a dan b
        calculator calc = new calculator(6,3);

        Assertions.assertEquals(18,calc.kali(), "ini fungsi kali");
    }

    @Test
    void testBagi(){
        //create obj calculator, assign a dan b
        calculator calc = new calculator(6,3);

        Assertions.assertEquals(2,calc.bagi(), "ini fungsi bagi");
    }
}
