/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.authentication;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;

/**
 *
 * @author sonnt
 */

public abstract class BaseRequiredAuthenticationController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest request) {
        Account account = (Account) request.getSession().getAttribute("account");
        return account != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthenticated(req))
        {
            //do business
            doPost(req, resp, (Account) req.getSession().getAttribute("account"));
        }
        else
        {
            resp.getWriter().println("access denied!");
        }
    }
    
     protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthenticated(req))
        {
            //do business
            doGet(req, resp, (Account) req.getSession().getAttribute("account"));
        }
        else
        {
            resp.getWriter().println("access denied!");
        }
    }
    protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;

}
