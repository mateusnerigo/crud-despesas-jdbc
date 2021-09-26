package br.com.crudexpensesjdbc;


import br.com.crudexpensesjdbc.dao.ExpenseDAO;
import br.com.crudexpensesjdbc.model.Category;
import br.com.crudexpensesjdbc.model.Expense;

import java.time.LocalDate;

public class Application {
  public static void main(String[] args) {
    ExpenseDAO dao = new ExpenseDAO();
    Expense exp = new Expense();

    exp.setDescription("Rent payment");
    exp.setCategory(Category.HOME);
    exp.setValue(750);
    exp.setDate(LocalDate.of(2021, 9, 26));

    dao.save(exp);

    dao = null;
    exp = null;
  }
}
