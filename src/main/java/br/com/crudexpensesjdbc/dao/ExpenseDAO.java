package br.com.crudexpensesjdbc.dao;

import br.com.crudexpensesjdbc.infra.ConnectionFactory;
import br.com.crudexpensesjdbc.model.Category;
import br.com.crudexpensesjdbc.model.Expense;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ExpenseDAO implements IExpenseDAO{

  @Override
  public Expense save(Expense expense) {
    PreparedStatement stmt;
    String query;

    try (Connection con = ConnectionFactory.getConnection()) {
      query = "INSERT INTO expenses (description, value, date, category) VALUES (?, ?, ?, ?)";

      stmt = con.prepareStatement(query);
      stmt.setString(1, expense.getDescription());
      stmt.setDouble(2, expense.getValue());
      stmt.setDate(3, Date.valueOf(expense.getDate()));
      stmt.setString(4, expense.getCategory().toString());

      stmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println("Error on connect and save to database. " + e);
      throw new RuntimeException(e);
    }

    return null;
  }

  @Override
  public Expense update(Expense expense) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public List<Expense> findAll() {
    return null;
  }

  @Override
  public Optional<Expense> findById(Long Id) {
    return Optional.empty();
  }

  @Override
  public List<Expense> findByCategory(Category category) {
    return null;
  }
}
