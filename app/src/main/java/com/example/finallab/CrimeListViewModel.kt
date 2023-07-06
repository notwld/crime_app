package com.example.finallab
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.util.*

class CrimeListViewModel : ViewModel() {
    private val _crimes = MutableLiveData<List<Crime>>()
    val crimes: LiveData<List<Crime>> = _crimes

    init {
        loadCrimes()
    }

    private fun loadCrimes() {
        viewModelScope.launch {
            val result = mutableListOf<Crime>()
            for (i in 0 until 100) {
                val crime = Crime(
                    id = UUID.randomUUID(), title = "Crime #$i", date = Date(), isSolved = i % 2 == 0
                )
                result += crime
            }
            _crimes.value = result
        }
    }
}
