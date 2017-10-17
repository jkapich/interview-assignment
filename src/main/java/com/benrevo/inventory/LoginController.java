package com.benrevo.inventory;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class LoginController {
    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("what")
                && password.equalsIgnoreCase("pass");
    }

}
