package org.example.project.presentacion

import moe.tlaster.precompose.viewmodel.ViewModel
import org.example.project.domain.ExpenseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.viewModelScope
import org.example.project.model.Expense

data class ExpensesUiState(
  val expenses: List<Expense> = emptyList(),
  val total: Double = 0.0
)

class ExpensesViewModel(private val repo: ExpenseRepository): ViewModel() {
  //private val _uiState = MutableStateFlow(ExpensesUiState())

  private val _uiState = MutableStateFlow(ExpensesUiState())
  val uiState = _uiState.asStateFlow()
  private val allExpense = repo.getAllExpense()

  init {
    getAllExpense()
  }

  private fun updateState() {
    _uiState.value = _uiState.value.copy(expenses = allExpense, total = allExpense.sumOf { it.amount })
    /*_uiState.update{ state ->
      state.copy(expenses = allExpense, total = allExpense.sumOf { it.amount })
    }*/
  }

  private fun getAllExpense() {
    viewModelScope.launch {
      updateState()
    }
  }

  fun addExpense(expense: Expense) {
    viewModelScope.launch {
      repo.addExpense(expense)
      updateState()
    }
  }

  fun editExpense(expense: Expense) {
    viewModelScope.launch {
      repo.editExpense(expense)
      updateState()
    }
  }

  fun deleteExpense(expense: Expense) {
    viewModelScope.launch {
      repo.deleteExpense(expense)
      updateState()
    }
  }

  fun getExpenseWithId(id: Long): Expense {
    return allExpense.first{it.id == id }
  }
}
