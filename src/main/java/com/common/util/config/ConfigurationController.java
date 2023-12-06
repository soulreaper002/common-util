package com.common.util.config;

import com.common.util.properties.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @Autowired
    MessageProperties messageProperties;
    @GetMapping("/configure")
    public String propertiesValue() {
        return messageProperties.getText();
    }
}
