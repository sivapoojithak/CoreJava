package maps;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentHashMapTest {

    @Test
    public void testPositiveResponse() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Student student = studentHashMap.getStudent("John");
        assertNotNull(student);
        assertEquals("John", student.getFirstName());
    }

    @Test
    public void testNegativeResponse() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Student student = studentHashMap.getStudent("Unknown");
        assertNull(student);
    }

    @Test
    public void testZeroResponse() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Student student = studentHashMap.getStudent("Michael");
        assertNotNull(student);
        assertEquals("Michael", student.getFirstName());
    }

    @Test
    public void testNullResponse() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Student student = studentHashMap.getStudent(null);
        assertNull(student);
    }
}
