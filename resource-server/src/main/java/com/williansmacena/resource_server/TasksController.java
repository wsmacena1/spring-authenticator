package com.williansmacena.resource_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("tasks")
public class TasksController {

    @GetMapping
    public String getTasks(@AuthenticationPrincipal Jwt jwt) {
        return """
                <h1> Top Secret Tasks for %s</h1>
                <ol>
<li>Task1</li>
<li>Task1</li>
<li>Task1</li>
                </ol>
                """.formatted(jwt.getSubject());
    }
    
}
