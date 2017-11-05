/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.Costs;
import stl.NamedParameter;
import stl.Service;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ServiceImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getNamedparameter <em>Namedparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELIABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected double reliability = RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PROCESSING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected double processingTime = PROCESSING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamedparameter() <em>Namedparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedparameter()
	 * @generated
	 * @ordered
	 */
	protected NamedParameter namedparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(double newReliability) {
		double oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__RELIABILITY, oldReliability,
					reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(double newProcessingTime) {
		double oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__PROCESSING_TIME,
					oldProcessingTime, processingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedParameter getNamedparameter() {
		if (namedparameter != null && namedparameter.eIsProxy()) {
			InternalEObject oldNamedparameter = (InternalEObject) namedparameter;
			namedparameter = (NamedParameter) eResolveProxy(oldNamedparameter);
			if (namedparameter != oldNamedparameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.SERVICE__NAMEDPARAMETER,
							oldNamedparameter, namedparameter));
			}
		}
		return namedparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedParameter basicGetNamedparameter() {
		return namedparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedparameter(NamedParameter newNamedparameter) {
		NamedParameter oldNamedparameter = namedparameter;
		namedparameter = newNamedparameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__NAMEDPARAMETER, oldNamedparameter,
					namedparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.SERVICE__COST:
			return getCost();
		case StlPackage.SERVICE__RELIABILITY:
			return getReliability();
		case StlPackage.SERVICE__PROCESSING_TIME:
			return getProcessingTime();
		case StlPackage.SERVICE__NAMEDPARAMETER:
			if (resolve)
				return getNamedparameter();
			return basicGetNamedparameter();
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
		case StlPackage.SERVICE__COST:
			setCost((Integer) newValue);
			return;
		case StlPackage.SERVICE__RELIABILITY:
			setReliability((Double) newValue);
			return;
		case StlPackage.SERVICE__PROCESSING_TIME:
			setProcessingTime((Double) newValue);
			return;
		case StlPackage.SERVICE__NAMEDPARAMETER:
			setNamedparameter((NamedParameter) newValue);
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
		case StlPackage.SERVICE__COST:
			setCost(COST_EDEFAULT);
			return;
		case StlPackage.SERVICE__RELIABILITY:
			setReliability(RELIABILITY_EDEFAULT);
			return;
		case StlPackage.SERVICE__PROCESSING_TIME:
			setProcessingTime(PROCESSING_TIME_EDEFAULT);
			return;
		case StlPackage.SERVICE__NAMEDPARAMETER:
			setNamedparameter((NamedParameter) null);
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
		case StlPackage.SERVICE__COST:
			return cost != COST_EDEFAULT;
		case StlPackage.SERVICE__RELIABILITY:
			return reliability != RELIABILITY_EDEFAULT;
		case StlPackage.SERVICE__PROCESSING_TIME:
			return processingTime != PROCESSING_TIME_EDEFAULT;
		case StlPackage.SERVICE__NAMEDPARAMETER:
			return namedparameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Costs.class) {
			switch (derivedFeatureID) {
			case StlPackage.SERVICE__COST:
				return StlPackage.COSTS__COST;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Costs.class) {
			switch (baseFeatureID) {
			case StlPackage.COSTS__COST:
				return StlPackage.SERVICE__COST;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cost: ");
		result.append(cost);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", processingTime: ");
		result.append(processingTime);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
