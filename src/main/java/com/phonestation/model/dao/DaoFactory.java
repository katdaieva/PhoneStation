package com.phonestation.model.dao;

import com.phonestation.utils.Config;

public abstract class DaoFactory {
    public abstract AccountDao createAccountDAO();
    public abstract BillDao createBillDAO();
    public abstract ServicesDao createServiceDAO();
    public abstract UserDao createUserDAO();

    public static DaoFactory getInstanse() {
        String className = Config.getInstance().getFactoryClassName();
        DaoFactory factory = null;
        try {
            factory = (DaoFactory) Class.forName(className).newInstance();
        } catch (Exception  e) {
            e.printStackTrace();
        }
        return factory;
    }
}
