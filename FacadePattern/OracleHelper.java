package FacadePattern;

import java.sql.Connection;
public class OracleHelper {
    public static Connection getOracleDBConnection() {
        return null;
    }
    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println("PDF report generated for table: " + tableName + ", connection: " + con);
    }
    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println("HTML report generated for table: " + tableName + ", connection: " + con);

    }
}
