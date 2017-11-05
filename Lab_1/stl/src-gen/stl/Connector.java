/**
 */
package stl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Connector#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link stl.Connector#getSourceComponent <em>Source Component</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameItemTypesConnectedSlots SameAreaConnector'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SameItemTypesConnectedSlots='self.sourceComponent.itemtype = self.targetComponent.itemtype' SameAreaConnector='self.Area = self.sourceComponent.Area'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Slot#getIncomingConnetor <em>Incoming Connetor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(Slot)
	 * @see stl.StlPackage#getConnector_TargetComponent()
	 * @see stl.Slot#getIncomingConnetor
	 * @model opposite="incomingConnetor" required="true"
	 * @generated
	 */
	Slot getTargetComponent();

	/**
	 * Sets the value of the '{@link stl.Connector#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	void setTargetComponent(Slot value);

	/**
	 * Returns the value of the '<em><b>Source Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Slot#getOutgoingConnector <em>Outgoing Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component</em>' reference.
	 * @see #setSourceComponent(Slot)
	 * @see stl.StlPackage#getConnector_SourceComponent()
	 * @see stl.Slot#getOutgoingConnector
	 * @model opposite="outgoingConnector" required="true"
	 * @generated
	 */
	Slot getSourceComponent();

	/**
	 * Sets the value of the '{@link stl.Connector#getSourceComponent <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component</em>' reference.
	 * @see #getSourceComponent()
	 * @generated
	 */
	void setSourceComponent(Slot value);

} // Connector
