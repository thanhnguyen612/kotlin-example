package org.example.repository

import org.example.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
}