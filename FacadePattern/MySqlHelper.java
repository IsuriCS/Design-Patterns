package FacadePattern;

import java.sql.Connection;
public class MySqlHelper {
    public static Connection getMySqlDBConnection() {
        return null;
    }
    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println("PDF report generated for table: " + tableName + ", connection: " + con);
    }
    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println("HTML report generated for table: " + tableName + ", connection: " + con);
    }
}
