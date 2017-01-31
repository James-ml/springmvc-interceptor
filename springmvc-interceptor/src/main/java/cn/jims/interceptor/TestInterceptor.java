package cn.jims.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jims on 2017/2/1.
 */
public class TestInterceptor implements HandlerInterceptor {

    //Object o:表示被拦截的请求目标对象
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        /*可以修改请求和响应的编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");*/
        System.out.println("执行到了preHandle方法。。。");

        //对登陆的用户进行判断
        //获取session中的对象并判断是否存在
        if (request.getSession().getAttribute("obj")==null){
            request.setAttribute("msg","小伙子是不是还没有登录？");
            //转发到登录页面
            request.getRequestDispatcher("/login2.jsp").forward(request,response);
            //终止请求
            return false;
        }

        return true;
        //return false;请求被终止
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行到了postHandle。。。");
        modelAndView.addObject("msg","我一点也不好！");
        modelAndView.setViewName("hello");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.out.println("执行到了afterCompletion。。。");
    }
}
