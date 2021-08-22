package models;

import java.util.Objects;

public class News {
    private String employee;
    private String role;
    private String department;
    private String news;
    private int id;

    public News(String employee, String role, String department, String news) {
        this.employee = employee;
        this.role = role;
        this.department = department;
        this.news = news;
    }
    public String getEmployee() {
        return employee;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public String getNews() {
        return news;
    }

    public int getId() {
        return id;
    }
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setNews(String news) {
        this.news = news;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News that = (News) o;
        return id == that.id &&
                Objects.equals(employee, that.employee) &&
                Objects.equals(role, that.role) &&
                Objects.equals(department, that.department) &&
                Objects.equals(news, that.news);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employee, role, department, news,id);
    }

}
