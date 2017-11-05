/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Area;
import stl.ItemType;
import stl.ProductionLine;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ProductionLineImpl#getAreas <em>Areas</em>}</li>
 *   <li>{@link stl.impl.ProductionLineImpl#getItemtype <em>Itemtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineImpl extends MinimalEObjectImpl.Container implements ProductionLine {
	/**
	 * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> areas;

	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> itemtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.PRODUCTION_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getAreas() {
		if (areas == null) {
			areas = new EObjectContainmentEList<Area>(Area.class, this, StlPackage.PRODUCTION_LINE__AREAS);
		}
		return areas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItemtype() {
		if (itemtype == null) {
			itemtype = new EObjectContainmentEList<ItemType>(ItemType.class, this,
					StlPackage.PRODUCTION_LINE__ITEMTYPE);
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.PRODUCTION_LINE__AREAS:
			return ((InternalEList<?>) getAreas()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE__ITEMTYPE:
			return ((InternalEList<?>) getItemtype()).basicRemove(otherEnd, msgs);
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
		case StlPackage.PRODUCTION_LINE__AREAS:
			return getAreas();
		case StlPackage.PRODUCTION_LINE__ITEMTYPE:
			return getItemtype();
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
		case StlPackage.PRODUCTION_LINE__AREAS:
			getAreas().clear();
			getAreas().addAll((Collection<? extends Area>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE__ITEMTYPE:
			getItemtype().clear();
			getItemtype().addAll((Collection<? extends ItemType>) newValue);
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
		case StlPackage.PRODUCTION_LINE__AREAS:
			getAreas().clear();
			return;
		case StlPackage.PRODUCTION_LINE__ITEMTYPE:
			getItemtype().clear();
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
		case StlPackage.PRODUCTION_LINE__AREAS:
			return areas != null && !areas.isEmpty();
		case StlPackage.PRODUCTION_LINE__ITEMTYPE:
			return itemtype != null && !itemtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductionLineImpl
