package jmx;  
  
public class HelloWorld implements HelloWorldMBean {  
  
    private String greeting = null;  
  
    public HelloWorld(String greeting) {  
        this.greeting = greeting;  
    }  
  
    public HelloWorld() {  
        this.greeting = "Hello World! I am Standard MBean";  
    }  
  
     
    public void setGreeting(String greeting) {  
        this.greeting = greeting;  
    }  
  
     
    public String getGreeting() {  
        return greeting;  
    }  
  
     
    public void printGreeting() {  
        System.out.println(greeting);  
    }  
  
}  