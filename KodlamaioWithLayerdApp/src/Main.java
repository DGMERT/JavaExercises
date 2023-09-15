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
        Logger[] loggers = {new FileLogger(),new DataLogger(), new MailLogger()};
        System.out.println("************************");

        Course course1 = new Course("Java",1);
        Course course2 = new Course("Python",5000);
        Course[] courses = {course1};

        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course1);

        System.out.println("************************");

        Instructor instructor1 = new Instructor("Engin", "DEMİROĞ");
        Instructor instructor2 = new Instructor("Halit Enes", "KALAYCI");
        InstructorManager instructorManager = new InstructorManager(new Jdbc(),loggers);
        instructorManager.add(instructor1);


        System.out.println("************************");

        Category category1 = new Category("Programlama");
        Category category2 = new Category("Algoritma");


        Category[] categories = { category2 };


        CategoryManager categoryManager = new CategoryManager(new Jdbc(),loggers,categories);
        categoryManager.add(category1);





    }
}