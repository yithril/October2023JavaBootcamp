package org.example;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerHistoryRepository {
    private BasicDataSource basicDataSource;

    public CustomerHistoryRepository(String url, String userName, String password){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(userName);
        basicDataSource.setPassword(password);
    }

    public List<CustomerHistory> getCustomerHistory(String customerId){
        //Stored procedure
        //{call <name of stored procedure>}
        //use callable statement instead of prepared statement
        String storedProcCall = "{call CustOrderHist(?)}";
        List<CustomerHistory> customerHistories = new ArrayList<>();

        try(Connection conn = basicDataSource.getConnection();
            CallableStatement cs = conn.prepareCall(storedProcCall)){

            cs.setString(1, customerId);

            ResultSet rs = cs.executeQuery();

            while(rs.next()){
                String productName = rs.getString("ProductName");
                int total = rs.getInt("TOTAL");

                CustomerHistory ch = new CustomerHistory(productName, total);
                customerHistories.add(ch);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return customerHistories;
    }
}
