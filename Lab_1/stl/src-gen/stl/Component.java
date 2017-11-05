/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Component#getServices <em>Services</em>}</li>
 *   <li>{@link stl.Component#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement, Costs {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link stl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see stl.StlPackage#getComponent_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference list.
	 * The list contents are of type {@link stl.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference list.
	 * @see stl.StlPackage#getComponent_Slot()
	 * @model required="true"
	 * @generated
	 */
	EList<Slot> getSlot();

} // Component
