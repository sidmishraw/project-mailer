package web.com.sidmishraw.mailer.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sidmishraw on 1/19/17.
 */
public class MailerMultiActionController extends MultiActionController {


    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("Welcome");
    }
}
