package org.example.project.data

import org.example.project.domain.ExpenseRepository
import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory

class ExpenseRepoImpl(private val expenseManager: ExpenseManager): ExpenseRepository {
  override fun getAllExpense(): List<Expense> {
    return expenseManager.fakeExpenseList
  }

  override fun addExpense(expense: Expense) {
    return expenseManager.addNewExpense(expense)
  }

  override fun editExpense(expense: Expense) {
    return expenseManager.editExpense(expense)
  }

  override fun getCategories(): List<ExpenseCategory> {
    return expenseManager.getCategories()
  }

  override fun deleteExpense(expense: Expense): List<Expense> {
     expenseManager.deleteExpense(expense)
    return expenseManager.fakeExpenseList
  }
}