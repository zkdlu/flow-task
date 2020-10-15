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
            String name = extension.getName();
            if (name.length() == 0) {
                return false;
            }

            Optional<CustomExtension> result = extensionRepo.findById(name);
            if (result.isPresent()) {
                return false;
            }

            long totalCount = extensionRepo.count();
            if (totalCount < 200) {
                extensionRepo.save(extension);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public List<CustomExtension> getCustoms() {
        return extensionRepo.findAll();
    }

    public boolean deleteExtension(String key) {
        try {
            extensionRepo.deleteById(key);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
