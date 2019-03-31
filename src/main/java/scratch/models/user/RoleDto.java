package scratch.models.user;

public enum RoleDto {
    ADMIN("ADMIN"),
    USER("USER");

    private final String roleName;

    RoleDto(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
