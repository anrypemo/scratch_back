package scratch.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scratch.manager.UserUiManager;
import scratch.services.UserUiService;
import scratch.services.models.Users;
import scratch.user.UserDto;

@Service
public class UserUiManagerImpl implements UserUiManager {

    @Autowired
    private UserUiService userUiService;

    @Override
    public UserDto getUserByUsername(String username) {
        Users user = this.userUiService.getUserByUsername(username);
        UserDto userUi = new UserDto();
        userUi.setUsername(user.getUsername());
        userUi.setEmail(user.getEmail());
        userUi.setLastName(user.getLastName());
        userUi.setFirstName(user.getFirstName());
        return userUi;
    }
}
