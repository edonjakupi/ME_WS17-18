/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waste Store</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see stl.StlPackage#getWasteStore()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneInputSlotWasteStore NoOutputSlotWasteStore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneInputSlotWasteStore='self.slot -&gt;selectByType(InputSlot)-&gt; size() = 1' NoOutputSlotWasteStore='self.slot -&gt;selectByType(OutputSlot)-&gt; size() = 0'"
 * @generated
 */
public interface WasteStore extends Store {
} // WasteStore
