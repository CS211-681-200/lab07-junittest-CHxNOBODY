package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void initAll() {
        s = new Student("67xxxxx", "test");
    }

    @Test
    @DisplayName("Add Score to student 49 and 51")
    void testAddScore(){
        Student s = new Student("62xxxx", "test");
        s.addScore(49);
        assertEquals(49, s.getScore());
        s.addScore(2);
        assertEquals(51, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName() {
        Student s = new Student("62xxxx", "test");
        s.changeName("test");
        assertEquals("test", s.getName());
    }

    @Test
    void testIsId() {
        Student s = new Student("620xxx", "test");
        assertTrue(s.isId("620xxx"));
        assertFalse(s.isId("testID"));
    }


    @Test
    void testIsNameContain() {
        Student s = new Student("62xxxx", "test");
        s.isNameContains("testName");
        assertEquals("test", s.getName());
    }
}


