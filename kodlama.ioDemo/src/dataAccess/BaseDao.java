package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface BaseDao {
    void addCategory(Category category);
    void addCourse(Course course);
    void addInstructor(Instructor instructor);
    void deleteCategory(Category category);
    void deleteCourse (Course course);
    void deleteInstructor (Instructor instructor);
    void updateCourse(Course course);
    void updateCategory(Category category);
    void updateInstructor(Instructor instructor);

}
