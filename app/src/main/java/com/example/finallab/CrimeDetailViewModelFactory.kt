package com.example.finallab
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.util.*

class CrimeDetailViewModelFactory(private val crime: Crime) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CrimeDetailViewModel::class.java)) {
            return CrimeDetailViewModel(crime) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
