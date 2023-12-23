package com.example.realtimecollaborative;
import com.example.realtimecollaborative.config.Config;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.StompWebSocketEndpointRegistration;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ConfigTest {

    @Mock
    private MessageBrokerRegistry registry;

    @Mock
    private StompEndpointRegistry stompEndpointRegistry;

    @Mock
    private StompWebSocketEndpointRegistration stompWebSocketEndpointRegistration;

    @InjectMocks
    private Config config;

    @Test
    void testConfigureMessageBroker() {
        // Arrange
        MockitoAnnotations.openMocks(this);

        // Act
        config.configureMessageBroker(registry);

        // Assert
        verify(registry).enableSimpleBroker("/topic");
        verify(registry).setApplicationDestinationPrefixes("/app");
    }

    @Test
    void testRegisterStompEndpoints() {
        // Arrange
        MockitoAnnotations.openMocks(this);
        when(stompEndpointRegistry.addEndpoint("/server1")).thenReturn(stompWebSocketEndpointRegistration);

        // Act
        config.registerStompEndpoints(stompEndpointRegistry);

        // Assert
        verify(stompWebSocketEndpointRegistration).withSockJS();
    }
}
