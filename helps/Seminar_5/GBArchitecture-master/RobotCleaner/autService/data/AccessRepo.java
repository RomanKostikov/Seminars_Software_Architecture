package autService.data;

import autService.logic.Token;
import autService.logic.intefaces.IAccessRepo;

import java.util.HashMap;
import java.util.Map;

public class AccessRepo implements IAccessRepo {
    private Map<String, Token> tokenStorage = new HashMap<>();

    @Override
    public void saveToken(Token token) {
        tokenStorage.put(token.getId(), token);
    }

    @Override
    public Token getToken(String tokenId) {
        return tokenStorage.get(tokenId);
    }

    @Override
    public void removeToken(String token1) {
        tokenStorage.remove(token1);
    }
}
