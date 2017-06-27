package com.devopswise.hrweb;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Hrweb_gaeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
