package com.adityamitra.authservice.controller;

import com.adityamitra.authservice.dto.LoginRequest;
import com.adityamitra.authservice.dto.RegisterRequest;
import com.adityamitra.authservice.model.User;
import com.adityamitra.authservice.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody RegisterRequest request) {
        String response = authService.registerUser(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@Valid @RequestBody LoginRequest request) {
        String token = authService.loginUser(request);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getProfile(Principal principal) {
        String username = principal.getName();
        User user = authService.getProfile(username);
        user.setPassword(null);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/profile")
    public ResponseEntity<User> updateProfile(Principal principal, @Valid @RequestBody RegisterRequest request) {
        String username = principal.getName();
        User updatedUser = authService.updateProfile(username, request);
        updatedUser.setPassword(null);
        return ResponseEntity.ok(updatedUser);
    }
}