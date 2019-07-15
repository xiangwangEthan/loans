package aaa.microfinance.com.hujun.service;

import aaa.microfinance.com.hujun.bean.UserBean;
import aaa.microfinance.com.hujun.utils.ReturnModel;

public interface UserRegirestService {
    Integer userregirest(UserBean userBean);
    ReturnModel userlogin(String username, String password);
}
