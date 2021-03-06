package dev.dakoda.alr.character.inventory.item

import dev.dakoda.alr.character.inventory.item.ItemRarity.BASIC
import java.util.UUID

class Item(
    id: String = UUID.randomUUID().toString(),
    name: String,
    description: String = "",
    value: Long = 0,
    image: String = "",
    rarity: ItemRarity = BASIC
)