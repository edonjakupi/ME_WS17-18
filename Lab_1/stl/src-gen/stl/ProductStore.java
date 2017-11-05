/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see stl.StlPackage#getProductStore()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneInputSlotProductStore NoOutputSlotProductStore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneInputSlotProductStore='self.slot -&gt;selectByType(InputSlot)-&gt; size() = 1' NoOutputSlotProductStore='self.slot -&gt;selectByType(OutputSlot)-&gt; size() = 0'"
 * @generated
 */
public interface ProductStore extends Store {
} // ProductStore
