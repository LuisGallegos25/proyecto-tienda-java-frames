
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class conectar {
    
private static Connection conn;
private static final String driver ="com.mysql.jdbc.Driver";
private static final String user="root"; //usuario
private static final String password=""; //datos de instalaciopn
private static final String url="jdbc:mysql://localhost:3306/tienda";//lugar de la base de datos

    public Connection conectar() {
        conn=null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password); //se conecta a la base de datos
            if(conn!= null){
                System.out.println("conexion establecida ");                     
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e);
        }
     return conn;   
    }
    //este metodo nos retorna la conexion
    public Connection getConection(){
        return conn;
    }
    //con este metodo nos desconectamos de la B. D.
    public void desconectar(){
        conn=null;
        if (conn==null){
            System.out.println("Coneccion terminada");
        }
    }

    public PreparedStatement prepareStatement(String select__from_persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
