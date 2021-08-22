//package models.dao;
//
//import models.News;
//import org.sql2o.Connection;
//import org.sql2o.Sql2o;
//import org.sql2o.Sql2oException;
//
//import java.util.List;
//
//public class Sql2oNewsDao {
//    private final Sql2o sql2o;
//        public Sql2oNewsDao(Sql2o sql2o) {
//            this.sql2o = sql2o;
//        }
//
//    @Override
//    public void add(News news) {
//        String sql = "INSERT INTO News (employee, role, , department, news) VALUES (:employee, :role, :department, :news)";
//        try (Connection con = sql2o.open()) {
//            int id = (int) con.createQuery(sql, true)
//                    .bind(news)
//                    .executeUpdate()
//                    .getKey();
//            News.SetId(id);
//        } catch (Sql2oException ex) {
//            System.out.println(ex);
//        }
//    }
//    @Override
//    public List<News> getAll() {
//        try (Connection con = sql2o.open()) {
//            return con.createQuery("SELECT * FROM news")
//                    .executeAndFetch(News.class);
//        }
//    }
//
//    @Override
//    public News findById(int id) {
//        try (Connection con = sql2o.open()) {
//            return con.createQuery("SELECT * FROM news WHERE id = :id")
//                    .addParameter("id", id)
//                    .executeAndFetchFirst(News.class);
//        }
//    }
//    @Override
//    public void update(int id, String newEmployee, String newRole, String newDepartment, String newsNews) {
//        String sql = "UPDATE restaurants SET (employee, role, department, news) = (:employee, :role, :department, :news) WHERE id=:id"; //CHECK!!!
//        try (Connection con = sql2o.open()) {
//            con.createQuery(sql)
//                    .addParameter("employee", newEmployee)
//                    .addParameter("role", newRole)
//                    .addParameter("department", newDepartment)
//                    .addParameter("news", newsNews)
//                    .addParameter("id", id)
//                    .executeUpdate();
//        } catch (Sql2oException ex) {
//            System.out.println(ex);
//        }
//    }
//
//    @Override
//    public void deleteById(int id) {
//        String sql = "DELETE from news WHERE id = :id"; //raw sql
//        try (Connection con = sql2o.open()) {
//            con.createQuery(sql)
//                    .addParameter("id", id)
//                    .executeUpdate();
//        } catch (Sql2oException ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Override
//    public void clearAll() {
//        String sql = "DELETE from news";
//        try (Connection con = sql2o.open()) {
//            con.createQuery(sql).executeUpdate();
//        } catch (Sql2oException ex) {
//            System.out.println(ex);
//        }
//    }
//}

