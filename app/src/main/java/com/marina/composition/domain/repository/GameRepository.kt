package com.marina.composition.domain.repository

import com.marina.composition.domain.entity.GameSettings
import com.marina.composition.domain.entity.Level
import com.marina.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}