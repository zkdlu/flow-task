package com.zkdlu.blocking.service;

import com.zkdlu.blocking.model.DefaultExtension;
import com.zkdlu.blocking.repository.DefaultExtensionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultExtensionService {
    @Autowired
    DefaultExtensionRepo extensionRepo;

    public List<DefaultExtension> getExtensionAll() {
        List<DefaultExtension> extensions = extensionRepo.findAll();

        return extensions;
    }

    public DefaultExtension updateExtension(Integer key, DefaultExtension newExtension) {
        Optional<DefaultExtension> result = extensionRepo.findById(key);

        if (result.isPresent()) {
            DefaultExtension extension = result.get();

            extension.setBlocked(
                    newExtension.isBlocked());

            return extensionRepo.save(extension);
        }

        return null;
    }
}
