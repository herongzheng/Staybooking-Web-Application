package com.laioffer.staybooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.util.FileSystemUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class StaybookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(StaybookingApplication.class, args);
    }
}
