/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Slot#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.Slot#getIncomingConnetor <em>Incoming Connetor</em>}</li>
 *   <li>{@link stl.Slot#getOutgoingConnector <em>Outgoing Connector</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getSlot()
 * @model abstract="true"
 * @generated
 */
public interface Slot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' reference.
	 * @see #setItemtype(ItemType)
	 * @see stl.StlPackage#getSlot_Itemtype()
	 * @model required="true"
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link stl.Slot#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

	/**
	 * Returns the value of the '<em><b>Incoming Connetor</b></em>' reference list.
	 * The list contents are of type {@link stl.Connector}.
	 * It is bidirectional and its opposite is '{@link stl.Connector#getTargetComponent <em>Target Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connetor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connetor</em>' reference list.
	 * @see stl.StlPackage#getSlot_IncomingConnetor()
	 * @see stl.Connector#getTargetComponent
	 * @model opposite="targetComponent"
	 * @generated
	 */
	EList<Connector> getIncomingConnetor();

	/**
	 * Returns the value of the '<em><b>Outgoing Connector</b></em>' reference list.
	 * The list contents are of type {@link stl.Connector}.
	 * It is bidirectional and its opposite is '{@link stl.Connector#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connector</em>' reference list.
	 * @see stl.StlPackage#getSlot_OutgoingConnector()
	 * @see stl.Connector#getSourceComponent
	 * @model opposite="sourceComponent"
	 * @generated
	 */
	EList<Connector> getOutgoingConnector();

} // Slot
