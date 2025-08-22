package ku.cs.models;

import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentHardCodeTest {
    @Test
    void testHardCode() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertEquals("First", studentList.findStudentById("6710400001").getName());
    }
}
