package Logging;

public class DataLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Data kaydedildi"+ data);
    }
}
