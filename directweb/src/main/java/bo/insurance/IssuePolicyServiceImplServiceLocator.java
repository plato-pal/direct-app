/**
 * IssuePolicyServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bo.insurance;

public class IssuePolicyServiceImplServiceLocator extends org.apache.axis.client.Service implements bo.insurance.IssuePolicyServiceImplService {

    public IssuePolicyServiceImplServiceLocator() {
    }


    public IssuePolicyServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IssuePolicyServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IssuePolicyServiceImpl
    private java.lang.String IssuePolicyServiceImpl_address = "http://localhost:8080/boInsurance/services/IssuePolicyServiceImpl";

    public java.lang.String getIssuePolicyServiceImplAddress() {
        return IssuePolicyServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IssuePolicyServiceImplWSDDServiceName = "IssuePolicyServiceImpl";

    public java.lang.String getIssuePolicyServiceImplWSDDServiceName() {
        return IssuePolicyServiceImplWSDDServiceName;
    }

    public void setIssuePolicyServiceImplWSDDServiceName(java.lang.String name) {
        IssuePolicyServiceImplWSDDServiceName = name;
    }

    public bo.insurance.IssuePolicyServiceImpl getIssuePolicyServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IssuePolicyServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIssuePolicyServiceImpl(endpoint);
    }

    public bo.insurance.IssuePolicyServiceImpl getIssuePolicyServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bo.insurance.IssuePolicyServiceImplSoapBindingStub _stub = new bo.insurance.IssuePolicyServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getIssuePolicyServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIssuePolicyServiceImplEndpointAddress(java.lang.String address) {
        IssuePolicyServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bo.insurance.IssuePolicyServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                bo.insurance.IssuePolicyServiceImplSoapBindingStub _stub = new bo.insurance.IssuePolicyServiceImplSoapBindingStub(new java.net.URL(IssuePolicyServiceImpl_address), this);
                _stub.setPortName(getIssuePolicyServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IssuePolicyServiceImpl".equals(inputPortName)) {
            return getIssuePolicyServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://insurance.bo", "IssuePolicyServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://insurance.bo", "IssuePolicyServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IssuePolicyServiceImpl".equals(portName)) {
            setIssuePolicyServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
