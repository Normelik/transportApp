package com.simple.backend.controllers;

import com.simple.backend.DTOs.RequestWindow;
import com.simple.backend.models.Window;
import com.simple.backend.services.WindowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/windows")
@RequiredArgsConstructor
public class WindowController {

    private final WindowService windowService;

    // Create a new window
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Long createWindow(@RequestBody RequestWindow requestWindow) {
        return windowService.create(requestWindow);
    }

    // Read all windows
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Window> getAllWindows() {
        return windowService.getALl();
    }

    // Read a specific window by ID
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Window getWindowById(@PathVariable Long id) {
        return windowService.findById(id);
    }

    // Update a window by ID
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Window updateWindow(@PathVariable Long id, @RequestBody Window windowDetails) {
        return windowService.update(id,windowDetails);
    }

    // Delete a window by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteWindow(@PathVariable Long id) {
        windowService.delete(id);
    }
}
