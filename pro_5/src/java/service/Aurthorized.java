package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Aurthorized 
{
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    public Aurthorized(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session=request.getSession(false);
    }
    
    public boolean isValid()throws Exception
    {
        if(session!=null)
             return true;
        return false;
    }
    
    public boolean isAdmin()throws Exception
    {
        if(session==null)
            return false;
        String s=session.getAttribute("lavel").toString();
        if(s.equals("admin"))
            return true;
        return false;
    }
    
    public void logout()throws Exception
    {
            session.invalidate();
            session=null;
            response.sendRedirect("login.html");
    }
            
    
}
