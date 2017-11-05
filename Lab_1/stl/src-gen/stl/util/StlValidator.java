/**
 */
package stl.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public class StlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StlValidator INSTANCE = new StlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "stl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return StlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case StlPackage.PRODUCTION_LINE:
			return validateProductionLine((ProductionLine) value, diagnostics, context);
		case StlPackage.ITEM_TYPE:
			return validateItemType((ItemType) value, diagnostics, context);
		case StlPackage.AREA:
			return validateArea((Area) value, diagnostics, context);
		case StlPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case StlPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case StlPackage.CONNECTOR:
			return validateConnector((Connector) value, diagnostics, context);
		case StlPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case StlPackage.CONVEYOR:
			return validateConveyor((Conveyor) value, diagnostics, context);
		case StlPackage.TURN_TABLE:
			return validateTurnTable((TurnTable) value, diagnostics, context);
		case StlPackage.MACHINE:
			return validateMachine((Machine) value, diagnostics, context);
		case StlPackage.BUFFER:
			return validateBuffer((Buffer) value, diagnostics, context);
		case StlPackage.ITEM_GENERATOR:
			return validateItemGenerator((ItemGenerator) value, diagnostics, context);
		case StlPackage.WASTE_STORE:
			return validateWasteStore((WasteStore) value, diagnostics, context);
		case StlPackage.PRODUCT_STORE:
			return validateProductStore((ProductStore) value, diagnostics, context);
		case StlPackage.STORE:
			return validateStore((Store) value, diagnostics, context);
		case StlPackage.COSTS:
			return validateCosts((Costs) value, diagnostics, context);
		case StlPackage.NAMED_PARAMETER:
			return validateNamedParameter((NamedParameter) value, diagnostics, context);
		case StlPackage.SLOT:
			return validateSlot((Slot) value, diagnostics, context);
		case StlPackage.INPUT_SLOT:
			return validateInputSlot((InputSlot) value, diagnostics, context);
		case StlPackage.OUTPUT_SLOT:
			return validateOutputSlot((OutputSlot) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductionLine(ProductionLine productionLine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productionLine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(area, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_SameItemTypesConnectedSlots(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_SameAreaConnector(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameItemTypesConnectedSlots constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__SAME_ITEM_TYPES_CONNECTED_SLOTS__EEXPRESSION = "self.sourceComponent.itemtype = self.targetComponent.itemtype";

	/**
	 * Validates the SameItemTypesConnectedSlots constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_SameItemTypesConnectedSlots(Connector connector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTOR, connector, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SameItemTypesConnectedSlots",
				CONNECTOR__SAME_ITEM_TYPES_CONNECTED_SLOTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SameAreaConnector constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__SAME_AREA_CONNECTOR__EEXPRESSION = "self.Area = self.sourceComponent.Area";

	/**
	 * Validates the SameAreaConnector constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_SameAreaConnector(Connector connector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTOR, connector, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SameAreaConnector",
				CONNECTOR__SAME_AREA_CONNECTOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conveyor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConveyor_OneInputSlotConveyor(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConveyor_OneOutputSlotConveyor(conveyor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlotConveyor constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONVEYOR__ONE_INPUT_SLOT_CONVEYOR__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() = 1";

	/**
	 * Validates the OneInputSlotConveyor constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor_OneInputSlotConveyor(Conveyor conveyor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONVEYOR, conveyor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneInputSlotConveyor",
				CONVEYOR__ONE_INPUT_SLOT_CONVEYOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OneOutputSlotConveyor constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONVEYOR__ONE_OUTPUT_SLOT_CONVEYOR__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() = 1";

	/**
	 * Validates the OneOutputSlotConveyor constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor_OneOutputSlotConveyor(Conveyor conveyor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONVEYOR, conveyor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneOutputSlotConveyor",
				CONVEYOR__ONE_OUTPUT_SLOT_CONVEYOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable(TurnTable turnTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnTable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTurnTable_AtLeastOneInputSlotTurnTable(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTurnTable_AtLeastOneOutputSlotTurnTable(turnTable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneInputSlotTurnTable constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_TABLE__AT_LEAST_ONE_INPUT_SLOT_TURN_TABLE__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() >= 1";

	/**
	 * Validates the AtLeastOneInputSlotTurnTable constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable_AtLeastOneInputSlotTurnTable(TurnTable turnTable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.TURN_TABLE, turnTable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AtLeastOneInputSlotTurnTable",
				TURN_TABLE__AT_LEAST_ONE_INPUT_SLOT_TURN_TABLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AtLeastOneOutputSlotTurnTable constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_TABLE__AT_LEAST_ONE_OUTPUT_SLOT_TURN_TABLE__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() >= 1";

	/**
	 * Validates the AtLeastOneOutputSlotTurnTable constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable_AtLeastOneOutputSlotTurnTable(TurnTable turnTable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.TURN_TABLE, turnTable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AtLeastOneOutputSlotTurnTable",
				TURN_TABLE__AT_LEAST_ONE_OUTPUT_SLOT_TURN_TABLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMachine_AtLeastOneInputSlotMachine(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMachine_AtLeastOneOutputSlotMachine(machine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneInputSlotMachine constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MACHINE__AT_LEAST_ONE_INPUT_SLOT_MACHINE__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() >= 1";

	/**
	 * Validates the AtLeastOneInputSlotMachine constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_AtLeastOneInputSlotMachine(Machine machine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.MACHINE, machine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AtLeastOneInputSlotMachine",
				MACHINE__AT_LEAST_ONE_INPUT_SLOT_MACHINE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AtLeastOneOutputSlotMachine constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MACHINE__AT_LEAST_ONE_OUTPUT_SLOT_MACHINE__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() >= 1";

	/**
	 * Validates the AtLeastOneOutputSlotMachine constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_AtLeastOneOutputSlotMachine(Machine machine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.MACHINE, machine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AtLeastOneOutputSlotMachine",
				MACHINE__AT_LEAST_ONE_OUTPUT_SLOT_MACHINE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buffer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBuffer_OneInputSlotBuffer(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBuffer_OneOutputSlotBuffer(buffer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlotBuffer constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUFFER__ONE_INPUT_SLOT_BUFFER__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() = 1";

	/**
	 * Validates the OneInputSlotBuffer constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer_OneInputSlotBuffer(Buffer buffer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.BUFFER, buffer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneInputSlotBuffer",
				BUFFER__ONE_INPUT_SLOT_BUFFER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OneOutputSlotBuffer constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUFFER__ONE_OUTPUT_SLOT_BUFFER__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() = 1";

	/**
	 * Validates the OneOutputSlotBuffer constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer_OneOutputSlotBuffer(Buffer buffer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.BUFFER, buffer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneOutputSlotBuffer",
				BUFFER__ONE_OUTPUT_SLOT_BUFFER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator(ItemGenerator itemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemGenerator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGenerator_NoInputSlotItemGenerator(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGenerator_OneOutputSlotItemGenerator(itemGenerator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoInputSlotItemGenerator constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__NO_INPUT_SLOT_ITEM_GENERATOR__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() = 0";

	/**
	 * Validates the NoInputSlotItemGenerator constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_NoInputSlotItemGenerator(ItemGenerator itemGenerator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_GENERATOR, itemGenerator, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoInputSlotItemGenerator",
				ITEM_GENERATOR__NO_INPUT_SLOT_ITEM_GENERATOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OneOutputSlotItemGenerator constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__ONE_OUTPUT_SLOT_ITEM_GENERATOR__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() = 1";

	/**
	 * Validates the OneOutputSlotItemGenerator constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_OneOutputSlotItemGenerator(ItemGenerator itemGenerator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_GENERATOR, itemGenerator, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneOutputSlotItemGenerator",
				ITEM_GENERATOR__ONE_OUTPUT_SLOT_ITEM_GENERATOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wasteStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWasteStore_OneInputSlotWasteStore(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWasteStore_NoOutputSlotWasteStore(wasteStore, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlotWasteStore constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASTE_STORE__ONE_INPUT_SLOT_WASTE_STORE__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() = 1";

	/**
	 * Validates the OneInputSlotWasteStore constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore_OneInputSlotWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.WASTE_STORE, wasteStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneInputSlotWasteStore",
				WASTE_STORE__ONE_INPUT_SLOT_WASTE_STORE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NoOutputSlotWasteStore constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASTE_STORE__NO_OUTPUT_SLOT_WASTE_STORE__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() = 0";

	/**
	 * Validates the NoOutputSlotWasteStore constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore_NoOutputSlotWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.WASTE_STORE, wasteStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoOutputSlotWasteStore",
				WASTE_STORE__NO_OUTPUT_SLOT_WASTE_STORE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductStore_OneInputSlotProductStore(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductStore_NoOutputSlotProductStore(productStore, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlotProductStore constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_STORE__ONE_INPUT_SLOT_PRODUCT_STORE__EEXPRESSION = "self.slot ->selectByType(InputSlot)-> size() = 1";

	/**
	 * Validates the OneInputSlotProductStore constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore_OneInputSlotProductStore(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.PRODUCT_STORE, productStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneInputSlotProductStore",
				PRODUCT_STORE__ONE_INPUT_SLOT_PRODUCT_STORE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NoOutputSlotProductStore constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_STORE__NO_OUTPUT_SLOT_PRODUCT_STORE__EEXPRESSION = "self.slot ->selectByType(OutputSlot)-> size() = 0";

	/**
	 * Validates the NoOutputSlotProductStore constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore_NoOutputSlotProductStore(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.PRODUCT_STORE, productStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoOutputSlotProductStore",
				PRODUCT_STORE__NO_OUTPUT_SLOT_PRODUCT_STORE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(store, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCosts(Costs costs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedParameter(NamedParameter namedParameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSlot(InputSlot inputSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSlot(OutputSlot outputSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputSlot, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StlValidator
