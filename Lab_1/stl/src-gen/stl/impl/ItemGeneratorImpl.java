/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.ItemGenerator;
import stl.ItemType;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ItemGeneratorImpl#getItemtypes <em>Itemtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemGeneratorImpl extends ComponentImpl implements ItemGenerator {
	/**
	 * The cached value of the '{@link #getItemtypes() <em>Itemtypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtypes()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.ITEM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemtypes() {
		if (itemtypes != null && itemtypes.eIsProxy()) {
			InternalEObject oldItemtypes = (InternalEObject) itemtypes;
			itemtypes = (ItemType) eResolveProxy(oldItemtypes);
			if (itemtypes != oldItemtypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.ITEM_GENERATOR__ITEMTYPES,
							oldItemtypes, itemtypes));
			}
		}
		return itemtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemtypes() {
		return itemtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtypes(ItemType newItemtypes) {
		ItemType oldItemtypes = itemtypes;
		itemtypes = newItemtypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.ITEM_GENERATOR__ITEMTYPES, oldItemtypes,
					itemtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.ITEM_GENERATOR__ITEMTYPES:
			if (resolve)
				return getItemtypes();
			return basicGetItemtypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.ITEM_GENERATOR__ITEMTYPES:
			setItemtypes((ItemType) newValue);
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
		case StlPackage.ITEM_GENERATOR__ITEMTYPES:
			setItemtypes((ItemType) null);
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
		case StlPackage.ITEM_GENERATOR__ITEMTYPES:
			return itemtypes != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemGeneratorImpl
