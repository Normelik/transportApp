package com.simple.backend.services;

import com.simple.backend.DTOs.RequestWindow;
import com.simple.backend.models.Window;
import com.simple.backend.repositories.WindowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WindowService {

    private final WindowRepository windowRepository;

    public Long create(RequestWindow requestWindow) {
        Window newWindow = Window.builder()
                .plateNumber(requestWindow.plateNumber())
                .unloadingPlace(requestWindow.unloadingPlace())
                .build();
        windowRepository.save(newWindow);
        return newWindow.getId();
    }

    public List<Window> getALl() {
        return windowRepository.findAll();
    }

    public Window findById(Long id) {
        return windowRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Window not found")
        );
    }

    public Window update(Long id, Window windowDetails) {
        Window updatedWindow = windowRepository.findById(id).orElseThrow(() -> new RuntimeException("Window not found"));
        updatedWindow.setPlateNumber(windowDetails.getPlateNumber());
        updatedWindow.setUnloadingPlace(windowDetails.getUnloadingPlace());
        windowRepository.save(updatedWindow);
        return updatedWindow;
    }

    public void delete(Long id) {
        windowRepository.deleteById(id);
    }
}
