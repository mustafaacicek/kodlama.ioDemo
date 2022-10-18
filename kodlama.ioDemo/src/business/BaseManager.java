package business;

import core.logging.Logger;
import dataAccess.BaseDao;

import java.util.List;

public class BaseManager {
    private BaseDao baseDao;
    private Logger[] loggers;


    public BaseManager(BaseDao baseDao, Logger[] loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }



}
