package scratch.manager;

import scratch.user.UserDto;

public interface UserUiManager {

    UserDto getUserByUsername(String username);
}
