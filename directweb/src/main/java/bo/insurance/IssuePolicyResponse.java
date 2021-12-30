/**
 * IssuePolicyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bo.insurance;

public class IssuePolicyResponse  implements java.io.Serializable {
    private java.math.BigDecimal policyCost;

    private int policyNumber;

    public IssuePolicyResponse() {
    }

    public IssuePolicyResponse(
           java.math.BigDecimal policyCost,
           int policyNumber) {
           this.policyCost = policyCost;
           this.policyNumber = policyNumber;
    }


    /**
     * Gets the policyCost value for this IssuePolicyResponse.
     * 
     * @return policyCost
     */
    public java.math.BigDecimal getPolicyCost() {
        return policyCost;
    }


    /**
     * Sets the policyCost value for this IssuePolicyResponse.
     * 
     * @param policyCost
     */
    public void setPolicyCost(java.math.BigDecimal policyCost) {
        this.policyCost = policyCost;
    }


    /**
     * Gets the policyNumber value for this IssuePolicyResponse.
     * 
     * @return policyNumber
     */
    public int getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this IssuePolicyResponse.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssuePolicyResponse)) return false;
        IssuePolicyResponse other = (IssuePolicyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyCost==null && other.getPolicyCost()==null) || 
             (this.policyCost!=null &&
              this.policyCost.equals(other.getPolicyCost()))) &&
            this.policyNumber == other.getPolicyNumber();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPolicyCost() != null) {
            _hashCode += getPolicyCost().hashCode();
        }
        _hashCode += getPolicyNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssuePolicyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://insurance.bo", "IssuePolicyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://insurance.bo", "policyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://insurance.bo", "policyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
