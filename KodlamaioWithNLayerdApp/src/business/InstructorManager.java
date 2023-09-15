package business;

import Logging.Logger;
import dataAccess.InstructorDao;
import entitites.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        System.out.println("Eğitmen ismi tekrar edemez");

        instructorDao.add(instructor);

        for(Logger logger:loggers){
            logger.log(instructor.getFirstName()+" "+instructor.getLastName());
        }
    }
}
