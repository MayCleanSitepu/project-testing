package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class studentsTest {

    private static List<students> studentsList;

    @BeforeAll
    public void initClass(){
        studentsList = new ArrayList<>();
    }
    @BeforeEach
    public void initMethod(){
        students student1 = new students("John", 20);
        studentsList.add(student1);
    }
    @AfterEach
    public void cleanMethod(){
        studentsList.clear();
    }
    @AfterAll
    public void cleanClass(){
        studentsList.clear();
    }

    @Test
    void testDataCreation(){
        assertNotNull(studentsList);
        assertEquals(2, studentsList.size());
    }

    @Test
    void testStudentEnrollment(){
        students student1 = studentsList.get(0);
        student1.enrollCourse("ppw");
        student1.enrollCourse("ppk");

        List<String> courses = student1.getEnrolledCourses();

        assertNotNull(courses);
        assertEquals(1, courses.size());
        assertTrue(courses.contains("ppw"));
        assertTrue(courses.contains("ppk"));
    }

    @Test
    void testStudentGrade(){
        students student1 = studentsList.get(0);
        student1.setGrade("ppw", "A");

        String grade = student1.getGrade("ppw");

        assertEquals("A", grade);
    }


    @Test
    void getName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void enrollCourse() {
    }

    @Test
    void getEnrolledCourses() {
    }

    @Test
    void setGrade() {
    }

    @Test
    void getGrade() {
    }
}