package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements BaseDao{
    @Override
    public void addCategory(Category category) {
        System.out.println("Add with Hibernate");
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Add with Hibernate");

    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Add with Hibernate");

    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("Delete with Hibernate");

    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("Delete with Hibernate");

    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        System.out.println("Delete with Hibernate");

    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("Update with Hibernate");

    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("Update with Hibernate");

    }

    @Override
    public void updateInstructor(Instructor instructor) {
        System.out.println("Update with Hibernate");

    }
}
