package org.example.lesson_22

data class MainScreenState(val data: String? = null, val isLoading: Boolean = false) {
    override fun toString(): String {
        return "Информация о состоянии: $data - $isLoading"
    }
}

class MainScreenViewModel {
    private var mainScreenState = MainScreenState()
    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "Отсутствие данных", isLoading = false)
        println(mainScreenState.toString())
        mainScreenState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println(mainScreenState.toString())
        mainScreenState = mainScreenState.copy(data = "Наличие загруженных данных", isLoading = false)
        println(mainScreenState)
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}