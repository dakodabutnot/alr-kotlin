package dev.dakoda.alr.character.inventory.item

import dev.dakoda.alr.character.player.inventory.EquipmentExperience
import dev.dakoda.alr.character.stats.StatsDiffs
import dev.dakoda.alr.combat.Damage

class Weapon(
    val id: String,
    var name: String,
    var description: String = "",
    val value: Long = 0,
    val image: String = "",
    val rarity: ItemRarity = ItemRarity.BASIC,
    val type: WeaponType,
    val damage: Damage,
    val energies: Energies,
    val statsDiffs: StatsDiffs,
    val experience: EquipmentExperience
) {

    fun isDoubleHanded() = type.isDoubleHanded
}