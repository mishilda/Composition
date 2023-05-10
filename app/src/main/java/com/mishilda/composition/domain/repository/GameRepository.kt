package com.mishilda.composition.domain.repository

import com.mishilda.composition.domain.entity.GameSettings
import com.mishilda.composition.domain.entity.Level
import com.mishilda.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}