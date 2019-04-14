package DAO;

import model.student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public abstract class AbstractstudentDAO implements studentDAO{
    List<model.student> student;
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertstudent(model.student student) {

    }

    @Override
    public void insertAll(List<model.student> studentList) {

    }

    @Override
    public void deletestudent(model.student student) {

    }

    @Override
    public void deleteAll(List<model.student> studentList) {

    }

    @Override
    public void deletebyid(String id) {

    }

    @Override
    public void modifystudent(model.student student) {

    }

    @Override
    public model.student queryOneBook(model.student book) {
        return null;
    }

    @Override
    public model.student queryOneBookById(String id) {
        return null;
    }

    @Override
    public List<model.student> queryAll() {
        return null;
    }


}
