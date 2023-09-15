import Logging.DataLogger;
import Logging.FileLogger;
import Logging.Logger;
import Logging.MailLogger;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateDao;
import dataAccess.Jdbc;
import entitites.Category;
import entitites.Course;
import entitites.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course("Yazılım",1);
        Category category=new Category("Programlama");
        Instructor instructor = new Instructor("Engin","Demiroğ");

        Logger[] loggers = new Logger[]{new DataLogger(),new FileLogger(),new MailLogger()};
        System.out.println("************************");

        CourseManager courseManager = new CourseManager(new Jdbc(),loggers);
        courseManager.add(course);

        System.out.println("************************");

        CategoryManager categoryManager = new CategoryManager(new Jdbc(),loggers);
        categoryManager.add(category);

        System.out.println("************************");

        InstructorManager instructorManager = new InstructorManager(new HibernateDao(),loggers);
        instructorManager.add(instructor);

    }
}