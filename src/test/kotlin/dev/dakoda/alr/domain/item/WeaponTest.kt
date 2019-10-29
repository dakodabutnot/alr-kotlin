package dev.dakoda.alr.domain.item

import dev.dakoda.alr.domain.Mocked
import dev.dakoda.dassert.dassert
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.valiktor.ConstraintViolationException

class WeaponTest {

    @Test
    fun `When creating a weapon with a blank name, then throw a Valiktor constraint violation exception`() {
        assertThrows<ConstraintViolationException> {
            Mocked.weapon(
                name = "",
                damage = 1
            )
        }
    }

    @Test
    fun `When creating a weapon with a negative monetary value, then throw a Valiktor constraint violation exception`() {
        assertThrows<ConstraintViolationException> {
            Mocked.weapon(
                name = "test item",
                damage = 1,
                value = -1
            )
        }
    }

    @Test
    fun `When creating a weapon with negative damage, then throw a Valiktor constraint violation exception`() {
        assertThrows<ConstraintViolationException> {
            Mocked.weapon(
                name = "test item",
                damage = -1
            )
        }
    }

    @Test
    fun `When creating a weapon, it is instantiated correctly`() {
        val weapon: Weapon? = Mocked.weapon(
            name = "test weapon",
            damage = 1,
            description = "a weapon",
            value = 20
        )

        dassert {
            with(weapon!!) {
                name equals "test weapon"
                damage equals 1
                type equals ItemType.WEAPON
                description equals "a weapon"
                value equals 20
            }
        }
    }
}