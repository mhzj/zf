package com.controller;

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
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private UserService userservice;

    private User loginUser;

    @RequestMapping("/register")
    public String register(HttpServletRequest req, HttpServletResponse response)
            throws IOException, ServletException {
        String url = "";
        User existUser = userservice.findUserByName(req.getParameter("username"));
        if (null != existUser) {
            req.getSession().setAttribute("mesg1", "用户已存在!");
            return "admin/register.jsp";
        }
        User u = new User();
        u.setInstitutionname(req.getParameter("institutionname"));
        u.setCertificatetype(req.getParameter("certificatetype"));
        u.setReviewdepartment(req.getParameter("reviewdepartment"));
        u.setUsername(req.getParameter("username"));
        u.setPassword(req.getParameter("password"));
        u.setContactpersonname(req.getParameter("contactpersonname"));
        u.setTelphone(req.getParameter("telphone"));
        u.setEmail(req.getParameter("email"));
        u.setRoleid(3);
        int i = userservice.addUser(u);
        String yzm = (String) req.getSession().getAttribute("code");
        if (yzm != null && !yzm.equals(req.getParameter("yzmcode"))) {
            req.setAttribute("message", "验证码错误，请重新输入");
            req.getRequestDispatcher("admin/login.jsp").forward(req, response);
        } else {
            if (i > 0) {
                url = "admin/login.jsp";
            } else
                url = "admin/register.jsp";
        }
        return url;
    }
        //项目责任单位登录
        @RequestMapping("/login")
        public String login(HttpServletRequest req) {
            User user= new User();
            user.setUsername(req.getParameter("username"));
            user.setPassword(req.getParameter("password"));
            String yzm=(String)req.getSession().getAttribute("code");
            loginUser = userservice.findUser(user);
            if (loginUser == null) {
                req.setAttribute("message", "用户名或密码错误，请重新登录");
                return "admin/login.jsp";
            } else if(yzm!=null && !yzm.equals(req.getParameter("yzmcode"))){
                req.setAttribute("message", "验证码错误，请重新输入");
                return "admin/login.jsp";
            }
            else {
                req.getSession().setAttribute("loginUser", loginUser);
                if(loginUser.getRoleid()==3)
                    return "admin/index1.jsp";
                else if (loginUser.getRoleid()==2)
                    return "manager/index2.jsp";
                else
                    return "city/index3.jsp";
            }
        }
        //退出
        @RequestMapping( "/loginout")
        public String loginout(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
            req.getSession().invalidate();
            return "redirect:login.jsp";
        }
        //查看用户信息
        @RequestMapping("/findinfo")
        public String findinfo(HttpServletRequest req) {
            req.getSession().setAttribute("loginUser", loginUser);
            return  "admin/userinfo.jsp";
        }
        //修改密码
        @RequestMapping("updatepassword")
        public String updatepassword(HttpServletRequest request){
        if (!request.getParameter("password").equals(loginUser.getPassword())){
            request.getSession().setAttribute("message","原密码输入错误，请重新输入");
        }else if(!request.getParameter("newpassword").equals(request.getParameter("confirmpassword"))){
                request.getSession().setAttribute("message","新密码与确认密码不一致，请重新输入");
        }else{
            loginUser.setPassword(request.getParameter("newpassword"));
            int h=userservice.update(loginUser);
            request.getSession().setAttribute("message","修改密码成功");
            }
            if(loginUser.getRoleid()==3)
                return "admin/index1.jsp";
            else if (loginUser.getRoleid()==2)
                return "manager/index2.jsp";
            else
                return "city/index3.jsp";
        }

        //获取验证码
        @RequestMapping("/createYZM")	public void createYZM(HttpServletResponse response, HttpSession session) {
            OutputStream out = null;
            try {
                // 设置响应类型
                response.setContentType("image/jpg");
                CreateYZMCodeUtils yzm = CreateYZMCodeUtils.getInstance();
                // 获取生成的验证码字符串
                String code = yzm.getCreateYZMCode();
                // 将验证码存放在session
                session.setAttribute("code", code);
                // 获取验证码图片
                BufferedImage img = yzm.getCreateYZMImg(code);
                out = response.getOutputStream();
                // 通过ImageIO写出图片
                ImageIO.write(img, "jpg", out);
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

}

