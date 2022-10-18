package business;

import core.logging.DatabaseLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.BaseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager extends BaseManager {
    private BaseDao baseDao;
    private Logger[] loggers;

    public CourseManager(BaseDao baseDao, Logger[] loggers) {
        super(baseDao, loggers);
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    List<Course> courses = new ArrayList<>();

    public void add(Course course) throws Exception {
        if (course.getName().isEmpty()) {
            System.out.println("Cant be empty");
        }

        courses.add(course);
        baseDao.addCourse(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }

}
