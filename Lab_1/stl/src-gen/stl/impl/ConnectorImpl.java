/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import stl.Connector;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ConnectorImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link stl.impl.ConnectorImpl#getSourceComponent <em>Source Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected Slot targetComponent;

	/**
	 * The cached value of the '{@link #getSourceComponent() <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponent()
	 * @generated
	 * @ordered
	 */
	protected Slot sourceComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getTargetComponent() {
		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject) targetComponent;
			targetComponent = (Slot) eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTOR__TARGET_COMPONENT,
							oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetTargetComponent() {
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetComponent(Slot newTargetComponent, NotificationChain msgs) {
		Slot oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTOR__TARGET_COMPONENT, oldTargetComponent, newTargetComponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponent(Slot newTargetComponent) {
		if (newTargetComponent != targetComponent) {
			NotificationChain msgs = null;
			if (targetComponent != null)
				msgs = ((InternalEObject) targetComponent).eInverseRemove(this, StlPackage.SLOT__INCOMING_CONNETOR,
						Slot.class, msgs);
			if (newTargetComponent != null)
				msgs = ((InternalEObject) newTargetComponent).eInverseAdd(this, StlPackage.SLOT__INCOMING_CONNETOR,
						Slot.class, msgs);
			msgs = basicSetTargetComponent(newTargetComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTOR__TARGET_COMPONENT,
					newTargetComponent, newTargetComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getSourceComponent() {
		if (sourceComponent != null && sourceComponent.eIsProxy()) {
			InternalEObject oldSourceComponent = (InternalEObject) sourceComponent;
			sourceComponent = (Slot) eResolveProxy(oldSourceComponent);
			if (sourceComponent != oldSourceComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTOR__SOURCE_COMPONENT,
							oldSourceComponent, sourceComponent));
			}
		}
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetSourceComponent() {
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceComponent(Slot newSourceComponent, NotificationChain msgs) {
		Slot oldSourceComponent = sourceComponent;
		sourceComponent = newSourceComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTOR__SOURCE_COMPONENT, oldSourceComponent, newSourceComponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceComponent(Slot newSourceComponent) {
		if (newSourceComponent != sourceComponent) {
			NotificationChain msgs = null;
			if (sourceComponent != null)
				msgs = ((InternalEObject) sourceComponent).eInverseRemove(this, StlPackage.SLOT__OUTGOING_CONNECTOR,
						Slot.class, msgs);
			if (newSourceComponent != null)
				msgs = ((InternalEObject) newSourceComponent).eInverseAdd(this, StlPackage.SLOT__OUTGOING_CONNECTOR,
						Slot.class, msgs);
			msgs = basicSetSourceComponent(newSourceComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTOR__SOURCE_COMPONENT,
					newSourceComponent, newSourceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			if (targetComponent != null)
				msgs = ((InternalEObject) targetComponent).eInverseRemove(this, StlPackage.SLOT__INCOMING_CONNETOR,
						Slot.class, msgs);
			return basicSetTargetComponent((Slot) otherEnd, msgs);
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			if (sourceComponent != null)
				msgs = ((InternalEObject) sourceComponent).eInverseRemove(this, StlPackage.SLOT__OUTGOING_CONNECTOR,
						Slot.class, msgs);
			return basicSetSourceComponent((Slot) otherEnd, msgs);
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
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			return basicSetTargetComponent(null, msgs);
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			return basicSetSourceComponent(null, msgs);
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
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			if (resolve)
				return getTargetComponent();
			return basicGetTargetComponent();
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			if (resolve)
				return getSourceComponent();
			return basicGetSourceComponent();
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
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			setTargetComponent((Slot) newValue);
			return;
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			setSourceComponent((Slot) newValue);
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
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			setTargetComponent((Slot) null);
			return;
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			setSourceComponent((Slot) null);
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
		case StlPackage.CONNECTOR__TARGET_COMPONENT:
			return targetComponent != null;
		case StlPackage.CONNECTOR__SOURCE_COMPONENT:
			return sourceComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
