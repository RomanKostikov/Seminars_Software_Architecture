package autService.logic.intefaces;

import autService.logic.Token;
import autService.logic.User;

public interface IAccessManager {
    Token getAuthToken(User user);
    boolean checkToken(Token token);
}
