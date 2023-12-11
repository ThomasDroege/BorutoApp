package com.example.borutoapp.data.repository

import com.example.borutoapp.domain.repository.DataStoreOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

// wenn injected wird, wird auf den Type (hier DataStoreOperations) geschaut.
// Die Dagger Hilt Library überprüft alle Module nach den Funktionen, welche den gleichen Rückgabewert haben
// in diesem Fall: RepositoryModule.provideDataStoreOperations und dadurch wird die Implementation zu Repository injected
class Repository @Inject constructor(
    private val dataStore: DataStoreOperations
) {

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingSTate()
    }
}