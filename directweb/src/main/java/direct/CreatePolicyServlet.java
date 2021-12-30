package direct;

import java.io.IOException;

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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String product = request.getParameter("products");
		IssuePolicyResponse issuePolicyResponse = issuePolicyServiceImplProxy.issuePolicy(new IssuePolicyRequest(email, name, product));
		response.getWriter().append(String.format("Congratulations: Policy with number %s was awarded for $%s!", issuePolicyResponse.getPolicyNumber(), issuePolicyResponse.getPolicyCost()));
	}

}
