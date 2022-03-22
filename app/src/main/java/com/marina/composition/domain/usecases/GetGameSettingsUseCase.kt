package com.marina.composition.domain.usecases

import com.marina.composition.domain.entity.GameSettings
import com.marina.composition.domain.entity.Level
import com.marina.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}