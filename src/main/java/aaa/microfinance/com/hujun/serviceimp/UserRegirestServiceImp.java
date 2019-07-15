package aaa.microfinance.com.hujun.serviceimp;

import aaa.microfinance.com.hujun.bean.UserBean;
import aaa.microfinance.com.hujun.dao.UserRegirestDao;
import aaa.microfinance.com.hujun.service.UserRegirestService;
import aaa.microfinance.com.hujun.utils.ReturnModel;
import aaa.microfinance.com.hujun.utils.SessionUtils;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.util.SessionState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
@Transactional
public class UserRegirestServiceImp  implements UserRegirestService {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private ReturnModel returnModel;
    @Autowired
    private UserRegirestDao userRegirestDao;
    @Override
    public Integer userregirest(UserBean userBean) {
        return userRegirestDao.userregirest (userBean);
    }

    @Override
    public ReturnModel userlogin(String username, String password) {
        UserBean userlogin = userRegirestDao.userlogin (username, password);
        HttpSession session = SessionUtils.getsession (request);
        if(userlogin!=null){
            session.setAttribute ("userinfo",userlogin);
            returnModel.setCode (200);
            returnModel.setMessage ("登陆成功");
            returnModel.setStatus (true);
            returnModel.setObject (userlogin);
        }else{
            returnModel.setCode (250);
            returnModel.setMessage ("账户或密码不正确，请重新输入");
            returnModel.setStatus (false);
        }
        return returnModel;

    }
}
