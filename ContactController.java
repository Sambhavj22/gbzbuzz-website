package com.gbjbuzz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @PostMapping
    public String contact(@RequestBody String message) {
        // Handle contact message
        return "Message received: " + message;
    }
}
