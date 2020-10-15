package com.zkdlu.blocking.service;

import com.zkdlu.blocking.model.CustomExtension;
import com.zkdlu.blocking.model.DefaultExtension;
import com.zkdlu.blocking.repository.CustomExtensionRepo;
import com.zkdlu.blocking.repository.DefaultExtensionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomExtensionService {
    @Autowired
    DefaultExtensionRepo defaultExtensionRepo;

    @Autowired
    CustomExtensionRepo extensionRepo;

    public boolean createExtension(CustomExtension extension) {
        try {
            if (isEmptyName(extension)) {
                return false;
            }

            if (isDuplicatedExtension(extension)) {
                return false;
            }

            if (isDefaultExtension(extension)) {
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

    private boolean isDefaultExtension(CustomExtension extension) {
        String name = extension.getName();
        DefaultExtension defaultExtension = defaultExtensionRepo.findOneByName(name);

        return defaultExtension != null;
    }

    private boolean isDuplicatedExtension(CustomExtension extension) {
        Optional<CustomExtension> result = extensionRepo.findById(extension.getName());
        return result.isPresent();
    }

    private boolean isEmptyName(CustomExtension extension) {
        return extension.getName().length() == 0;
    }

}
