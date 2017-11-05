/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ItemGenerator#getItemtypes <em>Itemtypes</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getItemGenerator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoInputSlotItemGenerator OneOutputSlotItemGenerator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoInputSlotItemGenerator='self.slot -&gt;selectByType(InputSlot)-&gt; size() = 0' OneOutputSlotItemGenerator='self.slot -&gt;selectByType(OutputSlot)-&gt; size() = 1'"
 * @generated
 */
public interface ItemGenerator extends Component {
	/**
	 * Returns the value of the '<em><b>Itemtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtypes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtypes</em>' reference.
	 * @see #setItemtypes(ItemType)
	 * @see stl.StlPackage#getItemGenerator_Itemtypes()
	 * @model required="true"
	 * @generated
	 */
	ItemType getItemtypes();

	/**
	 * Sets the value of the '{@link stl.ItemGenerator#getItemtypes <em>Itemtypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtypes</em>' reference.
	 * @see #getItemtypes()
	 * @generated
	 */
	void setItemtypes(ItemType value);

} // ItemGenerator
