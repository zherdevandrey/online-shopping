package web.net.exceptions;

import javax.enterprise.inject.Model;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		System.out.println("test");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle","This page is not constructed");
		mv.addObject("errorDescription","This page is not available now");
		mv.addObject("title","404 Error Page");
		return mv;
	}
//	@ExceptionHandler(ProductNotFoundException.class)
//	public ModelAndView handlerProductNotFoundException() {
//		System.out.println("test");
//		ModelAndView mv = new ModelAndView("error");
//		mv.addObject("errorTitle","Product not available");
//		mv.addObject("errorDescription","This product is not available now");
//		mv.addObject("title","Product unavailable");
//		return mv;
//	}
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		System.out.println("test");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle","Please contact your arministrator");
		mv.addObject("errorDescription",ex.getMessage());
		mv.addObject("title","Error");
		return mv;
	}
}
