package dev.dakoda.alr.controller.request

import dev.dakoda.alr.repository.GameDefault

class MockHTTPRequest {

    companion object {

        fun getItem(
            id: String = GameDefault.itemEntity.ID
        ) = GetItemRequest(ID = id)
    }
}