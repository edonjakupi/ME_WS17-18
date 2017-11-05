/**
 */
package stl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StlFactoryImpl extends EFactoryImpl implements StlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StlFactory init() {
		try {
			StlFactory theStlFactory = (StlFactory) EPackage.Registry.INSTANCE.getEFactory(StlPackage.eNS_URI);
			if (theStlFactory != null) {
				return theStlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StlPackage.PRODUCTION_LINE:
			return createProductionLine();
		case StlPackage.ITEM_TYPE:
			return createItemType();
		case StlPackage.AREA:
			return createArea();
		case StlPackage.CONNECTOR:
			return createConnector();
		case StlPackage.SERVICE:
			return createService();
		case StlPackage.CONVEYOR:
			return createConveyor();
		case StlPackage.TURN_TABLE:
			return createTurnTable();
		case StlPackage.MACHINE:
			return createMachine();
		case StlPackage.BUFFER:
			return createBuffer();
		case StlPackage.ITEM_GENERATOR:
			return createItemGenerator();
		case StlPackage.WASTE_STORE:
			return createWasteStore();
		case StlPackage.PRODUCT_STORE:
			return createProductStore();
		case StlPackage.NAMED_PARAMETER:
			return createNamedParameter();
		case StlPackage.INPUT_SLOT:
			return createInputSlot();
		case StlPackage.OUTPUT_SLOT:
			return createOutputSlot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLine createProductionLine() {
		ProductionLineImpl productionLine = new ProductionLineImpl();
		return productionLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTable createTurnTable() {
		TurnTableImpl turnTable = new TurnTableImpl();
		return turnTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemGenerator createItemGenerator() {
		ItemGeneratorImpl itemGenerator = new ItemGeneratorImpl();
		return itemGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WasteStore createWasteStore() {
		WasteStoreImpl wasteStore = new WasteStoreImpl();
		return wasteStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore createProductStore() {
		ProductStoreImpl productStore = new ProductStoreImpl();
		return productStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedParameter createNamedParameter() {
		NamedParameterImpl namedParameter = new NamedParameterImpl();
		return namedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSlot createInputSlot() {
		InputSlotImpl inputSlot = new InputSlotImpl();
		return inputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSlot createOutputSlot() {
		OutputSlotImpl outputSlot = new OutputSlotImpl();
		return outputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlPackage getStlPackage() {
		return (StlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StlPackage getPackage() {
		return StlPackage.eINSTANCE;
	}

} //StlFactoryImpl
