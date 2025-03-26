package org.example.lesson_1_10.lesson_2

fun main() {
   val workers = 50
   val interns = 30
   val totalEmployees = workers + interns
   val salaryWorkers = workers * SALARY_WORKERS
   val salaryInterns = interns * SALARY_INTERNS
   val totalSalary = salaryWorkers + salaryInterns
   val averageSalary = (salaryWorkers + salaryInterns) / totalEmployees
   println("Расходы на выплату постоянных сотрудников : $salaryWorkers")
   println("Общие расходы по ЗП после прихода стажеров : $totalSalary")
   println("Средняя ЗП одного сотрудника после устройства стажеров : $averageSalary")
}
const val SALARY_WORKERS = 30_000
const val SALARY_INTERNS = 20_000