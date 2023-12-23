
package com.example.realtimecollaborative;
import com.example.realtimecollaborative.controller.MessageController;
import com.example.realtimecollaborative.models.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import static org.mockito.Mockito.verify;

class MessageControllerTest {

    @Mock
    private SimpMessagingTemplate messagingTemplate;

    @InjectMocks
    private MessageController messageController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testGetContent() {
        // Arrange
        Message message = new Message("John", "Hello, World!");

        // Act
        Message result = messageController.getContent(message);

        // Assert
        // Verify that the messagingTemplate sends a message to the "/topic/return-to" destination.
        verify(messagingTemplate).convertAndSend("/topic/return-to", message);
    }
}
