package models.dao;

import models.News;

import java.util.List;

public interface NewsDao {
    //create
    void add (News news);
    // void addNewsToDepartment(News news, Department department)

    //read
    List<News> getAll();
    News findById(int id);
    // List<Department> getAllDepartmentForANews(int NewsId);

    //update
    void update(int id, String employee, String role, String depertment, String news);

    //delete
    void deleteById(int id);
    void clearAll();
}
