package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created a new row!!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted a row with id: "+employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from DB");
        return new EmployeeDo();
    }
}
