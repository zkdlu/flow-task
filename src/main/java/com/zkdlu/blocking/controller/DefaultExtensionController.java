package com.zkdlu.blocking.controller;

import com.zkdlu.blocking.interfaces.CrudController;
import com.zkdlu.blocking.model.DefaultExtension;
import com.zkdlu.blocking.service.DefaultExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/default")
public class DefaultExtensionController implements CrudController<DefaultExtension, Integer> {
    @Autowired
    DefaultExtensionService extensionService;

    @Override
    public boolean create(DefaultExtension model) {
        return false;
    }

    @Override
    public List<DefaultExtension> read() {
        return extensionService.getExtensionAll();
    }

    @Override
    public DefaultExtension update(Integer integer, DefaultExtension model) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public DefaultExtension readOne(Integer integer) {
        return null;
    }
}
