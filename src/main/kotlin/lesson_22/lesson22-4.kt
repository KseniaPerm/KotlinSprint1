package org.example.lesson_22

data class MainScreenState(val data: String, val isLoading: Boolean = false) {
    override fun toString(): String {
        return "Информация о состоянии: $data - $isLoading"
    }
}

data class StateStorage(val mainScreenState: MainScreenState)

class MainScreenViewModel {
    private var mainScreenState = MainScreenState("Отсутствие данных")
    fun loadData() {
        mainScreenState = MainScreenState("Отсутствие данных")
        println(mainScreenState.toString())
        mainScreenState = MainScreenState("Загрузка данных", isLoading = true)
        println(mainScreenState)
        mainScreenState = MainScreenState("Наличие загруженных данных", true)
        println(mainScreenState)
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}