package com.dakoda.alr.domain

import com.dakoda.alr.domain.character.Stat
import com.dakoda.alr.domain.item.*

class MockItem {

    companion object {

        fun generic(
            name: String = "Mock generic item",
            description: String = "Mock generic item description",
            value: Int = 20
        ) = Item(
            name = name,
            description = description,
            value = value
        )

        fun weapon(
            name: String = "Mock weapon",
            damage: Int = 1,
            description: String = "Mock weapon description",
            value: Int = 20
        ) = Weapon(
            name = name,
            damage = damage,
            description = description,
            value = value
        )

        fun consumable(
            name: String = "Mock consumable",
            stats: MutableList<Stat> = mutableListOf(),
            description: String = "Mock consumable description",
            value: Int = 20
        ) = Consumable(
            name = name,
            stats = stats,
            description = description,
            value = value
        )

        fun armour(
            name: String = "Mock piece of armour",
            protection: Int = 1,
            description: String = "Mock piece of armour description",
            value: Int = 20
        ) = Armour(
            name = name,
            protection = protection,
            description = description,
            value = value
        )

        fun accessory(
            name: String = "Mock accessory",
            stats: MutableList<Stat> = mutableListOf(),
            description: String = "Mock accessory description",
            value: Int = 20
        ) = Accessory(
            name = name,
            stats = stats,
            description = description,
            value = value
        )
    }
}