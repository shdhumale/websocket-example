package com.siddhu.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.siddhu.handler.SiddhuTextWebSocketHandler;
 
@Configuration
@EnableWebSocket
public class SiddhuWebSocketConfig implements WebSocketConfigurer {
 
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new SiddhuTextWebSocketHandler(), "/web-socket");
    }
}