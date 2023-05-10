package com.mishilda.composition.domain.usecases

import com.mishilda.composition.domain.entity.GameSettings
import com.mishilda.composition.domain.entity.Level
import com.mishilda.composition.domain.repository.GameRepository

class GetGameSettingUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}