/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Service#getReliability <em>Reliability</em>}</li>
 *   <li>{@link stl.Service#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link stl.Service#getNamedparameter <em>Namedparameter</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement, Costs {
	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see stl.StlPackage#getService_Reliability()
	 * @model required="true"
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link stl.Service#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' attribute.
	 * @see #setProcessingTime(double)
	 * @see stl.StlPackage#getService_ProcessingTime()
	 * @model required="true"
	 * @generated
	 */
	double getProcessingTime();

	/**
	 * Sets the value of the '{@link stl.Service#getProcessingTime <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' attribute.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(double value);

	/**
	 * Returns the value of the '<em><b>Namedparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namedparameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedparameter</em>' reference.
	 * @see #setNamedparameter(NamedParameter)
	 * @see stl.StlPackage#getService_Namedparameter()
	 * @model
	 * @generated
	 */
	NamedParameter getNamedparameter();

	/**
	 * Sets the value of the '{@link stl.Service#getNamedparameter <em>Namedparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namedparameter</em>' reference.
	 * @see #getNamedparameter()
	 * @generated
	 */
	void setNamedparameter(NamedParameter value);

} // Service
