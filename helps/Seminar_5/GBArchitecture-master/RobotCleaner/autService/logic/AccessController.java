package autService.logic;

import autService.logic.intefaces.IAccessManager;
import autService.logic.intefaces.IAccessRepo;

public class AccessController {
    private IAccessManager accessManager;
    private IAccessRepo accessRepo;

    public AccessController(IAccessManager accessManager, IAccessRepo accessRepo) {
        this.accessManager = accessManager;
        this.accessRepo = accessRepo;
    }

    public Token getAuthToken(User user) {
        Token token = accessManager.getAuthToken(user);
        accessRepo.saveToken(token);
        return token;
    }

    public boolean checkToken(Token token) {
        return accessManager.checkToken(token);
    }
}
