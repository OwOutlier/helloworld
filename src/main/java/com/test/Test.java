package com.test;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Novocaine
 * @date 2024/07/17 14:51
 * @return
 */
public class Test {
    private Map<Integer, String> userMap = new HashMap<>();
    private  static final Logger logger = LoggerFactory.getLogger(Test.class);

    public void addUser(int id, String userName) {
        if (!checkIfUserExists(id)) {
            userMap.put(id, userName);
            logger.info("User added successfully");
        } else {
            logger.warn("User{} already exists",userName);
        }
    }

    private boolean checkIfUserExists(int userId) {
        return userMap.containsKey(userId);
    }

    public static void main(String[] args) {
        Test management = new Test();
        management.addUser(1, "Tom");
        management.addUser(1, "Jerry");
    }
}