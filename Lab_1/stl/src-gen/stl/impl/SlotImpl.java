/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Connector;
import stl.ItemType;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.SlotImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#getIncomingConnetor <em>Incoming Connetor</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#getOutgoingConnector <em>Outgoing Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SlotImpl extends NamedElementImpl implements Slot {
	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemtype;

	/**
	 * The cached value of the '{@link #getIncomingConnetor() <em>Incoming Connetor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnetor()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> incomingConnetor;

	/**
	 * The cached value of the '{@link #getOutgoingConnector() <em>Outgoing Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> outgoingConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemtype() {
		if (itemtype != null && itemtype.eIsProxy()) {
			InternalEObject oldItemtype = (InternalEObject) itemtype;
			itemtype = (ItemType) eResolveProxy(oldItemtype);
			if (itemtype != oldItemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.SLOT__ITEMTYPE, oldItemtype,
							itemtype));
			}
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemtype() {
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtype(ItemType newItemtype) {
		ItemType oldItemtype = itemtype;
		itemtype = newItemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__ITEMTYPE, oldItemtype, itemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getIncomingConnetor() {
		if (incomingConnetor == null) {
			incomingConnetor = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					StlPackage.SLOT__INCOMING_CONNETOR, StlPackage.CONNECTOR__TARGET_COMPONENT);
		}
		return incomingConnetor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOutgoingConnector() {
		if (outgoingConnector == null) {
			outgoingConnector = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					StlPackage.SLOT__OUTGOING_CONNECTOR, StlPackage.CONNECTOR__SOURCE_COMPONENT);
		}
		return outgoingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.SLOT__INCOMING_CONNETOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConnetor()).basicAdd(otherEnd, msgs);
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingConnector()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.SLOT__INCOMING_CONNETOR:
			return ((InternalEList<?>) getIncomingConnetor()).basicRemove(otherEnd, msgs);
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			return ((InternalEList<?>) getOutgoingConnector()).basicRemove(otherEnd, msgs);
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
		case StlPackage.SLOT__ITEMTYPE:
			if (resolve)
				return getItemtype();
			return basicGetItemtype();
		case StlPackage.SLOT__INCOMING_CONNETOR:
			return getIncomingConnetor();
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			return getOutgoingConnector();
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
		case StlPackage.SLOT__ITEMTYPE:
			setItemtype((ItemType) newValue);
			return;
		case StlPackage.SLOT__INCOMING_CONNETOR:
			getIncomingConnetor().clear();
			getIncomingConnetor().addAll((Collection<? extends Connector>) newValue);
			return;
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			getOutgoingConnector().clear();
			getOutgoingConnector().addAll((Collection<? extends Connector>) newValue);
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
		case StlPackage.SLOT__ITEMTYPE:
			setItemtype((ItemType) null);
			return;
		case StlPackage.SLOT__INCOMING_CONNETOR:
			getIncomingConnetor().clear();
			return;
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			getOutgoingConnector().clear();
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
		case StlPackage.SLOT__ITEMTYPE:
			return itemtype != null;
		case StlPackage.SLOT__INCOMING_CONNETOR:
			return incomingConnetor != null && !incomingConnetor.isEmpty();
		case StlPackage.SLOT__OUTGOING_CONNECTOR:
			return outgoingConnector != null && !outgoingConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
