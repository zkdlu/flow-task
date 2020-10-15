package com.zkdlu.blocking.config;

import com.zkdlu.blocking.model.DefaultExtension;
import com.zkdlu.blocking.repository.DefaultExtensionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    private DefaultExtensionRepo extensionRepo;

    @Autowired
    public DataLoader(DefaultExtensionRepo extensionRepo) {
        this.extensionRepo = extensionRepo;
    }

    public void run(ApplicationArguments args) {
        extensionRepo.save(new DefaultExtension("bat", false));
        extensionRepo.save(new DefaultExtension("cmd", false));
        extensionRepo.save(new DefaultExtension("com", false));
        extensionRepo.save(new DefaultExtension("col", false));
        extensionRepo.save(new DefaultExtension("exe", false));
        extensionRepo.save(new DefaultExtension("scr", false));
        extensionRepo.save(new DefaultExtension("js", false));
    }
}
