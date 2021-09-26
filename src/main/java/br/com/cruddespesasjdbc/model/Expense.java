package br.com.cruddespesasjdbc.model;

import java.time.LocalDate;

public class Expense {
  private Long id;
  private String description;
  private LocalDate date;
  private double value;
  private Category category;

}
