package com.zkdlu.blocking.controller;

import com.zkdlu.blocking.interfaces.CrudController;
import com.zkdlu.blocking.model.CustomExtension;
import com.zkdlu.blocking.service.CustomExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/custom")
public class CustomExtensionController implements CrudController<CustomExtension, String> {
    @Autowired
    CustomExtensionService extensionService;

    @Override
    public boolean create(CustomExtension extension) {
        return extensionService.createExtension(extension);
    }

    @Override
    public List<CustomExtension> read() {
        return extensionService.getCustoms();
    }

    @Override
    public CustomExtension update(String key, CustomExtension model) {
        return null;
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public CustomExtension readOne(String key) {
        return null;
    }
}
