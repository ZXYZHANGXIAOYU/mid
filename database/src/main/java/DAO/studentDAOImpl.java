package DAO;

import model.student;

import java.util.List;

public class studentDAOImpl extends AbstractstudentDAO {

    @Override
    public void insertstudent(model.student student) {
        String INSERT_Student="INSERT INTO student(id,name,sex,email,score) VALUE(?,?,?)";
        Object[] args = {student.getId(),student.getEmail(),student.getName(),student.getSex(),student.getScore()};
        jdbcTemplate.update(INSERT_Student, args);
    }

    @Override
    public void modifystudent(model.student student) {
        String MODIFY_STUDENT = "update student set id=?,name=?,sex=?,email=?,score=?";
        Object[] args = {student.getScore(),student.getSex(),student.getName(),student.getEmail(),student .getId()};
    }

    @Override
    public List<model.student> queryAll() {
        String QUERY_ALL_BOOK = "select * from student";
        return student;
    }

}
