package factotyDesignPattern;

import factotyDesignPattern.com.*;

public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
        
        OS obj1 = new IOS();
        obj1.spec();
    }
}
