package com.controller.houtai;

import com.entity.User;
import com.service.UserService;
import com.util.CreateYZMCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/admin")
public class UserManageController {

    @Autowired
    private UserService userservice;
    private User loginUser;
    @RequestMapping("/index")
    public String index() {
        return "admin/index1.jsp";
    }
    //管理员登录
//    @RequestMapping("/managerlogin")
//    @ResponseBody
//    public String Managerlogin(HttpServletRequest req,
//                               HttpServletResponse response) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String yzmcode= req.getParameter("yzmcode");
//        System.out.println("用户名："+username+"密码："+password+"验证码:"+yzmcode);
//        User user= new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        String yzm=(String)req.getSession().getAttribute("code");
//        loginUser = userservice.findUser(user);
//        if (loginUser == null) {
//            req.setAttribute("message", "用户名或密码错误，请重新登录");
//            req.getRequestDispatcher("/admin/login.jsp").forward(req, response);
//        } else if(yzm!=null && !yzm.equals(yzmcode)){
//
//            req.setAttribute("message", "验证码错误，请重新输入");
//            req.getRequestDispatcher("/admin/login.jsp").forward(req, response);
//        }
//        else {
//            req.getSession().setAttribute("loginUser", loginUser);
//            response.sendRedirect(req.getContextPath()+"/admin/index1.jsp?username="+username);
//        }
//        return req.getContextPath()+"/admin/index1.jsp?username="+username;
//
//    }
    //退出
    @RequestMapping( "/loginout")
    public String loginout(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        req.getSession().invalidate();
        return "redirect:login.jsp";
    }

//    //查看用户信息
//    @RequestMapping("/findinfo")
//    public String findinfo(HttpServletRequest request,
//                           HttpServletResponse response) {
//        HttpSession session = request.getSession();
//        String username = request.getParameter("username");
//        String tel = request.getParameter("phonenumber");
//        String email = request.getParameter("email");
//        User userByName = userservice.findUserByName(username);
//        userByName.getUserid();
//        String i = userByName.getTelphone();
//        String s = i + "";
//        String sqlTel = s + tel.substring(10, 11);
//        String sqlEamil = userByName.getEmail();
//        session.setAttribute("userByName", userByName);
//        // Integer intSqlName = Integer.parseInt(sqlName);
//        if (tel.equals(sqlTel) && email.equals(sqlEamil)) {
//            return "redirect:modifyPwd.jsp";
//        } else {
//            return "redirect:findPwd.jsp?find=notFind!";
//        }
//    }
//
//    //获取验证码
//    @RequestMapping("/createYZM")	public void createYZM(HttpServletResponse response, HttpSession session) {
//            OutputStream out = null;
//            try {
//                // 设置响应类型
//                response.setContentType("image/jpg");
//                CreateYZMCodeUtils yzm = CreateYZMCodeUtils.getInstance();
//                // 获取生成的验证码字符串
//                String code = yzm.getCreateYZMCode();
//                // 将验证码存放在session
//                session.setAttribute("code", code);
//                // 获取验证码图片
//                BufferedImage img = yzm.getCreateYZMImg(code);
//                out = response.getOutputStream();
//                // 通过ImageIO写出图片
//                ImageIO.write(img, "jpg", out);
//                out.flush();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                if (out != null) {
//                    try {
//                        out.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }

    }

