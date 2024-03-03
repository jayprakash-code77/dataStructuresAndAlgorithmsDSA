package dataStructuresAndAlgorithmsDSA.DesignPatterns.BehavioralDesignPatterns;

import java.util.HashMap;
import java.util.Map;

// Database class
class Database {
    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin_username", "admin_password");
        users.put("user_username", "user_password");
        users.put("jay", "maurya8097");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.getOrDefault(username, "").equals(password);
    }
}

// Abstract Handler class
abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next != null) {
            return next.handle(username, password);
        }
        return true;
    }
}

// Concrete handler classes
// Concrete handler classes
class UserExistsHandler extends Handler {
    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered!");
            System.out.println("Sign up to our app now!");
            return false; // User not found, authentication failed
        }
        return handleNext(username, password);
    }
}

class ValidPasswordHandler extends Handler {
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password!");
            return false;
        }
        return handleNext(username, password);
    }
}

class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading admin page.");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(username, password);
    }
}

// Authentication class
class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authorization was successful!");
            return true;
        }
        return false;
    }
}

public class ChainOfResposibility_Pattern {

    public static void main(String[] args) {
        Database database = new Database();
        Handler handlerChain = new UserExistsHandler(database);
        handlerChain.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handlerChain);
        authService.logIn("user_username", "user_password");
        authService.logIn("admin_username", "admin_password");
        authService.logIn("ja", "maurya8097");
    }

}