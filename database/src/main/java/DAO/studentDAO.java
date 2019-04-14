package DAO;

import model.student;

import java.util.List;

public interface studentDAO {
    void insertstudent(student student);
    void insertAll(List<student> studentList);

    void deletestudent(student student);
    void deleteAll(List<student>studentList);
    void deletebyid(String id);

    void modifystudent(student student);

    student queryOneBook(student book);
    student queryOneBookById(String id);
    List<student> queryAll();
}
