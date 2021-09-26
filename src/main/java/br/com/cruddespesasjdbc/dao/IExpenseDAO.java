package br.com.cruddespesasjdbc.dao;

import java.util.List;
import java.util.Optional;

import br.com.cruddespesasjdbc.model.Category;
import br.com.cruddespesasjdbc.model.Expense;

public interface IExpenseDAO {
  Expense save(Expense expense);

  Expense update(Expense expense);

  void delete(Long id);

  List<Expense> findAll();

  Optional<Expense> findById(Long Id);

  List<Expense> findByCategory(Category category);
}
