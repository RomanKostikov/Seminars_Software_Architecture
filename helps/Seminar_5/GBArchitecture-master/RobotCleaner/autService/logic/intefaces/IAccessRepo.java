package autService.logic.intefaces;

import autService.logic.Token;

public interface IAccessRepo {
    void saveToken(Token token);
    Token getToken(String tokenId);

    void removeToken(String token1);
}
