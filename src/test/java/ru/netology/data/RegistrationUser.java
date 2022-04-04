package ru.netology.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class RegistrationUser {

    @Data
    @RequiredArgsConstructor
    public static class RegistrationUserData {
        private final String login;
        private final String password;
        private final String status;
    }
}
