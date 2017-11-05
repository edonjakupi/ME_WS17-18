/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ProductionLine#getAreas <em>Areas</em>}</li>
 *   <li>{@link stl.ProductionLine#getItemtype <em>Itemtype</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getProductionLine()
 * @model
 * @generated
 */
public interface ProductionLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLine_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' containment reference list.
	 * The list contents are of type {@link stl.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLine_Itemtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getItemtype();

} // ProductionLine
