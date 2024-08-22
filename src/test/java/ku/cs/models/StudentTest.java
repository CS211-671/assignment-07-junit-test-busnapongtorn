package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testChangeName(){
        Student s1 = new Student("6610405841","bus");
        s1.changeName("king");
        assertEquals("king",s1.getName());
    }

    @Test
    void testIsId() {
        Student s1 = new Student("6610405841","bus");
        assertEquals(true,s1.isId("6610405841"));
    }

    @Test
    void testAddScore(){
        Student s1 = new Student("6610405841","king");
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6610405841","king",50);
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }

}