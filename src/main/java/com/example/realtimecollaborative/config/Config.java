package com.example.realtimecollaborative.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        try{
       registry.enableSimpleBroker("/topic");
       registry.setApplicationDestinationPrefixes("/app");}
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        try{
       registry.addEndpoint("/server1").withSockJS();}
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
