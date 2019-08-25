package cn.edu.ecut.store.web.servlet;

import cn.edu.ecut.store.domain.User;
import cn.edu.ecut.store.service.UserService;
import cn.edu.ecut.store.service.serviceImp.UserServiceImp;
import cn.edu.ecut.store.utils.MyBeanUtils;
import cn.edu.ecut.store.utils.UUIDUtils;
import cn.edu.ecut.store.web.base.BaseServlet;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserServlet extends BaseServlet {


    public String registUI(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "/jsp/register.jsp";
    }

    public String userRegist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受数据
        Map<String, String[]> map = request.getParameterMap();

        User user = new User();
        MyBeanUtils.populate(user , map);
        user.setUid(UUIDUtils.getId());
        user.setState(0);
        user.setCode(UUIDUtils.getCode());


        System.out.println(user);


    //遍历map中的数据
        /*Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            String[] strings = map.get(str);
            for (String s:
                 strings) {
                System.out.println(s);
            }
            System.out.println();
        }*/

        //调用业务层的功能
        UserService userService = new UserServiceImp();

        try {
            userService.userRegist(user);
            request.setAttribute("msg" , "用户注册成功,请激活!");
        } catch (Exception e) {
            request.setAttribute("msg" , "用户注册失败,请重新注册!");
        }

        return "/jsp/info.jsp";
    }

}
