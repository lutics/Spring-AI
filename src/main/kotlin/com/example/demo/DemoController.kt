package com.example.demo

import org.springframework.ai.chat.ChatClient
import org.springframework.ai.embedding.EmbeddingClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.ai.embedding.EmbeddingResponse as EmbeddingResponse1

@RestController
class DemoController(
    private val chatClient: ChatClient,
    private val embeddingClient: EmbeddingClient
) {

    @GetMapping("ai/chat")
    suspend fun chat(
        @RequestParam(value = "message", defaultValue = "hello world") message: String
    ): String? {
        val response = chatClient.call(message)

        return response
    }

    @GetMapping("ai/embedding")
    suspend fun embed(
        @RequestParam(value = "message", defaultValue = "hello world") message: String
    ): EmbeddingResponse1? {
        val embeddingResponse = embeddingClient.embedForResponse(listOf(message))

        return embeddingResponse
    }
}