package it.unibs.ing.se.mvcdistilled;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unibs.ing.se.mvcdistilled.model.Counter;

public class CounterServlet extends HttpServlet {
	private static final Counter counter = new Counter();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		counter.increment();
		request.setAttribute("counterValue", counter.getValue());
		try {
			getServletContext().getRequestDispatcher("/WEB-INF/counter.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
