package com.github.rd.sentinel.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {
        "com.github.rd.sentinel.dashboard.entrypoint.admin",
        "com.github.rd.sentinel.dashboard.entrypoint.common",
        "com.github.rd.sentinel.dashboard.application",
        "com.github.rd.sentinel.dashboard.infrastructure"
})
public class DashboardAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(DashboardAdminApp.class, args);
    }
}
