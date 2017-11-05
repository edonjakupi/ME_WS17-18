/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see stl.StlPackage#getConveyor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneInputSlotConveyor OneOutputSlotConveyor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneInputSlotConveyor='self.slot -&gt;selectByType(InputSlot)-&gt; size() = 1' OneOutputSlotConveyor='self.slot -&gt;selectByType(OutputSlot)-&gt; size() = 1'"
 * @generated
 */
public interface Conveyor extends Component {
} // Conveyor
