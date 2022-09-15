/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.TCDClase;
import abstracta.TCDRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCD Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.TCDRelacionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.impl.TCDRelacionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link abstracta.impl.TCDRelacionImpl#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TCDRelacionImpl extends EObjectImpl implements TCDRelacion {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TCDClase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TCDClase target;

	/**
	 * The default value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGAVILIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected String navegavilidad = NAVEGAVILIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.TCD_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TCDClase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.TCD_RELACION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TCDClase newSource) {
		TCDClase oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_RELACION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TCDClase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.TCD_RELACION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TCDClase newTarget) {
		TCDClase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_RELACION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegavilidad() {
		return navegavilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegavilidad(String newNavegavilidad) {
		String oldNavegavilidad = navegavilidad;
		navegavilidad = newNavegavilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_RELACION__NAVEGAVILIDAD, oldNavegavilidad, navegavilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.TCD_RELACION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AbstractaPackage.TCD_RELACION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AbstractaPackage.TCD_RELACION__NAVEGAVILIDAD:
				return getNavegavilidad();
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
			case AbstractaPackage.TCD_RELACION__SOURCE:
				setSource((TCDClase)newValue);
				return;
			case AbstractaPackage.TCD_RELACION__TARGET:
				setTarget((TCDClase)newValue);
				return;
			case AbstractaPackage.TCD_RELACION__NAVEGAVILIDAD:
				setNavegavilidad((String)newValue);
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
			case AbstractaPackage.TCD_RELACION__SOURCE:
				setSource((TCDClase)null);
				return;
			case AbstractaPackage.TCD_RELACION__TARGET:
				setTarget((TCDClase)null);
				return;
			case AbstractaPackage.TCD_RELACION__NAVEGAVILIDAD:
				setNavegavilidad(NAVEGAVILIDAD_EDEFAULT);
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
			case AbstractaPackage.TCD_RELACION__SOURCE:
				return source != null;
			case AbstractaPackage.TCD_RELACION__TARGET:
				return target != null;
			case AbstractaPackage.TCD_RELACION__NAVEGAVILIDAD:
				return NAVEGAVILIDAD_EDEFAULT == null ? navegavilidad != null : !NAVEGAVILIDAD_EDEFAULT.equals(navegavilidad);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (navegavilidad: ");
		result.append(navegavilidad);
		result.append(')');
		return result.toString();
	}

} //TCDRelacionImpl
