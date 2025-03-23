package com.tom.service.comms.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tom.service.comms.models.ChatMessage;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, UUID> {

	List<ChatMessage> findByChatId(String s);
}
