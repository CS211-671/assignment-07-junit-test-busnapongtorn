package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("6610405841", "king");
        list.addNewStudent("6610405842", "kong");
        list.addNewStudent("6610405843", "kung");
        assertEquals(3, list.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        StudentList list = new StudentList();
        Student s1 = new Student("6610405844", "keng");
        list.addNewStudent("6610405841","king");
        list.addNewStudent("6610405842","kong");
        list.addNewStudent("6610405843","kung");
        assertEquals(null,list.findStudentById(s1.getId()));
    }

    @Test
    void testGiveScoreToId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610405841","king");
        list.addNewStudent("6610405842","kong");
        list.addNewStudent("6610405843","kung");
        list.giveScoreToId("6610405842",20);
        assertEquals(20,list.findStudentById("6610405842").getScore());
    }

    @Test
    void testViewGradeOfId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610405841","king",60);
        list.addNewStudent("6610405842","kong",50);
        list.addNewStudent("6610405843","kung",90);
        assertEquals("A",list.viewGradeOfId("6610405843"));
    }

    @Test
    void testGetStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610405841","king");
        list.addNewStudent("6610405842","kong");
        assertEquals(2, list.getStudents().size());
    }


}