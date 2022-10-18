package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends BaseManager {
    private BaseDao baseDao;
    private Logger[] loggers;

    public InstructorManager(BaseDao baseDao, Logger[] loggers) {
        super(baseDao, loggers);
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    List<Instructor> instructors = new ArrayList<>();

    public void add(Instructor instructor) throws Exception {
        if (instructor.getName().isEmpty()) {
            System.out.println("Cant be empty");
        }

        instructors.add(instructor);
        baseDao.addInstructor(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}
