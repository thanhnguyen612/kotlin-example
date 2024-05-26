package org.example.controller

import org.example.model.Message
import org.example.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @GetMapping("/{id}")
    fun getMessageById(@PathVariable id: String): List<Message> = service.findMessageById(id)

    @PostMapping("/")
    fun updateMessage(@RequestBody message: Message) {
        service.save(message)
    }
}