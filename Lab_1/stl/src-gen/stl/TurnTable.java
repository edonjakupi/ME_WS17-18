/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Table</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see stl.StlPackage#getTurnTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneInputSlotTurnTable AtLeastOneOutputSlotTurnTable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtLeastOneInputSlotTurnTable='self.slot -&gt;selectByType(InputSlot)-&gt; size() &gt;= 1' AtLeastOneOutputSlotTurnTable='self.slot -&gt;selectByType(OutputSlot)-&gt; size() &gt;= 1'"
 * @generated
 */
public interface TurnTable extends Component {
} // TurnTable
