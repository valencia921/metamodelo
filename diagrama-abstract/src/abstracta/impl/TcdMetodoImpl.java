/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.TCDMetodo;
import abstracta.TCDParametro;
import abstracta.TipoRetorno;
import abstracta.Visibilidad;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCD Metodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.TCDMetodoImpl#getListaParametros <em>Lista Parametros</em>}</li>
 *   <li>{@link abstracta.impl.TCDMetodoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.TCDMetodoImpl#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.impl.TCDMetodoImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link abstracta.impl.TCDMetodoImpl#getSemantica <em>Semantica</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDMetodoImpl extends EObjectImpl implements TCDMetodo {
	/**
	 * The cached value of the '{@link #getListaParametros() <em>Lista Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDParametro> listaParametros;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected static final Visibilidad MODIFICADOR_ACCESO_EDEFAULT = Visibilidad.PUBLIC;

	/**
	 * The cached value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected Visibilidad modificadorAcceso = MODIFICADOR_ACCESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRetorno TIPO_RETORNO_EDEFAULT = TipoRetorno.STRING;

	/**
	 * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected TipoRetorno tipoRetorno = TIPO_RETORNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemantica() <em>Semantica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantica()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTICA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemantica() <em>Semantica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantica()
	 * @generated
	 * @ordered
	 */
	protected String semantica = SEMANTICA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDMetodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.TCD_METODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDParametro> getListaParametros() {
		if (listaParametros == null) {
			listaParametros = new EObjectContainmentEList<TCDParametro>(TCDParametro.class, this, AbstractaPackage.TCD_METODO__LISTA_PARAMETROS);
		}
		return listaParametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_METODO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad getModificadorAcceso() {
		return modificadorAcceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificadorAcceso(Visibilidad newModificadorAcceso) {
		Visibilidad oldModificadorAcceso = modificadorAcceso;
		modificadorAcceso = newModificadorAcceso == null ? MODIFICADOR_ACCESO_EDEFAULT : newModificadorAcceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_METODO__MODIFICADOR_ACCESO, oldModificadorAcceso, modificadorAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorno getTipoRetorno() {
		return tipoRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoRetorno(TipoRetorno newTipoRetorno) {
		TipoRetorno oldTipoRetorno = tipoRetorno;
		tipoRetorno = newTipoRetorno == null ? TIPO_RETORNO_EDEFAULT : newTipoRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_METODO__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemantica() {
		return semantica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantica(String newSemantica) {
		String oldSemantica = semantica;
		semantica = newSemantica;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_METODO__SEMANTICA, oldSemantica, semantica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.TCD_METODO__LISTA_PARAMETROS:
				return ((InternalEList<?>)getListaParametros()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.TCD_METODO__LISTA_PARAMETROS:
				return getListaParametros();
			case AbstractaPackage.TCD_METODO__NOMBRE:
				return getNombre();
			case AbstractaPackage.TCD_METODO__MODIFICADOR_ACCESO:
				return getModificadorAcceso();
			case AbstractaPackage.TCD_METODO__TIPO_RETORNO:
				return getTipoRetorno();
			case AbstractaPackage.TCD_METODO__SEMANTICA:
				return getSemantica();
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
			case AbstractaPackage.TCD_METODO__LISTA_PARAMETROS:
				getListaParametros().clear();
				getListaParametros().addAll((Collection<? extends TCDParametro>)newValue);
				return;
			case AbstractaPackage.TCD_METODO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.TCD_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso((Visibilidad)newValue);
				return;
			case AbstractaPackage.TCD_METODO__TIPO_RETORNO:
				setTipoRetorno((TipoRetorno)newValue);
				return;
			case AbstractaPackage.TCD_METODO__SEMANTICA:
				setSemantica((String)newValue);
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
			case AbstractaPackage.TCD_METODO__LISTA_PARAMETROS:
				getListaParametros().clear();
				return;
			case AbstractaPackage.TCD_METODO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.TCD_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso(MODIFICADOR_ACCESO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_METODO__TIPO_RETORNO:
				setTipoRetorno(TIPO_RETORNO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_METODO__SEMANTICA:
				setSemantica(SEMANTICA_EDEFAULT);
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
			case AbstractaPackage.TCD_METODO__LISTA_PARAMETROS:
				return listaParametros != null && !listaParametros.isEmpty();
			case AbstractaPackage.TCD_METODO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.TCD_METODO__MODIFICADOR_ACCESO:
				return modificadorAcceso != MODIFICADOR_ACCESO_EDEFAULT;
			case AbstractaPackage.TCD_METODO__TIPO_RETORNO:
				return tipoRetorno != TIPO_RETORNO_EDEFAULT;
			case AbstractaPackage.TCD_METODO__SEMANTICA:
				return SEMANTICA_EDEFAULT == null ? semantica != null : !SEMANTICA_EDEFAULT.equals(semantica);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", modificadorAcceso: ");
		result.append(modificadorAcceso);
		result.append(", tipoRetorno: ");
		result.append(tipoRetorno);
		result.append(", semantica: ");
		result.append(semantica);
		result.append(')');
		return result.toString();
	}

} //TCDMetodoImpl