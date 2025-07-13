package ProxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args) {

        try {
            EmployeeDao obj=new EmployeeDaoProxy();
            obj.create("ADMIN",new EmployeeDo());
            System.out.println("Operation Successful!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
