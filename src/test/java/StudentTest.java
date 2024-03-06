import org.example.Student;
import org.example.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testisDoingMBKM(){
        Student mahasiswa1 = new Student("juan",3, false);

        Assertions.assertEquals(true, mahasiswa1.isDoingMBKM());
//        Assertions.assertAll(
//                () -> Assertions.assertEquals(6, mahasiswa1.isDoingMBKM()),
//                () -> Assertions.assertEquals(3, calc.b),
//                () -> Assertions.assertNotNull(calc.tambah()),
//                () -> Assertions.ass
//        );
    }

}
