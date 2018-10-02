package scratch_ap.models;

public enum Authority {
    ADMIN("ADMIN"),
    USER("USER");

    private final String auth;

    Authority(String auth) {
        this.auth = auth;
    }

    public String getAuth() {
        return auth;
    }
}
