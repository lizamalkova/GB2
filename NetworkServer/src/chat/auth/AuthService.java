package chat.auth;

import chat.User;

import java.util.List;

public interface AuthService {

    String getUsernameByLoginAndPassword(String login, String password);

}
