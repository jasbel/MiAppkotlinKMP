package preview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.example.project.data.ExpenseManager
import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory
import org.example.project.presentacion.ExpensesUiState
import org.example.project.ui.AllExpensesHeader
import org.example.project.ui.ExpensesItem
import org.example.project.ui.ExpensesScreen
import org.example.project.ui.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderpreview() {
  Box(modifier = Modifier.padding(16.dp)) {
    ExpensesTotalHeader(total = 1028.8)
  }
}

@Preview(showBackground = true)
@Composable
fun AllExpansesHeaderPreview() {
  Box(modifier = Modifier.padding(16.dp)) {
    AllExpensesHeader()
  }
}

@Preview(showBackground = true)
@Composable
fun ExpensesItemPreview() {
  Box(modifier = Modifier.padding(16.dp)) {
    ExpensesItem(expense = ExpenseManager.fakeExpenseList[0], onExpenseClick = {})
  }
}

@Preview(showBackground = true)
@Composable
fun ExpensesScreenPreview() {
  ExpensesScreen(uiState = ExpensesUiState(
    expenses = ExpenseManager.fakeExpenseList,
    total = 1052.2
  ),
    onExpenseClick = {})
}