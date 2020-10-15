package com.zkdlu.blocking.service;

import com.zkdlu.blocking.model.CustomExtension;
import com.zkdlu.blocking.repository.CustomExtensionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomExtensionService {
    @Autowired
    CustomExtensionRepo extensionRepo;

    public boolean createExtension(CustomExtension extension) {
        try {
            Optional<CustomExtension> result = extensionRepo.findById(extension.getName());
            if (result.isPresent()) {
                return false;
            }

            extensionRepo.save(extension);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public List<CustomExtension> getCustoms() {
        return extensionRepo.findAll();
    }
}
