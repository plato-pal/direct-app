<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleIssuePolicyServiceImplProxyid" scope="session" class="bo.insurance.IssuePolicyServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleIssuePolicyServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleIssuePolicyServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleIssuePolicyServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        bo.insurance.IssuePolicyServiceImpl getIssuePolicyServiceImpl10mtemp = sampleIssuePolicyServiceImplProxyid.getIssuePolicyServiceImpl();
if(getIssuePolicyServiceImpl10mtemp == null){
%>
<%=getIssuePolicyServiceImpl10mtemp %>
<%
}else{
        if(getIssuePolicyServiceImpl10mtemp!= null){
        String tempreturnp11 = getIssuePolicyServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_2id=  request.getParameter("name22");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String email_3id=  request.getParameter("email24");
            java.lang.String email_3idTemp = null;
        if(!email_3id.equals("")){
         email_3idTemp  = email_3id;
        }
        String product_4id=  request.getParameter("product26");
        int product_4idTemp  = Integer.parseInt(product_4id);
        %>
        <jsp:useBean id="bo1insurance1IssuePolicyRequest_1id" scope="session" class="bo.insurance.IssuePolicyRequest" />
        <%
        bo1insurance1IssuePolicyRequest_1id.setName(name_2idTemp);
        bo1insurance1IssuePolicyRequest_1id.setEmail(email_3idTemp);
        bo1insurance1IssuePolicyRequest_1id.setProduct(product_4idTemp);
        bo.insurance.IssuePolicyResponse issuePolicy13mtemp = sampleIssuePolicyServiceImplProxyid.issuePolicy(bo1insurance1IssuePolicyRequest_1id);
if(issuePolicy13mtemp == null){
%>
<%=issuePolicy13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">policyNumber:</TD>
<TD>
<%
if(issuePolicy13mtemp != null){
%>
<%=issuePolicy13mtemp.getPolicyNumber()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">policyCost:</TD>
<TD>
<%
if(issuePolicy13mtemp != null){
java.math.BigDecimal typepolicyCost18 = issuePolicy13mtemp.getPolicyCost();
        String tempResultpolicyCost18 = org.eclipse.jst.ws.util.JspUtils.markup(typepolicyCost18.toString());
        %>
        <%= tempResultpolicyCost18 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>