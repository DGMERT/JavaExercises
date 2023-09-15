package business;

import Logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import entitites.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception{

        if (course.getPrice()<0){
            throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");
        }
        courseDao.add(course);
        for(Logger logger:loggers){
            logger.log(course.getName());
        }


    }
}
