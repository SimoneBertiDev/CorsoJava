package it.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.jdbc.Driver;

import java.nio.charset.Charset;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Main {
    private Connection connection;

    public static void main(String[] args) {
        Main db = new Main();
//        db.getSelect();


        for (int i = 0; i < 100; i++) {

            Random r = new Random();

            String[] nomi = {"Simone", "Vilma", "Yuri", "Silvia", "Fabrizio"};
            int randomName = r.nextInt(nomi.length);
            String nomer = nomi[randomName];

            String[] cognomi = {"Berti", "Ibba", "Sbaraini", "Lombardi"};
            int randomCofnome = r.nextInt(cognomi.length);
            String cognomer = cognomi[randomCofnome];

            String[] ruolo = {"PREMIUM", "STANDARD", "GOLD"};
            int randomRole = r.nextInt(ruolo.length);
            String roler = ruolo[randomRole];

            int randomAge = r.nextInt(100);

            String s = db.CF(16);


            Date date = new Date(12, 10, 04);
            System.out.println(date);
            db.setInsert(nomer,cognomer,date,roler,randomAge,s);
        }


    }

    private void setInsert(String nome, String cognome, Date start, String type, int eta, String CF) {
        String sql = "INSERT INTO users (first_name, last_name,  user_type, eta, codice_fiscale) VALUES " +
                "('" + nome + "','" + cognome + "','"+type + "'," + eta + ",'" + CF + "')";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            System.out.println(rs.getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getSelect() {
        String sql = "SELECT id, first_name, last_name, start_date, user_type, eta, codice_fiscale FROM users";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id " + rs.getInt(1));
                System.out.println("nome " + rs.getString(2));
                System.out.println("cognome " + rs.getString(3));
                System.out.println("data " + rs.getString(4));
                System.out.println("ruolo " + rs.getString(5));
                System.out.println("eta " + rs.getInt(6));
                System.out.println("codice " + rs.getString(7));
                System.out.println("---------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("user");
            dataSource.setPortNumber(3306);
            dataSource.setServerName("localHost");
            dataSource.setUser("root");
            dataSource.setPassword("");

            connection = dataSource.getConnection();
        }

        return connection;
    }

    private String CF(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}
