package autService.logic;

import java.util.Date;

public class Token {
    private String id;
    private String value;
    private Date expirationDate;

    public Token(String id) {
        this.id = id;
    }

    public Token(String id, String value, Date expirationDate) {
        this.id = id;
        this.value = value;
        this.expirationDate = expirationDate;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
