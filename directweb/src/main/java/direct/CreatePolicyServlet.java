package direct;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.insurance.IssuePolicyRequest;
import bo.insurance.IssuePolicyResponse;
import bo.insurance.IssuePolicyServiceImplProxy;

/**
 * Servlet implementation class CreatePolicyServlet
 */
public class CreatePolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IssuePolicyServiceImplProxy issuePolicyServiceImplProxy = new IssuePolicyServiceImplProxy();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Thank you. We are processing your request");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String product = request.getParameter("products");
		
			IssuePolicyResponse issuePolicyResponse = issuePolicyServiceImplProxy.issuePolicy(new IssuePolicyRequest(email, name, product));
			if (issuePolicyResponse!=null && issuePolicyResponse.getPolicyNumber()!=null && issuePolicyResponse.getPolicyCost()!=null) {
				request.setAttribute("policyNum", issuePolicyResponse.getPolicyNumber());
				request.setAttribute("policyCost", issuePolicyResponse.getPolicyCost());
				request.getRequestDispatcher("success.jsp").forward(request, response);
			}else {
				request.setAttribute("errors", "Something went wrong! Please try again.");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			request.setAttribute("errors", e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
