package bo.insurance;

public class IssuePolicyServiceImplProxy implements bo.insurance.IssuePolicyServiceImpl {
  private String _endpoint = null;
  private bo.insurance.IssuePolicyServiceImpl issuePolicyServiceImpl = null;
  
  public IssuePolicyServiceImplProxy() {
    _initIssuePolicyServiceImplProxy();
  }
  
  public IssuePolicyServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initIssuePolicyServiceImplProxy();
  }
  
  private void _initIssuePolicyServiceImplProxy() {
    try {
      issuePolicyServiceImpl = (new bo.insurance.IssuePolicyServiceImplServiceLocator()).getIssuePolicyServiceImpl();
      if (issuePolicyServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)issuePolicyServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)issuePolicyServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (issuePolicyServiceImpl != null)
      ((javax.xml.rpc.Stub)issuePolicyServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bo.insurance.IssuePolicyServiceImpl getIssuePolicyServiceImpl() {
    if (issuePolicyServiceImpl == null)
      _initIssuePolicyServiceImplProxy();
    return issuePolicyServiceImpl;
  }
  
  public bo.insurance.IssuePolicyResponse issuePolicy(bo.insurance.IssuePolicyRequest issuePolicyRequest) throws java.rmi.RemoteException{
    if (issuePolicyServiceImpl == null)
      _initIssuePolicyServiceImplProxy();
    return issuePolicyServiceImpl.issuePolicy(issuePolicyRequest);
  }
  
  
}