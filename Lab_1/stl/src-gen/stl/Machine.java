/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see stl.StlPackage#getMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneInputSlotMachine AtLeastOneOutputSlotMachine'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtLeastOneInputSlotMachine='self.slot -&gt;selectByType(InputSlot)-&gt; size() &gt;= 1' AtLeastOneOutputSlotMachine='self.slot -&gt;selectByType(OutputSlot)-&gt; size() &gt;= 1'"
 * @generated
 */
public interface Machine extends Component {
} // Machine
