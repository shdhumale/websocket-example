package com.siddhu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SiddhuWebSocketController {
    
    @RequestMapping("/websocket")
    public String getWebSocket() {
        return "index";
    }
}