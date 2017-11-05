/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Area;
import stl.Component;
import stl.Connector;
import stl.NamedParameter;
import stl.Service;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.AreaImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link stl.impl.AreaImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link stl.impl.AreaImpl#getService <em>Service</em>}</li>
 *   <li>{@link stl.impl.AreaImpl#getNamedparameter <em>Namedparameter</em>}</li>
 *   <li>{@link stl.impl.AreaImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends NamedElementImpl implements Area {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getNamedparameter() <em>Namedparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedParameter> namedparameter;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, StlPackage.AREA__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this, StlPackage.AREA__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, StlPackage.AREA__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedParameter> getNamedparameter() {
		if (namedparameter == null) {
			namedparameter = new EObjectContainmentEList<NamedParameter>(NamedParameter.class, this,
					StlPackage.AREA__NAMEDPARAMETER);
		}
		return namedparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Slot>(Slot.class, this, StlPackage.AREA__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.AREA__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case StlPackage.AREA__CONNECTOR:
			return ((InternalEList<?>) getConnector()).basicRemove(otherEnd, msgs);
		case StlPackage.AREA__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case StlPackage.AREA__NAMEDPARAMETER:
			return ((InternalEList<?>) getNamedparameter()).basicRemove(otherEnd, msgs);
		case StlPackage.AREA__SLOT:
			return ((InternalEList<?>) getSlot()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.AREA__COMPONENTS:
			return getComponents();
		case StlPackage.AREA__CONNECTOR:
			return getConnector();
		case StlPackage.AREA__SERVICE:
			return getService();
		case StlPackage.AREA__NAMEDPARAMETER:
			return getNamedparameter();
		case StlPackage.AREA__SLOT:
			return getSlot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.AREA__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case StlPackage.AREA__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
			return;
		case StlPackage.AREA__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case StlPackage.AREA__NAMEDPARAMETER:
			getNamedparameter().clear();
			getNamedparameter().addAll((Collection<? extends NamedParameter>) newValue);
			return;
		case StlPackage.AREA__SLOT:
			getSlot().clear();
			getSlot().addAll((Collection<? extends Slot>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StlPackage.AREA__COMPONENTS:
			getComponents().clear();
			return;
		case StlPackage.AREA__CONNECTOR:
			getConnector().clear();
			return;
		case StlPackage.AREA__SERVICE:
			getService().clear();
			return;
		case StlPackage.AREA__NAMEDPARAMETER:
			getNamedparameter().clear();
			return;
		case StlPackage.AREA__SLOT:
			getSlot().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StlPackage.AREA__COMPONENTS:
			return components != null && !components.isEmpty();
		case StlPackage.AREA__CONNECTOR:
			return connector != null && !connector.isEmpty();
		case StlPackage.AREA__SERVICE:
			return service != null && !service.isEmpty();
		case StlPackage.AREA__NAMEDPARAMETER:
			return namedparameter != null && !namedparameter.isEmpty();
		case StlPackage.AREA__SLOT:
			return slot != null && !slot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AreaImpl
