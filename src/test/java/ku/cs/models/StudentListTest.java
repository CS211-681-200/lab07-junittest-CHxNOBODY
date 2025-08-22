package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentListTest {
    @Test
    void testFindStudentById() {
        StudentList studentList = new StudentList();
        Student s = new Student("62xxxx", "test");
        studentList.findStudentById("62xxxx");
        assertEquals("test", s.getName());
    }

    @Test
    void testFilterByName() {
        Student s = new Student("62xxxx", "test");
        StudentList studentList = new StudentList();
        studentList.filterByName("testName");
        assertEquals("test", s.getName());
    }

    @Test
    void testGiveScoreToId() {
        Student s = new Student("62xxxx", "test");
        StudentList studentList = new StudentList();
        studentList.addNewStudent("62xxxx", "test");

        studentList.giveScoreToId("62xxxx", 80);

        Student found = studentList.findStudentById("62xxxx");
        assertNotNull(found);
        assertEquals(80, found.getScore());
    }

    @Test
    void testViewGradeOfId() {
        Student s = new Student("62xxxx", "test");
        StudentList studentList = new StudentList();
        studentList.viewGradeOfId("62xxxxx");
        assertEquals("test", s.getName());
    }

    @Test
    void testAddNewStudent() {
        Student s = new Student("62xxxx", "test");
        StudentList studentList = new StudentList();
        studentList.addNewStudent("67xxxx", "test");
        assertEquals("test", s.getName());
    }

    @Test
    void testAddNewStudent2() {
        Student s = new Student("62xxxx", "test");
        StudentList studentList = new StudentList();
        studentList.addNewStudent("67xxxx", "test", 80);
        assertEquals("test", s.getName());
    }
}
