package autService.adapter;

import autService.logic.Token;
import autService.logic.User;
import autService.logic.intefaces.IAccessManager;

public class AccessManager implements IAccessManager {
    public Token getAuthToken(User user) {
        // код для генерации и возврата токена
        return null;
    }

    public boolean checkToken(Token token) {
        //код для проверки валидности токена
        return false;
    }
}
