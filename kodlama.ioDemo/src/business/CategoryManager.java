package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import dataAccess.HibernateDao;
import entities.Base;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager extends BaseManager {

    private BaseDao baseDao;
    private Logger[] loggers;

    public CategoryManager(BaseDao baseDao, Logger[] loggers) {
        super(baseDao, loggers);
        this.baseDao = baseDao;
        this.loggers = loggers;
    }


    List<Category> categories = new ArrayList<>();

    public void add(Category category) throws Exception {
        if (category.getName().isEmpty()) {
            System.out.println("Cant be empty");
        }

        categories.add(category);
        baseDao.addCategory(category);

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }


}
