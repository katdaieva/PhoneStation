package com.phonestation.view;

import com.phonestation.commands.*;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    private static final Map<String, Command> commands = new HashMap<>();

    static {
/*        urls.put("POST:/profile", Profile.getInstance());
        urls.put("POST:/users", Users.getInstance());
        urls.put("POST:/new_users", NewUsers.getInstance());
        urls.put("POST:/debtors", Debtors.getInstance());
        urls.put("POST:/add_user", AddUser.getInstance());
        urls.put("POST:/delete_user", DeleteUser.getInstance());
        urls.put("POST:/bills", Bills.getInstance());
        urls.put("POST:/login", Login.getInstance());
        urls.put("POST:/logout", Logout.getInstance());
        urls.put("POST:/registration", Registration.getInstance());
        urls.put("POST:/services", Services.getInstance());
        urls.put("POST:/replenish", Replenish.getInstance());
        urls.put("POST:/pay", Pay.getInstance());*/

//        commands.put("/station/replenish", new Replenish());
        commands.put("/station/add_user", new AddUser());
        commands.put("/station/block_user", new BlockUser());
//        commands.put("/station/debtors", new Debtors());
        commands.put("/station/delete_user", new DeleteUser());
//        commands.put("/station/bills", new Bills());
        commands.put("/station/login", new Login());
        commands.put("/station/logout", new Logout());
        commands.put("/station/new_users", new NewUsers());
//        commands.put("/station/pay", new Pay());
        commands.put("/station/profile", new Profile());
//        commands.put("/station/registration", new Registration());
//        commands.put("/station/services", new Services());
//        commands.put("/station/switch_off_service", new SwitchOffService());
//        commands.put("/station/switch_on_service", new SwitchOnService());
//        commands.put("/station/successful_registration", new SuccessfulRegistration());
//        commands.put("/station/unblock_user", new UnblockUser());
//        commands.put("/station/user_bills", new UserBills());
        commands.put("/station/users", new Users());
    }

    public Command getCommand(String uri) {
        return commands.get(uri);
    }

}
