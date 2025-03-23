package com.tom.service.comms.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tom.service.comms.models.ChatRoom;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, UUID> {

	Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
