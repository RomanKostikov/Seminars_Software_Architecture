package autService.data;

import static org.junit.Assert.*;

import autService.logic.Token;
import org.junit.Before;
import org.junit.Test;

public class AccessRepoTest {
    private AccessRepo accessRepo;
    private Token token1;
    private Token token2;

    @Before
    public void setUp() {
        accessRepo = new AccessRepo();
        token1 = new Token("token1");
        token2 = new Token("token2");
    }

    @Test
    public void testSaveToken() {
        accessRepo.saveToken(token1);
        accessRepo.saveToken(token2);

        assertEquals(token1, accessRepo.getToken("token1"));
        assertEquals(token2, accessRepo.getToken("token2"));
    }

    @Test
    public void testGetToken() {
        accessRepo.saveToken(token1);
        accessRepo.saveToken(token2);

        assertEquals(token1, accessRepo.getToken("token1"));
        assertEquals(token2, accessRepo.getToken("token2"));
    }

    @Test
    public void testGetToken_ReturnsNullWhenTokenNotExists() {
        assertNull(accessRepo.getToken("unknownToken"));
    }

    @Test
    public void testGetToken_ReturnsNullAfterTokenIsRemoved() {
        accessRepo.saveToken(token1);
        accessRepo.saveToken(token2);

        accessRepo.removeToken("token1");

        assertNull(accessRepo.getToken("token1"));
        assertEquals(token2, accessRepo.getToken("token2"));
    }

}