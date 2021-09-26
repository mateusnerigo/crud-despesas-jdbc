package br.com.crudexpensesjdbc.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {

  private ConnectionFactory() {}

  public static Connection getConnection() {
    Dotenv env;
    Connection driveManager;

    try {
      env = Dotenv.load();
      driveManager = DriverManager.getConnection(
              env.get("DB_HOST"),
              env.get("DB_USER"),
              env.get("DB_PASS")
      );

      env = null;

      return driveManager;
    } catch (SQLException e) {
      System.out.println("Error in database connection: " + e);
      throw new RuntimeException(e);
    }
  }
}
