package com.sumit.pack;

import com.sumit.pack.api.DefaultApi;
import com.sumit.pack.models.Employee;
import com.sumit.pack.ServerConfiguration;

import java.util.ArrayList;
import java.util.List;

public class DemoApiClient {
    public static void main(String[] args) {

        ApiClient defaultClient = new ApiClient();
        defaultClient.setBasePath("http://localhost:8080/employee");
        defaultClient.setBasePath("http://localhost:8080/users");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
//            List<Employee> result = apiInstance.employeeGet();
            Employee employee = new Employee();
            employee.setName("Ankit Solanki");
            employee.setSalary(300000);
            List<Employee> list = new ArrayList<>();
            list.add(employee);
            List<Employee> result = apiInstance.employeePost(list);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling DefaultApi#employeeGet");
//            System.err.println("Status code: " + e.getCode());
//            System.err.println("Reason: " + e.getResponseBody());
//            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
