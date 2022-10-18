import business.BaseManager;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.BaseDao;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        Logger[] loggers={new MailLogger(),new DatabaseLogger()};

        Course course= new Course(1,"Java","2022",100);
        CourseManager courseManager=new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course);

        Category category=new Category(2,"Programming");
        CategoryManager categoryManager=new CategoryManager(new JdbcDao(),loggers);
        categoryManager.add(category);

        Instructor instructor=new Instructor(3,"John","Software");
        InstructorManager instructorManager= new InstructorManager(new HibernateDao(),loggers);
        instructorManager.add(instructor);

//        Course course=new Course();
//        course.setId(1);
//        course.setName("Java");
//        course.setPrice(100);
//        course.setDetail("Java 2022");
//
//        Category category = new Category();
//        category.setId(2);
//        category.setName("Programming");
//
//        Instructor instructor = new Instructor();
//        instructor.setId(3);
//        instructor.setName("Engin");
//        instructor.setBranch("Java");



    }
}